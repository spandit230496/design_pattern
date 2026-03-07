Here is the **DIP explanation and Python code in `.md` format** so you can save it as a Markdown file.

# Dependency Inversion Principle (DIP) in Python

## Definition

The **Dependency Inversion Principle (DIP)** states:

1. High-level modules should not depend on low-level modules.
2. Both should depend on **abstractions**.
3. Abstractions should not depend on details.
4. Details should depend on abstractions.

---

# 1. DIP Violation (Wrong Design)

In this example, the high-level class `Switch` directly depends on the low-level class `LightBulb`.

```python
class LightBulb:

    def turn_on(self):
        print("LightBulb ON")

    def turn_off(self):
        print("LightBulb OFF")


class Switch:

    def __init__(self):
        self.bulb = LightBulb()  # Direct dependency

    def operate(self):
        self.bulb.turn_on()


switch = Switch()
switch.operate()
```

## Problems

* The `Switch` class is tightly coupled with `LightBulb`.
* If we want to add another device (like a Fan), we must modify the `Switch` class.
* This violates the **Dependency Inversion Principle**.

---

# 2. Correct Design (Using Dependency Inversion)

We introduce an **abstraction (interface)** using Python's `ABC`.

```python
from abc import ABC, abstractmethod


# Abstraction
class Device(ABC):

    @abstractmethod
    def turn_on(self):
        pass


# Low-level module
class LightBulb(Device):

    def turn_on(self):
        print("LightBulb ON")


# Another low-level module
class Fan(Device):

    def turn_on(self):
        print("Fan ON")


# High-level module
class Switch:

    def __init__(self, device: Device):
        self.device = device

    def operate(self):
        self.device.turn_on()


bulb = LightBulb()
fan = Fan()

switch1 = Switch(bulb)
switch1.operate()

switch2 = Switch(fan)
switch2.operate()
```

## Output

```
LightBulb ON
Fan ON
```

---

# Explanation

| Component       | Type              |
| --------------- | ----------------- |
| Device          | Abstraction       |
| LightBulb / Fan | Low-level modules |
| Switch          | High-level module |

Dependency structure:

```
Switch → Device (abstraction)
LightBulb → Device
Fan → Device
```

Now the high-level module `Switch` does **not depend on concrete implementations**.

---

# Key Takeaway

The **Dependency Inversion Principle** helps us:

* Reduce tight coupling
* Improve flexibility
* Make the system easier to extend and maintain

---

# Interview Definition

> Dependency Inversion Principle states that **high-level modules should not depend on low-level modules. Both should depend on abstractions.**


