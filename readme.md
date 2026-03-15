# 🚀 System Design (HLD + LLD) Complete Syllabus

This repository contains a **structured roadmap to learn System Design**, including:

* **High-Level Design (HLD)** → Large-scale system architecture
* **Low-Level Design (LLD)** → Object-oriented design & implementation

This syllabus helps developers prepare for:

* System Design Interviews
* Backend Engineering Roles
* Distributed Systems Development

---

# 📚 Table of Contents

1. High-Level Design (HLD)
2. Architecture Fundamentals
3. System Components
4. Scalability Concepts
5. Performance & Reliability
6. System Communication
7. Observability & Security
8. HLD Interview Problems
9. Low-Level Design (LLD)
10. Design Patterns
11. Database & API Design
12. LLD Interview Problems

---

# Part I: High-Level Design (HLD)

High-Level Design focuses on **designing scalable and distributed systems**.

---

# 1️⃣ System Requirements

Important system qualities when designing large-scale applications.

* Scalability
* Availability
* Latency
* Throughput
* Consistency
* Fault Tolerance
* Reliability
* Maintainability
* Security
* Observability
* Durability

---

# 2️⃣ Architecture Fundamentals

## Monolithic Architecture

Single codebase containing the entire application.

## Microservices Architecture

Application divided into independent services.

## Client-Server Model

Clients send requests and servers respond with data.

Example:

Client → Server → Database

## Layered Architecture

Typical layers:

1. Presentation Layer
2. Business Logic Layer
3. Data Access Layer

## Event-Driven Architecture

Components communicate using events.

Example technologies:

* Kafka
* RabbitMQ

## Service-Oriented Architecture (SOA)

Applications composed of reusable network services.

---

# 3️⃣ System Components

## API Gateway

Acts as the entry point for client requests.

Responsibilities:

* Request routing
* Authentication
* Rate limiting
* Logging

---

## Load Balancer

Distributes incoming traffic across servers.

Types:

* Round Robin
* Least Connections
* IP Hash

Examples:

* Nginx
* AWS ELB

---

## Application Servers

Responsible for executing business logic.

Examples:

* Node.js
* Django
* Spring Boot
* Flask

---

## Database Systems

### SQL

* MySQL
* PostgreSQL

### NoSQL

* MongoDB
* Cassandra
* DynamoDB

---

## Caching Layer

Stores frequently accessed data.

Examples:

* Redis
* Memcached

Benefits:

* Faster response
* Reduced database load

---

## Message Queue / Stream

Used for asynchronous processing.

Examples:

* Kafka
* RabbitMQ
* AWS SQS

---

## CDN (Content Delivery Network)

Delivers content from servers closest to users.

Examples:

* Cloudflare
* AWS CloudFront

---

## Object Storage

Used for storing files and media.

Examples:

* Amazon S3
* Google Cloud Storage
* MinIO

---

# 4️⃣ Scalability Concepts

## Horizontal Scaling

Adding more machines.

Example:

Server1 + Server2 + Server3

---

## Vertical Scaling

Increasing resources of one machine.

Example:

More RAM or CPU.

---

## Replication

Copying data across multiple servers.

Benefits:

* Fault tolerance
* Read scalability

---

## Sharding / Partitioning

Splitting large databases.

Example:

Users 1–1M → DB1
Users 1M–2M → DB2

---

## Consistent Hashing

Efficiently distributes data across nodes.

---

## CAP Theorem

A distributed system can guarantee only two of:

* Consistency
* Availability
* Partition Tolerance

---

# 5️⃣ Performance & Reliability

## Caching Strategies

* Write Through
* Write Behind

---

## Database Optimization

* Indexing
* Query optimization

---

## Connection Pooling

Reuse database connections.

---

## Fault Tolerance

* Retry mechanisms
* Failover systems

---

## Data Backup & Recovery

Methods:

* Snapshots
* Incremental backups

---

## Circuit Breaker Pattern

Prevents cascading failures.

States:

* Closed
* Open
* Half-open

---

# 6️⃣ System Communication

## Synchronous Communication

Client waits for response.

Examples:

* REST APIs
* gRPC

---

## Asynchronous Communication

