# Singleton Design Pattern (Python)

## Introduction

The **Singleton Design Pattern** ensures that a class has **only one instance** and provides a **global point of access** to that instance.

In simple terms:

> A Singleton class allows the creation of **only one object**. If another object is requested, the same existing instance is returned.

This pattern is commonly used in:

* Logging systems
* Database connections
* Configuration managers
* Cache managers

---

# Steps to Create a Singleton Class

To implement a Singleton class, follow these steps:

### Step 1: Create a Class

Define the class normally.

### Step 2: Create a Static Variable

Create a class-level variable to store the single instance.

```
_instance = None
```

This variable will hold the only object of the class.

---

### Step 3: Control Object Creation

Override the `__new__()` method to control object creation.

Python calls `__new__()` before `__init__()` when creating an object.

Inside this method:

* Check if an instance already exists.
* If not, create a new object.
* If yes, return the existing object.

---

### Step 4: Return the Existing Instance

Always return the stored instance so that no new object is created.

---

# Singleton Implementation in Python

```python
class Singleton:
    _instance = None   # class variable to store the single instance

    def __new__(cls):
        if cls._instance is None:
            print("Creating new instance")
            cls._instance = super().__new__(cls)
        return cls._instance


# Usage
obj1 = Singleton()
obj2 = Singleton()

print(obj1 is obj2)
```

---

# Output

```
Creating new instance
True
```

Explanation:

* The object is created only once.
* The second call returns the same instance.
* Therefore `obj1 is obj2` returns **True**.

---

# How It Works

1. First object creation:

   * `_instance` is `None`
   * A new object is created
   * Stored in `_instance`

2. Second object creation:

   * `_instance` already exists
   * The same instance is returned

---

# Real World Example

## Database Connection

Creating multiple database connections is expensive.
So we use Singleton to maintain **one shared connection**.

```python
class DatabaseConnection:
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            print("Connecting to database...")
            cls._instance = super().__new__(cls)
        return cls._instance


db1 = DatabaseConnection()
db2 = DatabaseConnection()

print(db1 is db2)
```

Output

```
Connecting to database...
True
```

---

# Advantages

* Saves memory
* Ensures a single source of truth
* Easy global access
* Prevents multiple object creation

---

# Disadvantages

* Harder to test (unit testing)
* Can introduce global state issues
* Thread safety issues in multithreading

---

# Common Use Cases

| Use Case              | Reason                |
| --------------------- | --------------------- |
| Logger                | Single logging object |
| Database connection   | Expensive resource    |
| Configuration manager | Shared settings       |
| Cache manager         | Shared cache          |

---

# Conclusion

The **Singleton Design Pattern** ensures that a class has only one instance and provides a global access point to it.

It is useful when:

* Only one object should exist
* The object must be shared across the application

---
