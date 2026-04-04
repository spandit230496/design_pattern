# 🌐 API Design - Complete Guide

A concise guide covering:
- API fundamentals
- REST & SOAP
- Best practices
- Security & versioning
- Trade-offs

---

## 📌 1. What is an API?

An **API (Application Programming Interface)** allows systems to communicate.

![API Communication](https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Webservices.png/1200px-Webservices.png)

Client → API → Server → Response

---

## 🏗️ 2. Types of APIs

- REST (Most popular)
- GraphQL
- gRPC
- SOAP (Enterprise/legacy)

---

# 🔥 3. REST API

## 📖 What is REST?

REST is an **architectural style** using HTTP for communication.

---

## ⚙️ Key Principles

- Stateless
- Client-Server
- Cacheable
- Uniform Interface

---

## 📡 HTTP Methods

| Method | Use |
|-------|-----|
| GET | Fetch |
| POST | Create |
| PUT | Update |
| PATCH | Partial update |
| DELETE | Remove |

---

## 🧱 Resource Naming

✅ Good:
```

/users
/users/{id}
/orders/{id}/items

```

👉 Use nouns, not verbs

---

## 📦 Example

```

GET /users/101
POST /orders

````

---

## ✅ Advantages

- Simple & scalable
- Lightweight (JSON)
- Widely used

---

## ❌ Disadvantages

- Over-fetching
- No strict contract

---

# 🧾 4. SOAP API

## 📖 What is SOAP?

SOAP is a **protocol** using XML for structured communication.

---

## 🧱 Structure

![SOAP Envelope](https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/SOAP-message-en.svg/1200px-SOAP-message-en.svg.png)

- Envelope
- Header
- Body

---

## 📦 Example

```xml
<Envelope>
  <Body>
    <getUser>
      <id>101</id>
    </getUser>
  </Body>
</Envelope>
````

---

## ✅ Advantages

* Strict contract (WSDL)
* High security (WS-Security)
* Reliable

---

## ❌ Disadvantages

* Heavy (XML)
* Complex
* Slower

---

# ⚔️ 5. REST vs SOAP

![REST vs SOAP](https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Rest_vs_SOAP.png/1200px-Rest_vs_SOAP.png)

| Feature     | REST         | SOAP        |
| ----------- | ------------ | ----------- |
| Type        | Architecture | Protocol    |
| Format      | JSON         | XML         |
| Speed       | Fast         | Slower      |
| Flexibility | High         | Low         |
| Security    | JWT/OAuth    | WS-Security |

---

## 🎯 When to Use?

### Use REST:

* Web & mobile apps
* Microservices
* High performance systems

### Use SOAP:

* Banking
* Enterprise systems
* High security needs

---

# 🔐 6. Authentication

* API Key
* JWT (most common)
* OAuth 2.0

---

# ⚠️ 7. Error Handling

```json
{
  "error": {
    "code": 400,
    "message": "Invalid input"
  }
}
```

---

# 🔁 8. Idempotency

* GET, PUT → Idempotent
* POST → Not idempotent

---

# 🔢 9. Pagination

```
GET /users?page=1&limit=10
```

---

# ⚡ 10. Rate Limiting

![Rate Limiting](https://upload.wikimedia.org/wikipedia/commons/thumb/5/5c/Token_bucket.svg/1200px-Token_bucket.svg.png)

* Prevent abuse
* Example: 100 req/min

---

# 🔄 11. Versioning

```
/v1/users
/v2/users
```

---

# 📊 12. Caching

* Cache-Control
* ETag

---

# ⚖️ 13. Trade-offs

### REST

✅ Simple
❌ Less strict

### SOAP

✅ Secure
❌ Complex

---

# 🚀 14. Best Practices

* Use proper HTTP methods
* Keep APIs stateless
* Use meaningful status codes
* Implement rate limiting
* Version APIs
* Secure APIs

---

# 🧠 15. Interview Tips

* REST = default choice
* SOAP = enterprise use cases
* Always discuss trade-offs
* Mention idempotency + versioning

---

# 🎯 Final Summary

* API = communication contract
* REST = fast, scalable, widely used
* SOAP = secure, strict, enterprise