Client does not wait.

Examples:

* Message queues
* Event systems

---

## Communication APIs

* REST
* GraphQL
* gRPC

---

## Messaging Patterns

* Pub/Sub
* Event Sourcing
* CQRS

---

# 7️⃣ Observability & Security

## Observability

* Logging
* Monitoring
* Alerting

Tools:

* Prometheus
* Grafana
* ELK Stack

---

## Security

### Authentication

* OAuth2
* JWT

### Authorization

Access control mechanisms.

### Rate Limiting

Limits requests per user/IP.

### Audit Trails

Tracks user actions.

---

# 8️⃣ HLD Interview Problems

## Beginner

* What happens when you type `google.com` in a browser?
* Design a **URL Shortener**
* Design a **Rate Limiter**
* Design an **API Gateway**
* How does a **Load Balancer** work?
* Explain **CAP Theorem**
* What is a **Bloom Filter**?

---

## Intermediate

* Design a **File Storage System (Google Drive)**
* Design a **Notification System**
* Design a **Logging System**
* Design a **Metrics & Monitoring System**
* Design a **Search System**
* Design a **Distributed Cache (Redis)**

---

## Advanced

* Design **Twitter News Feed**
* Design **WhatsApp Chat System**
* Design **YouTube**
* Design **Uber / Ride Sharing**
* Design **Amazon / Flipkart**
* Design **Instagram**
* Design **Netflix Streaming**
* Design **Google Maps**
* Design **Payment System**

---

# Part II: Low-Level Design (LLD)

Low-Level Design focuses on **object-oriented design and class structure**.

---

# 1️⃣ OOP Fundamentals

* Class & Object
* Abstraction
* Encapsulation
* Inheritance
* Polymorphism
* Composition vs Inheritance
* SOLID Principles

---

# 2️⃣ UML (Unified Modeling Language)

Used to visualize system structure.

### Diagrams

* Class Diagram
* Object Diagram
* Component Diagram
* Deployment Diagram

---

# 3️⃣ Design Patterns

## Creational Patterns

* Factory Pattern
* Abstract Factory Pattern
* Singleton Pattern
* Prototype Pattern
* Builder Pattern

---

## Structural Patterns

* Adapter Pattern
* Bridge Pattern
* Composite Pattern
* Decorator Pattern
* Facade Pattern
* Flyweight Pattern
* Proxy Pattern

---

## Behavioral Patterns

* Chain of Responsibility
* Command Pattern
* Interpreter Pattern
* Iterator Pattern
* Mediator Pattern
* Memento Pattern
* Observer Pattern
* State Pattern
* Strategy Pattern
* Template Method
* Visitor Pattern

---

# 4️⃣ Microservices & Cloud Patterns

### Decomposition

* Business Capability
* Sub-domain
* Strangler Fig
* Sidecar
* Bulkhead

### Data Management

* Database per Service
* Saga Pattern
* CQRS
* Event Sourcing

### API Patterns

* API Gateway
* Gateway Routing
* Backend for Frontend (BFF)
* Aggregator Pattern

### Observability

* Log Aggregation
* Distributed Tracing
* Health Checks
* Service Discovery
* Blue-Green Deployment

---

# 5️⃣ Database & API Design

Steps for designing systems:

1. Identify Entities
2. Define Relationships
3. Design Database Schema
4. Design APIs
5. Consider:

* Caching
* Scaling
* Security
* Optimization

---

# 6️⃣ LLD Interview Problems

## Easy

* Design Vending Machine
* Design Parking Lot
* Design Tic Tac Toe
* Design Snake & Ladder
* Design Library Management
* Design ATM
* Design Movie Ticket Booking
* Design Hotel Booking
* Design Splitwise

---

## Medium

* Design Elevator System
* Design LRU / LFU Cache
* Design Rate Limiter
* Design File Storage
* Design Online Chess
* Design Notification System
* Design Food Delivery (Swiggy/Zomato)
* Design Task Scheduler
* Design Key Value Store
* Design Pub/Sub System

---

## Advanced

