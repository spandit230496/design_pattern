# 📘 System Design Preparation (HLD)

A complete guide for System Design interviews including:
- Functional Requirements
- Non-Functional Requirements
- Database Selection
- Types of Databases & Features

---

## 🧠 HLD vs LLD

| HLD | LLD |
|-----|-----|
| Architecture | Code |
| Scalability | Design Patterns |
| Distributed Systems | Classes & Objects |

---

# 📊 Read-Heavy vs Write-Heavy Databases

## 🔥 Overview

| Category | Database / System | Type | Why Used |
|----------|------------------|------|----------|
| Read-heavy | MySQL (with replicas) | SQL | Fast reads with indexing + read replicas |
| Read-heavy | PostgreSQL | SQL | Strong queries + optimized reads |
| Read-heavy | Redis | In-memory | Ultra-fast reads (cache) |
| Read-heavy | Memcached | In-memory | Simple high-speed caching |
| Read-heavy | Elasticsearch | Search DB | Full-text search, fast querying |
| Read-heavy | Snowflake | Analytics | Optimized for heavy read queries |
| Read-heavy | BigQuery | Analytics | Large-scale data analysis |

---

## ✍️ Write-Heavy Systems

| Category | Database / System | Type | Why Used |
|----------|------------------|------|----------|
| Write-heavy | Cassandra | NoSQL | High write throughput, distributed |
| Write-heavy | DynamoDB | NoSQL | Auto-scaling, fast writes |
| Write-heavy | Kafka | Streaming | Handles millions of writes/sec |
| Write-heavy | InfluxDB | Time-series | Continuous data ingestion |
| Write-heavy | HBase | NoSQL | Big data, write-heavy workloads |

---

## ⚖️ Balanced (Read + Write)

| Category | Database / System | Type | Why Used |
|----------|------------------|------|----------|
| Balanced | MongoDB | NoSQL | Flexible schema, moderate reads/writes |
| Balanced | MySQL | SQL | Good for general-purpose apps |
| Balanced | PostgreSQL | SQL | Strong consistency + performance |

---

## 🚀 Key Takeaways

- **Read-heavy systems** → Use caching (Redis) + read replicas  
- **Write-heavy systems** → Use distributed DBs (Cassandra, DynamoDB)  
- **Balanced systems** → Use relational DBs (PostgreSQL, MySQL)  

---

## 🧠 Interview Cheat Sheet

Read-heavy  → Redis, Elasticsearch  
Write-heavy → Cassandra, DynamoDB, Kafka  
Balanced    → MySQL, PostgreSQL, MongoDB  

# 🔥 High-Level Design (HLD)

---

## 🌐 Social Media & Communication

### 📌 Design Instagram

#### ✅ Functional Requirements
- User authentication
- Upload posts (image/video)
- Like, comment, share
- Follow/unfollow
- Feed generation

#### ⚙️ Non-Functional Requirements
- High availability
- Low latency
- Scalability
- Eventual consistency

#### 🗄️ Database Choice
- User → SQL (PostgreSQL)
- Posts/Feeds → NoSQL (Cassandra)
- Cache → Redis
- Media → S3 + CDN

---

### 📌 Design WhatsApp

#### 🗄️ Database Choice
- Messages → NoSQL (Cassandra)
- Metadata → SQL
- Queue → Kafka
- Cache → Redis

---

### 📌 Design Twitter (X)

#### 🗄️ Database Choice
- Tweets → NoSQL
- Users → SQL
- Timeline → Redis (cache)

---

## 🎥 Media Platforms

### 📌 Design YouTube

#### 🗄️ Database Choice
- Metadata → SQL
- Video → Object Storage (S3)
- Analytics → BigQuery
- Cache → CDN + Redis

---

## 🛒 E-commerce Systems

### 📌 Design Amazon

#### 🗄️ Database Choice
- Orders/Payments → SQL
- Catalog → NoSQL
- Search → Elasticsearch
- Cache → Redis

---

## 🚗 Transportation

### 📌 Design Uber

#### 🗄️ Database Choice
- Trips → NoSQL
- Users → SQL
- Location → Redis / Geo DB

---

## 🔗 Core Problems

### 📌 URL Shortener

#### 🗄️ Database Choice
- Mapping → NoSQL
- Cache → Redis

---

---

# System Design Questions (HLD + LLD)

---

# 🔥 High-Level Design (HLD) Questions

> Focus: Scalability, architecture, distributed systems

## 🌐 Social Media & Communication
- Design Instagram  
- Design Twitter (X)  
- Design Facebook News Feed  
- Design WhatsApp  
- Design Slack  
- Design Discord  

## 🎥 Media & Content Platforms
- Design YouTube  
- Design Netflix  
- Design Spotify  
- Design TikTok  

