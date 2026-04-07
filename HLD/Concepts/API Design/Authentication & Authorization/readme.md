# 🔐 Authentication in Web Applications

## Stateful vs Stateless (Cookies, Sessions & JWT)

---

## 📌 Overview

Authentication is how a system verifies **who the user is**.

There are two main approaches:

* 🧠 **Stateful Authentication** → Server remembers user (Sessions)
* 🌐 **Stateless Authentication** → Client carries identity (JWT)

---

# 🧠 1. Stateful Authentication (Session-Based)

## 📍 Concept

* Server stores **user data (session)**
* Browser stores only **session_id (cookie)**

---

## 🍪 Cookie Example

```http
Set-Cookie: session_id=abc123xyz; HttpOnly; Secure; SameSite=Strict
```

### 🔍 Attributes

* `session_id` → Unique identifier
* `HttpOnly` → Prevents JS access (XSS protection)
* `Secure` → HTTPS only
* `SameSite` → CSRF protection

---

## 🔁 Request with Cookie

```http
GET /profile
Cookie: session_id=abc123xyz
```

👉 Browser automatically sends cookie on every request

---

## 🗂️ Session Storage (Server Side)

```json
{
  "session_id": "abc123xyz",
  "user_id": 101,
  "username": "sandip",
  "role": "admin",
  "login_time": "2026-04-07T10:30:00"
}
```

---

## 📍 Where Sessions Are Stored?

* RAM (in-memory)
* Redis (recommended ✅)
* Database

---

## 🔁 Flow

```text
1. User logs in
2. Server creates session_id
3. Server stores user data in session store
4. Server sends session_id in cookie
5. Browser stores cookie
6. Browser sends cookie in every request
7. Server validates session using session_id
```

---

## 🧪 Example: Node.js (Express Session)

```javascript
const session = require('express-session');

app.use(session({
  secret: 'mySecretKey',
  resave: false,
  saveUninitialized: true
}));

app.post('/login', (req, res) => {
  req.session.user = {
    id: 101,
    name: "Sandip"
  };
  res.send("Logged in");
});

app.get('/profile', (req, res) => {
  if (req.session.user) {
    res.send(req.session.user);
  } else {
    res.send("Not logged in");
  }
});
```

---

## ✅ Advantages

* More secure (server-controlled)
* Easy to revoke sessions
* Works well for sensitive apps (banking)

---

## ⚠️ Disadvantages

* Requires server memory
* Hard to scale (needs Redis/shared storage)
* Slower (DB/session lookup)

---

---

# 🌐 2. Stateless Authentication (JWT-Based)

## 📍 Concept

* Server does **NOT store session**
* Client stores and sends **JWT token**

---

## 🔑 JWT Example

```text
eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9
.
eyJ1c2VyX2lkIjoxMDEsIm5hbWUiOiJTYW5kaXAifQ
.
SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c
```

---

## 🧱 JWT Structure

```text
Header.Payload.Signature
```

### Example:

```json
Header:
{
  "alg": "HS256",
  "typ": "JWT"
}

Payload:
{
  "user_id": 101,
  "name": "Sandip"
}

Signature:
HMACSHA256(base64UrlEncode(header + payload), secret)
```

---

## 🔁 Request with JWT

```http
GET /profile
Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6...
```

---

## 🔁 Flow

```text
1. User logs in
2. Server generates JWT
3. Server sends JWT to client
4. Client stores token (localStorage / memory)
5. Client sends token in every request
6. Server verifies token signature
7. Server extracts user info
```

---

## 🧪 Example: Node.js (JWT)

```javascript
const jwt = require('jsonwebtoken');

app.post('/login', (req, res) => {
  const user = { id: 101, name: "Sandip" };

  const token = jwt.sign(user, "secretKey", { expiresIn: "1h" });

  res.json({ token });
});

app.get('/profile', (req, res) => {
  const token = req.headers.authorization.split(" ")[1];

  const decoded = jwt.verify(token, "secretKey");

  res.send(decoded);
});
```

---

## ✅ Advantages

* No server storage needed
* Easy to scale (microservices)
* Faster (no DB lookup)

---

## ⚠️ Disadvantages

* Hard to revoke tokens
* Token leakage risk
* Larger request size

---

---

# ⚖️ Stateful vs Stateless

| Feature    | Stateful (Session) | Stateless (JWT) |
| ---------- | ------------------ | --------------- |
| Storage    | Server             | Client          |
| Data       | Stored on server   | Stored in token |
| Scaling    | Difficult          | Easy            |
| Speed      | Slower             | Faster          |
| Security   | High control       | Token risk      |
| Revocation | Easy               | Hard            |

---

---

# 🔥 When to Use What?

## 🧠 Use Stateful (Sessions) when:

* Banking systems
* Admin panels
* High security needed

---

## 🌐 Use Stateless (JWT) when:

* REST APIs
* Microservices
* Mobile apps
* Distributed systems

---

---