* Design Amazon Cart System
* Design Ride Sharing System
* Design News Feed
* Design Chat System
* Design Payment System
* Design Stock Exchange
* Design Logging Framework
* Design Metrics Collector
* Design Online Exam System
* Design Airline Reservation



------------------------------------------------------------------------------


# 🚀 Design Patterns with Real World Use Cases

This repository provides a **complete overview of all 23 Gang of Four (GoF) Design Patterns** along with their **real-world system design use cases**.

Design patterns help developers build **scalable, maintainable, and reusable software systems** and are frequently asked in **Low-Level Design (LLD) interviews**.

---

# 📚 Table of Contents

1. Creational Design Patterns
2. Structural Design Patterns
3. Behavioral Design Patterns
4. One Page Interview Cheat Sheet

---

# 1️⃣ Creational Design Patterns

Creational patterns focus on **object creation mechanisms**.

---

## Singleton Pattern

Ensures **only one instance of a class exists**.

### Use Cases

* Logger
* Configuration Manager
* Database Connection Pool
* Cache Manager
* Thread Pool
* ID Generator in URL Shortener

### Example

```java
public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
```

---

## Factory Method Pattern

Creates objects **without exposing the creation logic**.

### Use Cases

* Payment gateway creation
* Notification services
* Parser creation (JSON/XML)
* Document processors

### Example

```java
interface Payment {
    void pay();
}

class UpiPayment implements Payment {
    public void pay() {
        System.out.println("Paying using UPI");
    }
}

class PaymentFactory {
    public static Payment getPayment(String type) {
        if(type.equals("UPI")) return new UpiPayment();
        return null;
    }
}
```

---

## Abstract Factory Pattern

Creates **families of related objects**.

### Use Cases

* Cloud provider SDKs
* UI frameworks
* Database drivers

Example:

```
AWSFactory → S3, EC2
GCPFactory → GCS, Compute Engine
AzureFactory → Blob, VM
```

---

## Builder Pattern

Constructs **complex objects step by step**.

### Use Cases

* SQL Query Builder
* HTTP Request Builder
* Configuration Objects
* Docker Image Builder

Example:

```
HttpRequest request = HttpRequest.builder()
                    .url("api.com")
                    .method("GET")
                    .build();
```

---

## Prototype Pattern

Creates new objects **by cloning existing objects**.

### Use Cases

* Game objects
* Template documents
* Virtual machine templates
* Kubernetes pod templates

---

# 2️⃣ Structural Design Patterns

Structural patterns deal with **class composition and relationships**.

---

## Adapter Pattern

Allows **incompatible interfaces to work together**.

### Use Cases

* Payment gateway adapters
* Legacy system integration
* Charger adapters

Example:

```
StripeAdapter
PaypalAdapter
RazorpayAdapter
```

---

## Bridge Pattern

Separates **abstraction from implementation**.

### Use Cases

* Notification systems
* Messaging services
* Database drivers

Example:

```
Notification
 ├ Email
 ├ SMS
 └ Push
```

---

## Composite Pattern

Treats **individual objects and groups uniformly**.

### Use Cases

* File systems
* Organization hierarchies
* UI component trees

Example:

```
Folder
 ├ File
 └ Folder
```

---

## Decorator Pattern

Adds functionality **dynamically**.

### Use Cases

* HTTP middleware
* Logging wrappers
* Compression
* Encryption

Example:

```
Request → Logging → Authentication → Handler
```

---

## Facade Pattern

Provides **simple interface to complex subsystems**.

### Use Cases

* API Gateway
* Payment gateway SDK
* Library wrappers

Example:

```
PaymentFacade
 ├ Fraud Check
 ├ Payment Processing
 └ Notification
```

---

## Flyweight Pattern

Reduces memory usage by **sharing common objects**.

### Use Cases

* Map markers
* Game engines
* Text editors
* Icon rendering

---

## Proxy Pattern

Provides **controlled access to another object**.

### Use Cases

* Redis caching
* CDN proxy
* Lazy loading
* Security proxy

Example:

```
Client → Cache Proxy → Database
```

---

# 3️⃣ Behavioral Design Patterns

Behavioral patterns focus on **communication between objects**.

---

## Chain of Responsibility Pattern

Passes request through **a chain of handlers**.

