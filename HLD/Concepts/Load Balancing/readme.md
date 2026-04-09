# ⚖️ Load Balancing – Complete Guide

## 📌 What is Load Balancing?

**Load Balancing** is the process of distributing incoming network traffic across multiple servers to ensure:

* High availability
* Reliability
* Scalability
* Optimal resource utilization

👉 Instead of one server handling all requests, a **load balancer** sits in front and distributes traffic.

---

## 🧠 Why Do We Need Load Balancing?

Without load balancing:

* ❌ Server overload
* ❌ Downtime risk
* ❌ Poor performance

With load balancing:

* ✅ Handles millions of users
* ✅ Fault tolerance
* ✅ Better response time

---

## 🏗️ Architecture Overview

![Image](https://miro.medium.com/1%2A-bN42Y9qc-hfVMxD3isqXg.jpeg)

![Image](https://i.sstatic.net/6qeu7.jpg)

![Image](https://substackcdn.com/image/fetch/%24s_%21vfT2%21%2Cf_auto%2Cq_auto%3Agood%2Cfl_progressive%3Asteep/https%3A%2F%2Fsubstack-post-media.s3.amazonaws.com%2Fpublic%2Fimages%2F53ec7e8b-12a1-403f-aecb-cc370ee7e837_2250x2840.png)

![Image](https://www.researchgate.net/publication/228929504/figure/fig2/AS%3A300885512081409%401448748104249/How-load-balancing-works-in-horizontal-scalability.png)

**Flow:**

```
Client → Load Balancer → Multiple Servers → Database
```

---

## ⚙️ Types of Load Balancers

### 1. Layer 4 Load Balancer (Transport Layer)

* Works on IP + Port
* Faster (no content inspection)
* Example: TCP/UDP balancing

👉 Used when performance is critical

---

### 2. Layer 7 Load Balancer (Application Layer)

* Works on HTTP/HTTPS
* Routes based on:

  * URL
  * Headers
  * Cookies

👉 Used for smart routing

---

## 🔁 Load Balancing Algorithms

### 1. Round Robin

* Requests distributed sequentially
* Simple and widely used

```
Req1 → Server1  
Req2 → Server2  
Req3 → Server3  
```

---

### 2. Least Connections

* Sends request to server with least active connections
* Best for uneven traffic

---

### 3. IP Hash

* Same client → same server
* Useful for session persistence

---

### 4. Weighted Round Robin

* Servers assigned weights
* Powerful servers get more traffic

---

## 🔐 Session Management

### Sticky Sessions (Session Affinity)

* Same user → same server
* Problem: poor scalability

### Solution:

* Store sessions in:

  * Redis
  * Database
  * JWT (stateless)

---

## 🚀 Types of Load Balancing

### 1. Horizontal Scaling

* Add more servers

### 2. Vertical Scaling

* Increase server power

👉 Load balancing mainly supports **horizontal scaling**

---

## 🌍 DNS Load Balancing

* Uses DNS to distribute traffic
* Example: multiple IPs for one domain

⚠️ Limitation:

* No real-time health checks

---

## ❤️ Health Checks

Load balancer checks:

* Server is alive or not
* Response time

If a server fails → traffic redirected

---

## 🧰 Popular Load Balancers

* Nginx
* HAProxy
* Apache HTTP Server
* AWS Elastic Load Balancing

---

## ⚡ Reverse Proxy vs Load Balancer

| Feature      | Reverse Proxy    | Load Balancer      |
| ------------ | ---------------- | ------------------ |
| Purpose      | Forward requests | Distribute traffic |
| Example      | Nginx            | HAProxy            |
| Can overlap? | ✅ Yes            | ✅ Yes              |

👉 Modern tools (like Nginx) do both

---

## 🔄 Load Balancing Strategies in Real Systems

### Example: Uber-like System

* Geo-based routing
* API Gateway + Load Balancer
* Microservices distribution

---

## 📉 Challenges

* Session handling
* Uneven load
* Network latency
* Failover complexity

---

## 🧪 Example (Nginx Config)

```nginx
http {
    upstream backend {
        server server1.example.com;
        server server2.example.com;
    }

    server {
        location / {
            proxy_pass http://backend;
        }
    }
}
```

---

## 📈 Advanced Concepts

* Auto Scaling Groups
* Rate Limiting
* Circuit Breaker Pattern
* Anycast Routing

---

## ✅ Conclusion

Load balancing is **core to scalable backend systems**:

* Distributes traffic efficiently
* Prevents failures
* Enables horizontal scaling

---

## 🎯 Interview Tips

* Always mention:

  * Algorithms (Round Robin, Least Conn)
  * Layer 4 vs Layer 7
  * Sticky sessions vs stateless
  * Health checks

---
