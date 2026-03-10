 
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


# Adapter Design Pattern Example

### Indian Charger → US Socket (Python)

## Overview

The **Adapter Design Pattern** is a **structural design pattern** that allows two incompatible interfaces to work together.

In this example:

* A **phone expects an Indian charger interface**.
* But the available power source is a **US socket**.
* A **converter (adapter)** is used to connect them.

---

# Problem

A **phone expects a charger with a `charge()` method**, but the available **US socket provides `supply_power()`**.

Because the interfaces are different, the phone **cannot directly use the US socket**.

---

# Solution

Create an **Adapter (Converter)** that converts:

```
charge() → supply_power()
```

So the phone can charge using the US socket.

---

# Components of Adapter Pattern

| Component | Class           | Description                  |
| --------- | --------------- | ---------------------------- |
| Client    | `Phone`         | Uses the charger             |
| Target    | `IndianCharger` | Interface expected by client |
| Adapter   | `Converter`     | Converts interface           |
| Adaptee   | `USSocket`      | Existing incompatible system |

---

# UML Structure

```
Phone (Client)
      ↓
IndianCharger (Target)
      ↓
Converter (Adapter)
      ↓
USSocket (Adaptee)
```

---

# Python Implementation

```python
# Adaptee (Existing system)
class USSocket:

    def supply_power(self):
        print("Power supplied from US socket")


# Target (Interface expected by client)
class IndianCharger:

    def charge(self):
        pass


# Adapter
class Converter(IndianCharger):

    def __init__(self, us_socket):
        self.us_socket = us_socket

    def charge(self):
        print("Converter adapting Indian charger to US socket")
        self.us_socket.supply_power()


# Client
class Phone:

    def __init__(self, charger):
        self.charger = charger

    def start_charging(self):
        self.charger.charge()


# Main program
us_socket = USSocket()
converter = Converter(us_socket)
phone = Phone(converter)

phone.start_charging()
```

---

# Output

```
Converter adapting Indian charger to US socket
Power supplied from US socket
```

---

# Flow Explanation

1. The **Phone (Client)** expects a charger with `charge()`.
2. The **IndianCharger (Target)** defines the expected interface.
3. The **Converter (Adapter)** implements `charge()`.
4. The **USSocket (Adaptee)** provides `supply_power()`.

The adapter converts the call:

```
charge() → supply_power()
```

---

# Real-World Analogy

```
Indian Charger
      ↓
Converter
      ↓
US Socket
```

Without the **converter**, the charger **cannot fit the US socket**.

---

# Advantages

* Allows integration with **legacy systems**
* Promotes **code reuse**
* Follows **Open/Closed Principle**

---

# Interview Definition

> The Adapter Pattern converts the interface of a class into another interface that a client expects, allowing incompatible classes to work together.