### Use Cases

* Logging frameworks
* API Gateway filters
* Middleware pipelines

Example:

```
Auth → Rate Limit → Logging → Handler
```

---

## Command Pattern

Encapsulates **requests as objects**.

### Use Cases

* Task queues
* Job schedulers
* Undo/Redo functionality

Example:

```
SendEmailCommand
ProcessPaymentCommand
GenerateReportCommand
```

---

## Interpreter Pattern

Evaluates **language grammar expressions**.

### Use Cases

* SQL engines
* Rule engines
* Query languages

---

## Iterator Pattern

Traverses collections **without exposing internal structure**.

### Use Cases

* Database cursors
* Streams
* Collection frameworks

Example:

```
Java Iterator
Python Generators
```

---

## Mediator Pattern

Centralizes **communication between objects**.

### Use Cases

* Chat servers
* Event systems
* Air traffic control systems

Example:

```
ChatServer manages communication between users
```

---

## Memento Pattern

Stores **object snapshots**.

### Use Cases

* Undo functionality
* Version control
* Game save states

---

## Observer Pattern

Defines **publish-subscribe relationship**.

### Use Cases

* Notification systems
* Event-driven architectures
* Stock market updates

Example:

```
User subscribes → receives notification when event occurs
```

---

## State Pattern

Changes object behavior **based on state**.

### Use Cases

* Order lifecycle
* Ride lifecycle
* Document workflows

Example:

```
Order
 ├ Created
 ├ Paid
 ├ Shipped
 └ Delivered
```

---

## Strategy Pattern

Encapsulates **multiple algorithms**.

### Use Cases

* Payment methods
* Pricing strategies
* Sorting algorithms

Example:

```
PaymentStrategy
 ├ UPI
 ├ Card
 └ Wallet
```

---

## Template Method Pattern

Defines **algorithm skeleton in base class**.

### Use Cases

* Frameworks
* Data pipelines
* Testing frameworks

Example:

```
DataPipeline
   extract()
   transform()
   load()
```

---

## Visitor Pattern

Separates algorithm **from object structure**.

### Use Cases

* Compilers
* AST processing
* Document processors

---

# ⭐ One Page Interview Cheat Sheet

| Pattern                 | Real System Example     |
| ----------------------- | ----------------------- |
| Singleton               | Logger, Config Manager  |
| Factory                 | Payment creation        |
| Abstract Factory        | Cloud SDK               |
| Builder                 | HTTP request builder    |
| Prototype               | VM template             |
| Adapter                 | Payment gateway adapter |
| Bridge                  | Notification system     |
| Composite               | File system             |
| Decorator               | Middleware              |
| Facade                  | API Gateway             |
| Flyweight               | Map markers             |
| Proxy                   | Redis cache             |
| Chain of Responsibility | Middleware pipeline     |
| Command                 | Job queues              |
| Interpreter             | SQL engine              |
| Iterator                | DB cursor               |
| Mediator                | Chat server             |
| Memento                 | Undo system             |
| Observer                | Notification system     |
| State                   | Order lifecycle         |
| Strategy                | Payment methods         |
| Template Method         | Data pipeline           |
| Visitor                 | Compiler                |

---

# 🎯 Most Important Patterns for LLD Interviews

The following **7 patterns appear in ~80% of real systems**:

```
Singleton
Factory
Strategy
Observer
Decorator
Facade
Proxy
```

Mastering these patterns will cover most **backend and LLD interview scenarios**.

---

# 📌 Recommended Practice

Try implementing these design problems:

* Vending Machine
* Parking Lot
* LRU Cache
* Splitwise
* Notification System
* Ride Sharing System
* Payment System
* Chat Application

These problems help apply **multiple design patterns together**.




=====================================================================================================================================================

---


| Category | Example System |
|--------|--------|
| URL Shortener | Bitly |
| Chat System | WhatsApp |
| Social Feed | Instagram |
| Streaming | YouTube |
| Ride Hailing | Uber |
| Food Delivery | Zomato |
| File Storage | Dropbox |
| Search Engine | Google Search |
| Notification System | Push Notifications |
| Booking System | BookMyShow |

---
