# Observer Design Pattern (Java)

## Overview

The **Observer Design Pattern** is a **behavioral design pattern** that defines a **one-to-many dependency** between objects.
When the state of one object (**Subject / Observable**) changes, all its dependent objects (**Observers**) are **notified automatically**.

This pattern is widely used in **event-driven systems**, **notification services**, and **publish–subscribe architectures**.

Example:
A **YouTube Channel** uploads a video → All **Subscribers** receive a notification.

---

## Problem Statement

In many systems, multiple objects need to react to a change in another object’s state.

Example:

* A YouTube channel uploads a video.
* All subscribers should receive a notification.

Instead of tightly coupling the channel with each subscriber, we use the **Observer Pattern** to keep the system **loosely coupled and extensible**.

---

## Project Structure

```
observer_design_pattern
│
├── interfaces
│   ├── Observable.java
│   └── Observer.java
│
├── concrete_class
│   ├── YoutubeChannel.java
│   └── Subscriber.java
│
└── Main.java
```

---

## Components of the Observer Pattern

### 1. Observable (Subject)

The object that maintains a list of observers and notifies them when a change occurs.

Responsibilities:

* Register observers
* Remove observers
* Notify observers

Example:

```
YoutubeChannel
```

---

### 2. Observer

The interface that defines the **update method**.
Observers implement this interface to receive notifications.

Example:

```
Subscriber
```

---

### 3. Concrete Observable

The actual class that stores observers and triggers notifications.

Example:

```
YoutubeChannel uploads a new video → notify all subscribers
```

---

### 4. Concrete Observer

Classes that subscribe to the observable and receive updates.

Example:

```
Subscriber objects receiving video notifications
```

---

## Workflow

1. A **YoutubeChannel** object is created.
2. **Subscribers** register themselves with the channel.
3. When a new video is uploaded:
4. The channel calls `notifyObservers()`.
5. Each subscriber receives an update.

```
YoutubeChannel
      │
      │ uploadVideo()
      ▼
notifyObservers()
      │
      ▼
Subscribers receive update
```

---

## Example Output

```
Sandip received notification: Observer Pattern in Java
Rahul received notification: Observer Pattern in Java
```

---

## Advantages

* **Loose coupling** between subject and observers
* Observers can be **added or removed dynamically**
* Supports **broadcast communication**
* Easy to extend without modifying existing code

---

## Disadvantages

* If there are too many observers, notification may become slower
* Improper removal of observers can lead to **memory leaks**

---

## Real-World Use Cases

* YouTube subscriptions
* Stock market updates
* Weather monitoring systems
* Event listeners in GUI frameworks
* Notification systems
* Messaging systems (Kafka / Pub-Sub)

---

## Technologies Used

* Java
* Object-Oriented Programming
* Design Patterns (Behavioral)


