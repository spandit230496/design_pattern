# Step Builder Pattern in Python – HTTPRequest Example

## Overview

The **Step Builder Pattern** is a variation of the **Builder Design Pattern** used when an object must be constructed in a **specific sequence of steps**.

It ensures that:

* Mandatory fields are **set in order**
* The client **cannot skip required steps**
* The object is always created in a **valid state**

In this example we build an **HTTPRequest** object using the sequence:

```
URL → Method → Optional fields → Build
```

---

# UML Diagram

```
                 +-------------------+
                 |   HTTPRequest     |
                 +-------------------+
                 | url               |
                 | method            |
                 | headers           |
                 | body              |
                 | timeout           |
                 +-------------------+

                         ▲
                         |
                +---------------------+
                | HTTPRequestBuilder  |
                +---------------------+
                | builder()           |
                +---------------------+
                         |
                         v
                  +-------------+
                  |   URLStep   |
                  +-------------+
                  | url()       |
                  +-------------+
                         |
                         v
                  +--------------+
                  |  MethodStep  |
                  +--------------+
                  | method()     |
                  +--------------+
                         |
                         v
                  +---------------+
                  | OptionalStep  |
                  +---------------+
                  | headers()     |
                  | body()        |
                  | timeout()     |
                  | build()       |
                  +---------------+
```

---

# Implementation

## Product Class

```python
class HTTPRequest:

    def __init__(self):
        self.url = None
        self.method = None
        self.headers = None
        self.body = None
        self.timeout = None

    def __str__(self):
        return f"""
URL: {self.url}
Method: {self.method}
Headers: {self.headers}
Body: {self.body}
Timeout: {self.timeout}
"""
```

---

## Step 1 – URL Step

```python
class URLStep:

    def __init__(self, request):
        self.request = request

    def url(self, url):
        self.request.url = url
        return MethodStep(self.request)
```

This step ensures the **URL must be provided first**.

---

## Step 2 – Method Step

```python
class MethodStep:

    def __init__(self, request):
        self.request = request

    def method(self, method):
        self.request.method = method
        return OptionalStep(self.request)
```

After setting the method, the builder moves to optional configuration.

---

## Step 3 – Optional Step

```python
class OptionalStep:

    def __init__(self, request):
        self.request = request

    def headers(self, headers):
        self.request.headers = headers
        return self

    def body(self, body):
        self.request.body = body
        return self

    def timeout(self, timeout):
        self.request.timeout = timeout
        return self

    def build(self):
        return self.request
```

Optional parameters can be chained.

---

## Builder Entry Point

```python
class HTTPRequestBuilder:

    @staticmethod
    def builder():
        return URLStep(HTTPRequest())
```

This method starts the **step builder process**.

---

# Client Usage

```python
request = (
    HTTPRequestBuilder.builder()
    .url("https://api.example.com")
    .method("POST")
    .headers({"Authorization": "Bearer token"})
    .timeout(30)
    .build()
)

print(request)
```

---

# Valid Flow

```
builder()
   ↓
url()
   ↓
method()
   ↓
headers() / body() / timeout()
   ↓
build()
```

---

# Invalid Flow

```
builder().method("GET")
```

This fails because **`method()` is not available in URLStep**.

---

# Advantages

## Enforces Correct Order

Mandatory steps cannot be skipped.

## Improves Readability

```python
builder()
   .url()
   .method()
   .headers()
   .build()
```

## Prevents Invalid Objects

The object cannot be created without required fields.

---

# When to Use Step Builder

Use Step Builder when:

* Object creation requires **mandatory fields**
* The **order of steps matters**
* There are **many optional parameters**
* You want **safe and readable object construction**

---

# Real World Examples

Step Builder is used in systems like:

* HTTP client libraries
* AWS SDK request builders
* Database configuration builders
* Configuration objects

Example API style:

```python
Request.builder()
       .url("api.com")
       .method("GET")
       .headers({})
       .build()
```

---

# Builder vs Step Builder

| Feature           | Builder                  | Step Builder                 |
| ----------------- | ------------------------ | ---------------------------- |
| Order Enforcement | No                       | Yes                          |
| Complexity        | Low                      | Medium                       |
| Safety            | Medium                   | High                         |
| Use Case          | Flexible object creation | Strict construction sequence |

---

# Interview Explanation

In **Low Level Design interviews**, you can explain it like this:

> The Step Builder Pattern is used when an object must be constructed in a specific order. Each step returns an interface or class representing the next valid step. This ensures mandatory fields are set and prevents invalid object creation.

Example flow:

```
URL → Method → Optional Fields → Build
```

This ensures the **HTTPRequest object is always valid**.

---

# Key Takeaways

* Enforces **correct construction order**
* Improves **readability**
* Prevents **invalid object states**
* Useful for **complex object creation**
