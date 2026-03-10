# Abstract Factory Design Pattern

## Overview

The **Abstract Factory Pattern** is a **creational design pattern** that provides an interface for creating **families of related or dependent objects without specifying their concrete classes**.

It allows the client code to work with **multiple product families** while keeping the creation logic encapsulated in factory classes.

This pattern is useful when a system must be independent of **how its products are created, composed, and represented**.

---

# Problem

Suppose we have a restaurant system that produces:

* Burgers
* Garlic Bread

Different restaurants provide their own variants of these products.

Example:

Singh Restaurant:

* Basic Burger
* Simple Garlic Bread

King Restaurant:

* Premium Burger
* Premium Garlic Bread

We want to ensure that each restaurant creates its **own family of related products**.

---

# Solution

Use the **Abstract Factory Pattern**.

We define:

1. Abstract Product Interfaces
2. Concrete Product Implementations
3. Abstract Factory
4. Concrete Factories
5. Client Code

---

# UML Diagram

```
                   <<Abstract>>
                    MealFactory
          + create_burger(type)
          + create_garlic_bread(type)

             /                        \
            /                          \
   SinghRestaurant              KingRestaurant
 +create_burger()              +create_burger()
 +create_garlic_bread()        +create_garlic_bread()


        <<Abstract>> Burger
             + prepare()

        /                   \
 BasicBurger          PremiumBurger


     <<Abstract>> GarlicBread
           + prepare()

        /                  \
SimpleGarlicBread     PremiumGarlicBread
```

---

# Structure

```
abstract_factory_pattern
│
├── classes
│   ├── king_restaurant.py
│   └── singh_restaurant.py
│
├── factory
│   └── meal_factory.py
│
├── burger_class
│   ├── basic_burger.py
│   └── premium_burger.py
│
├── garlic_bread
│   ├── simple_garlic_bread.py
│   └── premium_garlic_bread.py
│
└── main.py
```

---

# Example Implementation (Python)

## Abstract Factory

```python
from abc import ABC, abstractmethod

class MealFactory(ABC):

    @abstractmethod
    def create_burger(self, type):
        pass

    @abstractmethod
    def create_garlic_bread(self, type):
        pass
```

---

# Product Interface

```python
from abc import ABC, abstractmethod

class Burger(ABC):

    @abstractmethod
    def prepare(self):
        pass
```

---

# Concrete Products

```python
class BasicBurger:
    def prepare(self):
        print("Preparing Basic Burger")
```

```python
class PremiumBurger:
    def prepare(self):
        print("Preparing Premium Burger")
```

---

# Concrete Factory

```python
from factory.meal_factory import MealFactory
from burger_class.basic_burger import BasicBurger
from burger_class.premium_burger import PremiumBurger

class KingRestaurant(MealFactory):

    def create_burger(self, type):

        if type == "basic":
            return BasicBurger()

        elif type == "premium":
            return PremiumBurger()
```

---

# Client Code

```python
from classes.king_restaurant import KingRestaurant

factory = KingRestaurant()

burger = factory.create_burger("premium")

burger.prepare()
```

Output:

```
Preparing Premium Burger
```

---

# Advantages

* Promotes **consistency between products**
* Supports **Open/Closed Principle**
* Encapsulates object creation
* Client code works with **interfaces not implementations**

---

# Disadvantages

* Adds additional classes
* Increases complexity for small systems

---

# When to Use

Use Abstract Factory when:

* The system needs to create **multiple families of related objects**
* Products must be **used together**
* You want to **decouple client code from object creation**

---

# Real World Examples

* UI frameworks (Windows UI vs Mac UI components)
* Database drivers
* Payment gateways
* Cross-platform software libraries

---

# Related Patterns

* Factory Method
* Builder
* Prototype
