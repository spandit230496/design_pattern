# Singleton Design Pattern (Java)

## Introduction

The **Singleton Design Pattern** ensures that a class has **only one instance** and provides a **global access point** to that instance.

In simple terms:

> A Singleton class allows only **one object to be created**. If another object is requested, the same existing object is returned.

This pattern is widely used in real-world systems where **a single shared resource** is required.

Common examples:

* Logger
* Database Connection
* Configuration Manager
* Cache Manager

---

# Steps to Create a Singleton Class (Java)

### Step 1: Make the Constructor Private

The constructor must be **private** so that no other class can create objects using `new`.

```java
private Singleton() {}
```

---

### Step 2: Create a Static Instance Variable

Create a **static variable** that will store the single instance of the class.

```java
private static Singleton instance;
```

---

### Step 3: Provide a Public Static Method

Create a method (usually `getInstance()`) that returns the instance.

* If the instance does not exist → create it.
* If it exists → return the existing one.

---

### Step 4: Return the Same Instance Every Time

Ensure that the same object is returned for every request.

---

# Basic Singleton Implementation (Lazy Initialization)

```java
class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton instance created");
    }

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
```

---

# Usage

```java
public class Main {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
    }
}
```

---

# Output

```
Singleton instance created
true
```

Explanation:

* The constructor is called **only once**.
* Both `s1` and `s2` refer to the **same object**.

---

# Thread-Safe Singleton

In multithreading environments, two threads may create multiple instances simultaneously.

To prevent this, we use **synchronization**.

```java
class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
```

---

# Double Checked Locking (Better Performance)

To avoid unnecessary synchronization overhead:

```java
class Singleton {

    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {

        if (instance == null) {

            synchronized (Singleton.class) {

                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
```

---

# Eager Initialization

In this approach, the instance is created **when the class is loaded**.

```java
class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
```

Advantage:

* Thread safe

Disadvantage:

* Instance is created even if it is **never used**

---

# Real World Example

## Logger System

A logging system should use a **single logger instance** across the entire application.

```java
class Logger {

    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
```

Usage:

```java
Logger logger = Logger.getInstance();
logger.log("Application started");
```

---

# Advantages

* Ensures a **single instance**
* Saves memory
* Provides a **global access point**
* Useful for shared resources

---

# Disadvantages

* Harder to unit test
* Global state can create hidden dependencies
* Thread safety must be handled carefully

---

# Common Use Cases

| Use Case              | Reason                  |
| --------------------- | ----------------------- |
| Logger                | Single logging instance |
| Database Connection   | Expensive resource      |
| Configuration Manager | Shared configuration    |
| Cache Manager         | Shared cache            |

---

# Conclusion

The **Singleton Design Pattern** ensures that a class has only **one instance** and provides a **global access point** to it.

It is useful when:

* Only one object should exist
* The object must be shared across the application
* The resource is expensive to create

---
