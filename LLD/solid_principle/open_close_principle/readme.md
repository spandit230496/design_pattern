# Open/Closed Principle (OCP)

## Definition

The **Open/Closed Principle** states that:

> **Software entities should be open for extension but closed for modification.**

This means:

* You should be able to **add new functionality without changing existing code**.
* Existing code should remain **stable and untouched**.

This principle is part of the **SOLID principles of object-oriented design**.

---

# Why OCP is Important

Without OCP, every time we add a new feature we might need to modify existing classes. This can:

* Introduce bugs
* Break existing functionality
* Make the code harder to maintain

By following OCP, we can extend behavior using **inheritance, interfaces, or abstractions**.

---

# Example: Payment System

Suppose we build a payment processor that supports:

* Credit Card
* PayPal
* Cash

If the processor checks payment type using `if-else`, the code might look like this:

```python
class PaymentProcessor:
    def process(self, payment_type):
        if payment_type == "credit":
            print("Processing credit card")
        elif payment_type == "paypal":
            print("Processing PayPal")
```

## Problem

If we want to add a new payment method like **UPI**, we must modify the existing code.

This **violates the Open/Closed Principle**.

---

# OCP Solution Using Abstraction

We introduce an abstract class:

```python
from abc import ABC, abstractmethod

class PaymentMethod(ABC):

    @abstractmethod
    def pay(self, amount):
        pass
```

Each payment method implements this interface.

Example:

```python
class CreditCardPayment(PaymentMethod):

    def pay(self, amount):
        print(f"Paid {amount} using Credit Card")
```

```python
class PaypalPayment(PaymentMethod):

    def pay(self, amount):
        print(f"Paid {amount} using PayPal")
```

---

# Payment Processor

The processor does not care about payment type.

```python
class PaymentProcessor:

    def process(self, payment_method, amount):
        payment_method.pay(amount)
```

---

# Adding a New Payment Method

Now if we want to add **UPI payment**, we just create a new class:

```python
class UPIPayment(PaymentMethod):

    def pay(self, amount):
        print(f"Paid {amount} using UPI")
```

No existing code needs to change.

---

# Benefits

Following OCP provides:

* Better maintainability
* Easier feature additions
* Reduced risk of breaking existing code
* More scalable architecture

---

# Summary

| Concept                 | Meaning                        |
| ----------------------- | ------------------------------ |
| Open for Extension      | New functionality can be added |
| Closed for Modification | Existing code does not change  |

The **Open/Closed Principle** helps build systems that are **flexible, scalable, and easy to maintain**.