## 🛒 E-commerce & Business Systems
- Design Amazon / Flipkart  
- Design Online Food Delivery (Swiggy/Zomato)  
- Design Online Auction System  
- Design Subscription/Billing System  

## 🚗 Transportation & Booking
- Design Uber / Ola  
- Design Ride Pooling System  
- Design Cab Dispatch System  
- Design Flight Booking System  
- Design Train Ticket Booking (IRCTC-like)  
- Design Hotel Booking System  

## 📂 Storage & File Systems
- Design Google Drive  
- Design Dropbox  
- Design Distributed File Storage System  
- Design Photo Storage System  

## 🔗 Core System Problems
- Design URL Shortener (Bitly)  
- Design API Rate Limiter  
- Design Distributed Cache (Redis-like)  
- Design Search Engine (basic Google-like)  
- Design CDN (Content Delivery Network)  
- Design Logging & Monitoring System  
- Design Notification System  
- Design Recommendation System  

## 💬 Real-Time Systems
- Design Real-time Chat System  
- Design Live Location Tracking  
- Design Live Streaming System  
- Design Online Gaming Backend  

## 📊 Enterprise / Backend Systems
- Design Order Management System  
- Design Inventory Management System  
- Design Payment Gateway System  
- Design Workflow/Approval System  
- Design Multi-tenant SaaS system  



# 🧠 Types of Databases & Their Features

---

## 🟦 1. Relational Database (SQL)

### Examples:
- PostgreSQL, MySQL, Oracle

### ✅ Features
- Structured schema (tables, rows, columns)
- ACID properties (strong consistency)
- Supports JOINs
- Transactions support
- Vertical scaling (mainly)

### 📌 Best Use Cases
- Banking systems
- Payment systems
- Order management
- Any system requiring strong consistency

---

## 🟩 2. NoSQL Databases

---

### 🔹 Key-Value Store

#### Examples:
- Redis, DynamoDB

#### ✅ Features
- Simple key → value mapping
- Extremely fast (O(1) access)
- In-memory support
- High scalability

#### 📌 Use Cases
- Caching
- Session storage
- Rate limiting

---

### 🔹 Document Database

#### Examples:
- MongoDB, CouchDB

#### ✅ Features
- JSON-like flexible schema
- No fixed structure
- Easy horizontal scaling

#### 📌 Use Cases
- User profiles
- Content management
- Catalog systems

---

### 🔹 Column-Family Database

#### Examples:
- Cassandra, HBase

#### ✅ Features
- High write throughput
- Distributed by default
- Handles huge data
- Eventual consistency

#### 📌 Use Cases
- Messaging systems
- Time-series data
- Logs/analytics

---

### 🔹 Graph Database

#### Examples:
- Neo4j

#### ✅ Features
- Stores relationships efficiently
- Graph traversal (very fast)
- Nodes + edges model

#### 📌 Use Cases
- Social networks
- Recommendation systems
- Fraud detection

---

## 🟨 3. Search Databases

### Examples:
- Elasticsearch, Solr

### ✅ Features
- Full-text search
- Ranking & relevance
- Fast filtering
- Inverted indexing

### 📌 Use Cases
- Product search
- Log analysis
- Search engines

---

## 🟧 4. In-Memory Databases

### Examples:
- Redis, Memcached

### ✅ Features
- Extremely low latency
- Data stored in RAM
- Supports TTL (expiry)
- Pub/Sub support

### 📌 Use Cases
- Caching
- Real-time analytics
- Leaderboards

---

## 🟥 5. Distributed File Storage

### Examples:
- Amazon S3, HDFS

### ✅ Features
- Stores large files (videos/images)
- Highly durable
- Scalable
- Cost-efficient

### 📌 Use Cases
- Media storage
- Backup systems
- Big data

---

## 🟪 6. Data Warehouses / Analytics DB

### Examples:
- BigQuery, Redshift, Snowflake

### ✅ Features
- Optimized for analytics queries
- Columnar storage
- Handles TB/PB data
- Batch processing

### 📌 Use Cases
- Business analytics
- Reporting
- Data pipelines

---

## 🟫 7. Message Queues / Streaming Systems

### Examples:
- Kafka, RabbitMQ

### ✅ Features
- Asynchronous communication
- High throughput
- Fault-tolerant
- Event-driven architecture

### 📌 Use Cases
- Notification systems
- Event streaming
- Microservices communication

---

# 🧠 Database Selection Cheat Sheet

| Requirement | Best Choice |
|------------|------------|
| Strong consistency | SQL |
| High scalability | NoSQL |
| Ultra-fast reads | Redis |
| Search functionality | Elasticsearch |
| Large files | S3 |
| Real-time streaming | Kafka |
| Analytics | BigQuery |

---

    