# 🧠 Key Takeaways

```text
Stateful  → Server remembers user
Stateless → User carries identity
```

```text
Cookie  → stores session_id
Session → stores user data
JWT     → stores user data inside token
```

---

---

# 🚀 Bonus: Cookie vs LocalStorage vs SessionStorage

| Feature        | Cookie            | LocalStorage | SessionStorage |
| -------------- | ----------------- | ------------ | -------------- |
| Sent to Server | Yes               | No           | No             |
| Size           | Small             | Large        | Large          |
| Expiry         | Configurable      | Permanent    | Tab close      |
| Use Case       | Auth (session_id) | JWT storage  | Temporary data |

---

---

# 🧠 Interview One-Liner

👉
**Stateful = Server stores user state (session)**
**Stateless = Client sends identity (JWT token)**

----------------------------------------------------------------------------------------------

# 🔐 Authentication vs Authorization

1. **Authentication (AuthN)** → *Who are you?*
2. **Authorization (AuthZ)** → *What can you do?*

---

# 🧠 1. Authentication (AuthN)

## 📍 Definition

Authentication is the process of verifying the **identity of a user**.

👉 It answers:

```text
"Are you really who you claim to be?"
```

---

## 🔑 Common Authentication Methods

### 1. Username & Password

```text
User → enters email + password
Server → verifies credentials
```

---

### 2. OTP (One-Time Password)

```text
User → enters phone/email
Server → sends OTP → verifies
```

---

### 3. OAuth (Social Login)

```text
Login with Google / GitHub
```

---

### 4. Biometric

```text
Fingerprint / Face ID
```

---

## 🔁 Authentication Flow

```text
1. User submits credentials
2. Server verifies identity
3. Server creates session or token
4. User is marked as "authenticated"
```

---

## 🧪 Example (JWT Authentication)

```javascript
const jwt = require('jsonwebtoken');

app.post('/login', (req, res) => {
  const user = { id: 101, role: "admin" };

  const token = jwt.sign(user, "secretKey", { expiresIn: "1h" });

  res.json({ token });
});
```

---

## ✅ Real-World Examples

* Logging into Gmail
* Logging into Netflix
* Banking app login

---

---

# 🛂 2. Authorization (AuthZ)

## 📍 Definition

Authorization determines **what an authenticated user is allowed to do**.

👉 It answers:

```text
"What actions are you allowed to perform?"
```

---

## 🔐 Common Authorization Models

### 1. Role-Based Access Control (RBAC)

```text
Admin → Full access
User → Limited access
```

---

### 2. Attribute-Based Access Control (ABAC)

```text
Access based on:
- User role
- Location
- Time
- Department
```

---

### 3. Permission-Based

```text
can_view
can_edit
can_delete
```

---

## 🔁 Authorization Flow

```text
1. User is authenticated
2. Server checks user role/permissions
3. Server allows or denies access
```

---

## 🧪 Example

```javascript
app.get('/admin', (req, res) => {
  const user = req.user;

  if (user.role !== 'admin') {
    return res.status(403).send("Access Denied");
  }

  res.send("Welcome Admin");
});
```

---

## ✅ Real-World Examples

* Only admins can delete users
* Only doctors can view patient reports
* Only owner can edit their profile

---

---

# ⚔️ Authentication vs Authorization

| Feature        | Authentication  | Authorization     |
| -------------- | --------------- | ----------------- |
| Purpose        | Verify identity | Check permissions |
| Question       | Who are you?    | What can you do?  |
| Happens First? | ✅ Yes           | ❌ After Auth      |
| Data Used      | Credentials     | Roles/Permissions |
| Example        | Login           | Access control    |

---

---

# 🔁 Complete Flow (Real System)

```text
1. User logs in → Authentication
2. Server verifies identity
3. Server issues token/session
4. User requests resource
5. Server checks permissions → Authorization
6. Access granted/denied
```

---

---

# 🧠 Easy Analogy

## 🏢 Office Building

* **Authentication** → Show ID card at gate
* **Authorization** → Access allowed only to certain rooms

---

---

# 🔥 Key Takeaways

```text
Authentication → Identity verification
Authorization → Permission control
```

```text
AuthN happens first, AuthZ happens after
```

---

---

# 🚀 Bonus: How They Work Together

```text
Login → Authentication
Access API → Authorization
```

---

---

# 🧠 Interview One-Liner

👉
**Authentication checks who you are, Authorization checks what you can do.**



**Types of Authentication**
| Type      | Security  | Ease   | Use Case       |
| --------- | --------- | ------ | -------------- |
| Password  | Medium    | Easy   | Basic apps     |
| OTP       | High      | Medium | Banking        |
| JWT       | High      | Fast   | APIs           |
| Session   | High      | Medium | Web apps       |
| OAuth     | High      | Easy   | Social login(Third party)  |
| Biometric | Very High | Easy   | Devices        |
| MFA       | Very High | Medium | Secure systems |
