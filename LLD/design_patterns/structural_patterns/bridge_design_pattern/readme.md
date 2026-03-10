# Bridge Design Pattern

The **Bridge Design Pattern** is a **structural design pattern** that separates an abstraction from its implementation so that both can evolve independently.

Instead of creating multiple subclasses for every combination, the Bridge pattern splits the system into **two independent hierarchies**.

---

# Problem

Consider a **Remote Control system** that works with different devices.

If we design it using inheritance:

```
BasicRemoteSonyTV
BasicRemoteSamsungTV
AdvancedRemoteSonyTV
AdvancedRemoteSamsungTV
```

As new remotes and devices are added, the number of classes increases rapidly.

### Issues

* Class explosion
* Tight coupling
* Hard to maintain
* Difficult to extend

---

# Solution

The Bridge Pattern **decouples abstraction from implementation**.

Instead of inheritance, it connects them using **composition**.

```
Remote  ------>  Device
```

This allows:

* Adding new **Remotes** without modifying devices
* Adding new **Devices** without modifying remotes

---

# Structure

The Bridge Pattern consists of four components.

### 1. Abstraction

High-level interface that maintains a reference to the implementor.

### 2. Refined Abstraction

Extends abstraction and adds extra features.

### 3. Implementor

Interface that defines implementation methods.

### 4. Concrete Implementor

Actual implementation of the implementor interface.

---

# UML Diagram

```
        Abstraction
            |
            | has-a
            v
        Implementor
          /      \
         /        \
ConcreteImplA  ConcreteImplB

            ^
            |
      RefinedAbstraction
```

---

# Java Example

## 1. Implementor

```java
interface Device {
    void turnOn();
    void turnOff();
}
```

---

## 2. Concrete Implementations

```java
class TV implements Device {

    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }
}

class Radio implements Device {

    public void turnOn() {
        System.out.println("Radio is ON");
    }

    public void turnOff() {
        System.out.println("Radio is OFF");
    }
}
```

---

## 3. Abstraction

```java
class RemoteControl {

    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void powerOn() {
        device.turnOn();
    }

    public void powerOff() {
        device.turnOff();
    }
}
```

---

## 4. Refined Abstraction

```java
class AdvancedRemote extends RemoteControl {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Device muted");
    }
}
```

---

## 5. Client Code

```java
public class Main {

    public static void main(String[] args) {

        Device tv = new TV();
        RemoteControl remote = new RemoteControl(tv);

        remote.powerOn();
        remote.powerOff();

        Device radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);

        advancedRemote.powerOn();
        advancedRemote.mute();
    }
}
```

---

# Output

```
TV is ON
TV is OFF
Radio is ON
Device muted
```

---

# Real World Examples

### Remote Control Systems

Remote controlling multiple devices:

* TV
* Radio
* Air Conditioner

### Payment Gateways

Payment abstraction working with different providers:

* Stripe
* Razorpay
* PayPal

### Database Drivers

ORM working with multiple databases:

* MySQL
* PostgreSQL
* SQLite

---

# Advantages

* Decouples abstraction from implementation
* Reduces subclass explosion
* Improves maintainability
* Follows Open/Closed Principle

---

# Disadvantages

* Adds extra abstraction layers
* Slightly increases complexity

---

# Bridge vs Strategy Pattern

| Feature      | Bridge                                  | Strategy                      |
| ------------ | --------------------------------------- | ----------------------------- |
| Pattern Type | Structural                              | Behavioral                    |
| Purpose      | Separate abstraction and implementation | Change algorithms dynamically |
| Hierarchies  | Two hierarchies                         | One hierarchy                 |

---

# Key Interview Answer

**Strategy Pattern**

Used when you want to **change algorithms dynamically at runtime**.

**Bridge Pattern**

Used when you want to **separate abstraction from implementation so both can evolve independently**.

---

# Simple Rule to Remember

Ask this question:

**Are we changing algorithms?**

Yes → Strategy Pattern

No → Continue

**Are we separating abstraction from implementation?**

Yes → Bridge Pattern
