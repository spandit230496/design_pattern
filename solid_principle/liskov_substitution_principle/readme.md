# Liskov Substitution Principle (LSP)

## Definition

The **Liskov Substitution Principle (LSP)** states:

> Objects of a superclass should be replaceable with objects of its subclasses **without breaking the program**.

In simple terms:

If **B is a subclass of A**, then **B should be usable wherever A is expected**, without causing errors or unexpected behavior.

---

# Example 1 — LSP Violation (Bird Example)

## Problem

Here `Penguin` inherits from `Bird`, but penguins cannot fly.

```python
class Bird:

    def fly(self):
        print("Bird is flying")


class Sparrow(Bird):

    def fly(self):
        print("Sparrow flies")


class Penguin(Bird):

    def fly(self):
        raise Exception("Penguins cannot fly")


def make_bird_fly(bird: Bird):
    bird.fly()


sparrow = Sparrow()
penguin = Penguin()

make_bird_fly(sparrow)   # Works
make_bird_fly(penguin)   # Breaks program
```

### Why this violates LSP

`Penguin` cannot substitute `Bird` correctly because the program crashes.

---

# Correct Design (Following LSP)

We separate behaviors using abstraction.

```python
from abc import ABC, abstractmethod


class Bird(ABC):
    pass


class FlyingBird(Bird):

    @abstractmethod
    def fly(self):
        pass


class Sparrow(FlyingBird):

    def fly(self):
        print("Sparrow is flying")


class Penguin(Bird):

    def swim(self):
        print("Penguin is swimming")


def make_bird_fly(bird: FlyingBird):
    bird.fly()


sparrow = Sparrow()
make_bird_fly(sparrow)
```

Now:

* Only flying birds implement `fly()`
* Penguins are not forced to implement flying

---

# LSP Method Rules

To maintain LSP when overriding methods, we follow three rules.

---

# 1️⃣ Method Argument Rule

The **method signature must remain compatible**.

❌ Wrong Example

```python
class Parent:

    def print_message(self, message: str):
        print("Parent:", message)


class Child(Parent):

    # Wrong: argument type changed
    def print_message(self, message: int):
        print("Child:", message)
```

This breaks substitution because the expected input type changed.

---

### Correct Example

```python
class Parent:

    def print_message(self, message: str):
        print("Parent:", message)


class Child(Parent):

    def print_message(self, message: str):
        print("Child:", message)


def client(obj: Parent):
    obj.print_message("Hello")


client(Parent())
client(Child())
```

Now `Child` can safely replace `Parent`.

---

# 2️⃣ Return Type Rule (Covariance)

A subclass method can return:

* the **same type**
* or a **narrower (child) type**

```python
class Animal:

    def speak(self):
        return "Animal sound"


class Dog(Animal):

    def speak(self):
        return "Bark"


class Parent:

    def get_animal(self) -> Animal:
        return Animal()


class Child(Parent):

    # returning subtype (Dog)
    def get_animal(self) -> Animal:
        return Dog()


def client(obj: Parent):
    animal = obj.get_animal()
    print(animal.speak())


client(Parent())
client(Child())
```

Output:

```
Animal sound
Bark
```

This follows LSP.

---

# 3️⃣ Exception Rule

A subclass should **not throw broader exceptions** than the parent.

```python
class Parent:

    def process(self):
        raise ValueError("Parent error")


class Child(Parent):

    def process(self):
        # narrower or same exception
        raise ValueError("Child error")


def client(obj: Parent):

    try:
        obj.process()

    except ValueError as e:
        print("Handled:", e)


client(Parent())
client(Child())
```

Output:

```
Handled: Parent error
Handled: Child error
```

The client can handle both safely.

---

# Summary of LSP Rules

| Rule                 | Meaning                                  |
| -------------------- | ---------------------------------------- |
| Method Argument Rule | Method parameters must remain compatible |
| Return Type Rule     | Return same type or subtype              |
| Exception Rule       | Do not throw broader exceptions          |

---

# Key Takeaway

The **Liskov Substitution Principle ensures that subclasses truly behave like their parent classes**, allowing objects to be replaced safely without breaking the program.

---

# Interview Definition

> The Liskov Substitution Principle states that subclasses must be substitutable for their base classes without altering the correctness of the program.
