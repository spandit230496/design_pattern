 
 # Adapter Design Pattern

## Overview

The **Adapter Design Pattern** is a **structural design pattern** that allows two incompatible interfaces to work together.

It acts as a **bridge between two different interfaces**, converting the interface of one class into another interface that a client expects.

In simple terms, the Adapter works like a **translator**.

---

# Real World Analogy

A common real-world example is a **power plug adapter**.

For example:

* Your laptop charger has a **US plug**
* The wall socket supports an **Indian/European plug**
* You use a **plug adapter** to connect them

The adapter converts the plug type so that both devices can work together.

```
Charger → Adapter → Wall Socket
```

---

# When to Use Adapter Pattern

Use the Adapter Pattern when:

* You want to use an **existing class**, but its interface does not match what the client expects.
* You want to integrate a **third-party library** into your application.
* You want to reuse **legacy code** without modifying it.
* Multiple systems with **different interfaces** need to communicate.

---

# Structure of Adapter Pattern

The Adapter Pattern typically contains four components:

### 1. Client

The class that uses the Target interface.

### 2. Target Interface

The expected interface used by the client.

### 3. Adaptee

The existing class with an incompatible interface.

### 4. Adapter

A wrapper class that converts the interface of the Adaptee into the Target interface.

```
Client → Adapter → Adaptee
```

---

# UML Diagram

```
        Client
          |
          v
       Target
          ^
          |
       Adapter
          |
          v
       Adaptee
```

---

# Python Example

## Target Interface

```python
class PaymentProcessor:
    def pay(self, amount):
        pass
```

---

## Adaptee (Existing Class)

```python
class NewPaymentGateway:
    def make_payment(self, amount):
        print(f"Processing payment of {amount}")
```

---

## Adapter

```python
class PaymentAdapter(PaymentProcessor):

    def __init__(self, gateway):
        self.gateway = gateway

    def pay(self, amount):
        self.gateway.make_payment(amount)
```

---

## Client Code

```python
gateway = NewPaymentGateway()

adapter = PaymentAdapter(gateway)

adapter.pay(100)
```

### Output

```
Processing payment of 100
```

---

# Types of Adapter Pattern

## 1. Object Adapter

Uses **composition**.

The adapter contains an instance of the adaptee and translates the calls.

Example:

```
Adapter → Adaptee
```

Most commonly used in modern programming.

---

## 2. Class Adapter

Uses **inheritance**.

The adapter inherits from both the target and the adaptee.

Less commonly used.

---

# Advantages

* Promotes **code reusability**
* Improves **flexibility**
* Allows integration of **legacy systems**
* Follows **Single Responsibility Principle**

---

# Disadvantages

* Adds an extra layer of abstraction
* Too many adapters can increase system complexity

---

# Real World Software Examples

* Payment Gateway integrations
* Database drivers
* Java `InputStreamReader`
* Logging adapters
* API integrations

---

# Interview Definition

The **Adapter Design Pattern** converts the interface of a class into another interface that a client expects, allowing incompatible classes to work together.

---

# Summary

| Component | Description                 |
| --------- | --------------------------- |
| Client    | Uses the target interface   |
| Target    | Expected interface          |
| Adaptee   | Existing incompatible class |
| Adapter   | Converts adaptee interface  |

---

# Key Idea

The Adapter Pattern acts as a **translator between two incompatible interfaces**.
