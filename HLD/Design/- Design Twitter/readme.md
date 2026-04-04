# 🐦 Twitter System Design (HLD + DB + Scaling)

---

## 📌 Overview

This document covers the high-level design of a Twitter-like system including:

* Functional & Non-functional requirements
* API Design
* Database Design & Selection
* Scalable Architecture
* Feed System (Core Problem)

---

## ✅ Functional Requirements

* User Signup / Signin
* Follow / Unfollow users
* Create Tweet (text, image, video)
* Like / Comment / Retweet
* View News Feed
* Notifications

---

## ⚙️ Non-Functional Requirements

* High Availability
* Eventual Consistency
* Low Latency (<200ms)
* Read-heavy system
* Highly Scalable

---

## 📊 Back-of-the-Envelope Calculation

* 1 Billion Daily Active Users (DAU)
* 5 Tweets/User/Day → **5 Billion Tweets/day**

### Storage:

* Avg media size = 1 MB
* Daily storage = **5 PB/day**
* Yearly ≈ **~1.8 EB**

👉 Requires:

* Distributed storage (S3-like)
* CDN for fast delivery

---

## 🔗 API Design

### Auth

* `POST /signup`
* `POST /signin`

### User Actions

* `POST /follow`
* `POST /unfollow`

### Tweets

* `POST /tweet`
* `POST /like/{tweetId}`
* `POST /comment/{tweetId}`
* `POST /retweet/{tweetId}`

### Feed

* `GET /feed/{userId}`

### Media

* `POST /upload/media`

---

## 🗄️ Database Design

### 👤 UserProfile (SQL)

```
user_id (PK)
username
email
fullname
created_at
is_active
```

---

### 📝 Tweet (NoSQL)

```
tweet_id (PK)
user_id
content
media_id
created_at
like_count
comment_count
retweet_count
```

---

### 🤝 Follow (Graph / NoSQL)

```
follower_id
followee_id
created_at
```

---

### ❤️ Like (NoSQL)

```
user_id
tweet_id
created_at
```

---

### 💬 Comment (NoSQL)

```
comment_id (PK)
user_id
tweet_id
content
created_at
```

---

### 🖼️ Media (Object Storage)

```
media_id
user_id
media_url
media_type
```

---

## 📊 Database Selection by Functionality

| Feature        | Database          | Type           | Reason                |
| -------------- | ----------------- | -------------- | --------------------- |
| User Profile   | PostgreSQL        | SQL            | Strong consistency    |
| Authentication | PostgreSQL        | SQL            | Secure + ACID         |
| Tweets         | Cassandra         | NoSQL          | High write throughput |
| Feed           | Redis + Cassandra | Cache + NoSQL  | Fast reads            |
| Follow         | Neo4j / Cassandra | Graph / NoSQL  | Relationship queries  |
| Likes          | Cassandra         | NoSQL          | High writes           |
| Comments       | MongoDB           | NoSQL          | Flexible schema       |
| Notifications  | Kafka + Redis     | Queue + Cache  | Async + fast          |
| Media          | S3                | Object Storage | Large files           |
| Search         | Elasticsearch     | Search DB      | Fast search           |
| Analytics      | BigQuery          | Warehouse      | Heavy queries         |

---

## 🏗️ High-Level Architecture

```
Client (Mobile/Web)
        ↓
   API Gateway
        ↓
----------------------------------
| Auth Service                  |
| User Service                  |
| Tweet Service                 |
| Feed Service                  |
| Notification Service          |
----------------------------------
        ↓
----------------------------------
| SQL DB (User Data)            |
| NoSQL DB (Tweets, Likes)      |
| Cache (Redis)                 |
| Queue (Kafka)                 |
| Object Storage (S3)           |
----------------------------------
        ↓
        CDN
```

---

## 🧠 Feed Design (Core Problem)

### 🔹 Fan-out on Write (Push Model)

* When user posts → push to followers’ feeds
* Fast read, heavy write

### 🔹 Fan-out on Read (Pull Model)

* Fetch tweets dynamically
* Slow read, light write

### ✅ Hybrid Approach (Used in real systems)

* Push for normal users
* Pull for celebrities

---

## ⚡ Scaling Strategies

### Caching

* Redis for feeds & tweets
* Reduces DB load

### Database Scaling

* Sharding by `user_id`
* NoSQL for horizontal scaling

### Async Processing

* Kafka for:

  * Notifications
  * Feed updates

### Media Optimization

* Store in S3
* Serve via CDN

---

## 🔔 Notification System

* Event-driven architecture
* Trigger events:

  * Like
  * Comment
  * Follow

---

## ⚖️ Trade-offs

| Decision      | Choice   | Reason                     |
| ------------- | -------- | -------------------------- |
| Consistency   | Eventual | Better performance         |
| Feed Strategy | Hybrid   | Balance read/write         |
| DB            | Polyglot | Right DB for each use case |
| Caching       | Redis    | Low latency                |

---
