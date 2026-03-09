# Prototype Design Pattern in Python

## Overview

The **Prototype Design Pattern** is a **creational design pattern** that allows you to create new objects by **cloning an existing object (prototype)** instead of creating a new one from scratch.

This pattern is useful when object creation is **expensive**, **complex**, or when multiple objects share **similar configurations**.

Instead of using constructors repeatedly, the system **copies an existing object**.

---

# When to Use Prototype Pattern

Use this pattern when:

* Object creation is **costly**
* You need **many similar objects**
* Object configuration is **complex**
* You want to **avoid subclassing factories**
* Object state must be **duplicated efficiently**

---

# UML Diagram

```
        +----------------------+
        |      Prototype       |
        |----------------------|
        | + clone()            |
        +----------+-----------+
                   |
                   |
          +--------+---------+
          | ConcretePrototype|
          |------------------|
          | data             |
          | + clone()        |
          +------------------+

                   |
                   |
               Client
```

---

# Implementation in Python

## Step 1: Prototype Interface

```python
from abc import ABC, abstractmethod

class Prototype(ABC):

    @abstractmethod
    def clone(self):
        pass
```

---

## Step 2: Concrete Prototype

```python
import copy

class Document(Prototype):

    def __init__(self, title, content):
        self.title = title
        self.content = content

    def clone(self):
        return copy.deepcopy(self)

    def show(self):
        print(f"Title: {self.title}")
        print(f"Content: {self.content}")
```

---

## Step 3: Client Code

```python
# create original object
doc1 = Document("Report", "This is the original report")

# clone object
doc2 = doc1.clone()

# modify cloned object
doc2.title = "Report Copy"

doc1.show()
print("------")
doc2.show()
```

---

# Output

```
Title: Report
Content: This is the original report

------
Title: Report Copy
Content: This is the original report
```

---

# How It Works

1. Create a **prototype object**
2. Call the **clone() method**
3. A **deep copy** of the object is created
4. Modify the cloned object if needed

```
Prototype Object
       |
       | clone()
       v
   New Object
```

---

# Deep Copy vs Shallow Copy

## Shallow Copy

Copies references only.

```python
copy.copy(obj)
```

Changes in nested objects may affect both copies.

---

## Deep Copy

Creates a completely independent object.

```python
copy.deepcopy(obj)
```

Prototype pattern usually uses **deep copy**.

---

# Advantages

* Faster object creation
* Reduces complex initialization
* Avoids subclass explosion
* Allows runtime object duplication

---

# Disadvantages

* Deep copying complex objects can be difficult
* Circular references may create issues
* Requires careful cloning logic

---

# Real World Use Cases

### Document Templates

Creating new documents from a template.

### Game Development

Cloning enemies or characters.

### GUI Systems

Duplicating UI components.

### Database Records

Creating copies of preconfigured objects.

---

# Simple Example

```python
import copy

class Car:

    def __init__(self, model, color):
        self.model = model
        self.color = color

    def clone(self):
        return copy.deepcopy(self)


car1 = Car("Tesla", "Red")

car2 = car1.clone()
car2.color = "Blue"

print(car1.model, car1.color)
print(car2.model, car2.color)
```

Output

```
Tesla Red
Tesla Blue
```

# Interview Definition

**Prototype Pattern**

> A creational design pattern that creates new objects by **cloning an existing object instead of instantiating a new one**.



## 1. What is the Prototype Design Pattern?

Explain the Prototype Design Pattern and when it should be used.
Provide an example where cloning objects is better than creating them using constructors.

---

## 2. Why is `deepcopy` used in the Prototype Pattern instead of `copy`?

Explain the difference between **shallow copy** and **deep copy** and why `deepcopy` is generally preferred when implementing the Prototype Pattern.

---

## 3. What problem does the Prototype Pattern solve?

Describe the problem that the Prototype Pattern addresses in software design.

---

## 4. Explain the difference between `copy.copy()` and `copy.deepcopy()` in Python.

Give examples showing how both behave differently when objects contain nested structures like lists or dictionaries.

---

## 5. What are the advantages of using the Prototype Pattern?

Discuss the benefits of using this pattern in large systems.

Examples:

* Faster object creation
* Avoiding complex constructors
* Reducing subclassing

---

## 6. When should the Prototype Pattern be avoided?

Explain scenarios where using the Prototype Pattern may introduce unnecessary complexity.

---

## 7. Implement the Prototype Pattern in Python.

Create a class with a `clone()` method that returns a copy of the object.

Example requirement:

* Create a `Document` class
* Add fields like `title` and `content`
* Implement `clone()` using `deepcopy`

---

## 8. What is a Prototype Registry?

Explain how a **Prototype Registry** works and how it helps manage multiple prototypes in a system.

---

## 9. What is the difference between Prototype Pattern and Factory Pattern?

Compare both patterns in terms of:

| Feature         | Prototype Pattern | Factory Pattern |
| --------------- | ----------------- | --------------- |
| Object Creation | Cloning           | Instantiation   |
| Approach        | Instance-based    | Class-based     |
| Flexibility     | High              | Moderate        |

---

## 10. Real-World Use Cases of Prototype Pattern

Provide real-world scenarios where Prototype Pattern is useful.

Examples:

* Document templates
* Game character cloning
* UI component duplication
* Database object templates

---

## 11. What happens if we use shallow copy in Prototype Pattern?

Explain the potential problems caused by shallow copying when objects contain nested references.

---

## 12. Write a Python example showing the problem with shallow copy.

Create a program where modifying a nested object in the cloned instance affects the original object.

---


# Conclusion

The Prototype Pattern improves performance and flexibility when dealing with **complex object creation**. By cloning existing objects, systems can avoid costly initialization and easily create variations of objects.

---
