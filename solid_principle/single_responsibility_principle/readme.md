# Single Responsibility Principle (SRP) – Python

The **Single Responsibility Principle (SRP)** is the first principle of **SOLID** design principles.

> **A class should have only one responsibility and only one reason to change.**

This means a class should perform **only one job**. If a class handles multiple responsibilities, it becomes difficult to maintain and modify.

---

# Problem Without SRP

When a class performs multiple tasks, it violates the Single Responsibility Principle.

Example:

```python
class UserService:

    def create_user(self, name):
        print(f"User {name} created")

    def save_to_database(self, name):
        print("Saving user to database")

    def send_email(self, name):
        print("Sending welcome email")
```

### Issues

This class handles multiple responsibilities:

* User creation logic
* Database operations
* Email sending

If the **database changes** or **email service changes**, we must modify the same class.
Therefore, this class has **multiple reasons to change**.

---

# Solution Using SRP

Separate responsibilities into different classes.

## User Service (Business Logic)

```python
class UserService:

    def create_user(self, name):
        print(f"User {name} created")
```

---

## User Repository (Database Logic)

```python
class UserRepository:

    def save(self, name):
        print("Saving user to database")
```

---

## Email Service (Email Logic)

```python
class EmailService:

    def send_email(self, name):
        print("Sending welcome email")
```

---

# Usage Example

```python
if __name__ == "__main__":

    user_service = UserService()
    user_repo = UserRepository()
    email_service = EmailService()

    user_service.create_user("Sandip")
    user_repo.save("Sandip")
    email_service.send_email("Sandip")
```

---

# Output

```
User Sandip created
Saving user to database
Sending welcome email
```

---

# Benefits of SRP

* Improves **code readability**
* Makes **code easier to maintain**
* Reduces **coupling**
* Improves **testability**
* Makes the system **more modular**

---

# Design Comparison

## ❌ Without SRP

```
UserService
 ├── create_user()
 ├── save_to_database()
 └── send_email()
```

One class handling **multiple responsibilities**.

---

## ✅ With SRP

```
UserService
UserRepository
EmailService
```

Each class has **one responsibility**.

---

# Interview Definition

**Single Responsibility Principle**

> A class should have **only one responsibility and therefore only one reason to change**.

---

# SOLID Principles

1. **S** – Single Responsibility Principle
2. **O** – Open/Closed Principle
3. **L** – Liskov Substitution Principle
4. **I** – Interface Segregation Principle
5. **D** – Dependency Inversion Principle
