

# Basics

- FastAPI installation & setup
- Creating first API (FastAPI())
- Path parameters
- Query parameters
- Request body (Pydantic)
- Response models
- Status codes

# Core Concepts
- Dependency Injection (Depends)
- Async vs Sync (async def)
- Validation (Pydantic models)
- Error handling (HTTPException)

# Request Handling
- Headers
- Cookies
- Forms & file uploads
- Background tasks

# Database
- SQLAlchemy ORM
- DB session management
- CRUD operations
- Alembic migrations

# Authentication & Security
- OAuth2
- JWT authentication
- Password hashing (bcrypt)
- Role-based access control

# Advanced
- Middleware
- CORS handling
- WebSockets
- Caching (Redis)
- Rate limiting
- Logging

# Project Structure
- Routers
- Schemas
- Models
- Services layer
- Config management

# Deployment
- Uvicorn / Gunicorn
- Docker
- Nginx
- Environment variables

# Testing
- Pytest
- TestClient

# Documentation
- Swagger (/docs)
- ReDoc (/redoc)

---------------------------------------------------------------------

# 🚀 WSGI vs ASGI vs Uvicorn vs Gunicorn

## 📌 Overview

This document explains the differences between **WSGI**, **ASGI**, **Uvicorn**, and **Gunicorn**, which are core components in Python web development.

---

## 🧩 1. WSGI (Web Server Gateway Interface)

WSGI is a **standard interface** between web servers and Python web applications.

### 🔹 Features

* Synchronous (blocking)
* Handles one request per worker
* Stable and widely used
* No support for WebSockets

### 🔹 Used With

* Django (traditional)
* Flask

---

## ⚡ 2. ASGI (Asynchronous Server Gateway Interface)

ASGI is the modern replacement for WSGI, supporting **asynchronous programming**.

### 🔹 Features

* Supports async + sync
* Handles multiple requests concurrently
* Supports WebSockets, long polling
* Better performance for real-time apps

### 🔹 Used With

* FastAPI
* Django (ASGI mode)

---

## ⚙️ 3. Uvicorn

Uvicorn is a **lightweight ASGI server** designed for high performance.

### 🔹 Features

* Async-first server
* Very fast (uses event loop)
* Supports HTTP/1.1 & WebSockets

### 🔹 Usage

```bash
uvicorn main:app --reload
```

---

## 🏗️ 4. Gunicorn

Gunicorn is a **production-grade server** that manages workers.

### 🔹 Features

* Process-based worker model
* Reliable and battle-tested
* Primarily WSGI-based

### 🔹 Usage

```bash
gunicorn app:app
```

---

## 🔥 5. Uvicorn + Gunicorn (Production Setup)

You can combine both:

* Gunicorn → manages multiple workers
* Uvicorn → handles async requests

```bash
gunicorn -k uvicorn.workers.UvicornWorker main:app
```

---

## 📊 Comparison Table

| Feature       | WSGI      | ASGI      | Uvicorn | Gunicorn    |
| ------------- | --------- | --------- | ------- | ----------- |
| Type          | Interface | Interface | Server  | Server      |
| Async Support | ❌ No      | ✅ Yes     | ✅ Yes   | ❌ (default) |
| WebSockets    | ❌ No      | ✅ Yes     | ✅ Yes   | ❌           |
| Concurrency   | Low       | High      | High    | Medium      |

---

## 🎯 When to Use

### ✅ Use WSGI + Gunicorn

* Django / Flask apps
* Traditional web apps

### ✅ Use ASGI + Uvicorn

* FastAPI apps
* Real-time systems (chat, streaming)

### ✅ Use Gunicorn + Uvicorn

* Production deployment of FastAPI

---

## 🧠 Summary

* **WSGI** → Old, synchronous standard
* **ASGI** → Modern, asynchronous standard
* **Uvicorn** → Fast ASGI server
* **Gunicorn** → Process manager for production

---

## 📌 Conclusion

For modern backend systems:

* Prefer **ASGI-based frameworks**
* Use **Uvicorn for development**
* Use **Gunicorn + Uvicorn workers for production**

---
