# Template Method Design Pattern (Java)

## Overview

The **Template Method Pattern** is a **behavioral design pattern** that defines the **skeleton of an algorithm in a base class** while allowing subclasses to **override specific steps without changing the algorithm structure**.

The parent class controls the **overall workflow**, while subclasses customize **individual steps**.

---

## Key Idea

Instead of letting subclasses define the whole algorithm, the **base class defines the template of the algorithm**, and subclasses implement only the parts that vary.

```
Algorithm Structure (Fixed)
        ↓
Common Steps
        ↓
Customizable Steps
        ↓
Subclass Implementation
```

---

## Structure

```
AbstractClass
 ├── templateMethod()
 ├── commonStep()
 ├── abstractStep()

ConcreteClassA
 └── implements abstractStep()

ConcreteClassB
 └── implements abstractStep()
```

---

## Example: Beverage Preparation

### Step 1: Abstract Template Class

```java
abstract class Beverage {

    // Template Method
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    abstract void brew();

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void addCondiments();
}
```

---

### Step 2: Tea Implementation

```java
class Tea extends Beverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
```

---

### Step 3: Coffee Implementation

```java
class Coffee extends Beverage {

    @Override
    void brew() {
        System.out.println("Brewing coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
```

---

### Step 4: Main Class

```java
public class Main {

    public static void main(String[] args) {

        Beverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println();

        Beverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
```

---

## Output

```
Boiling water
Steeping the tea
Pouring into cup
Adding lemon

Boiling water
Brewing coffee
Pouring into cup
Adding sugar and milk
```

---

## UML Diagram

```
        Beverage
   -------------------
   + prepareRecipe()
   + boilWater()
   + pourInCup()
   + brew() (abstract)
   + addCondiments() (abstract)
           |
     ----------------
     |              |
    Tea          Coffee
```

---

## Key Concepts

### Template Method

Defines the **algorithm structure**.

```
prepareRecipe()
```

---

### Abstract Methods

Steps that **must be implemented by subclasses**.

```
brew()
addCondiments()
```

---

### Concrete Methods

Steps that are **common across all subclasses**.

```
boilWater()
pourInCup()
```

---

## Advantages

* Promotes **code reuse**
* Enforces **algorithm structure**
* Allows **flexibility for subclasses**
* Reduces **duplicate code**

---

## Disadvantages

* Uses **inheritance**, which can increase class coupling
* Harder to modify if algorithm changes frequently

---

## Real World Examples

* **Spring Framework – JdbcTemplate**
* **Servlet lifecycle (doGet, doPost)**
* **JUnit testing framework**
* **Java Collections**

---

## When to Use

Use the Template Pattern when:

* Multiple classes share **the same algorithm structure**
* Only **specific steps differ**
* You want to **avoid duplicating code**

---

## Template Pattern vs Strategy Pattern

| Template Pattern          | Strategy Pattern          |
| ------------------------- | ------------------------- |
| Uses inheritance          | Uses composition          |
| Algorithm structure fixed | Algorithm interchangeable |
| Compile-time behavior     | Runtime behavior          |

---

## Summary

The **Template Method Pattern** ensures that the **core workflow of an algorithm remains unchanged**, while allowing subclasses to customize certain steps.

It is widely used in frameworks where the **framework controls the flow and the developer fills in specific behaviors**.
