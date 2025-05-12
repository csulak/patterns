# Command vs Observer Design Patterns

The **Command** and **Observer** design patterns serve different purposes and are used in distinct scenarios. Here's a concise comparison:

## Command Pattern

### Purpose
Encapsulates a request as an object, allowing you to:
- Parameterize objects with operations.
- Delay execution.
- Queue requests.

### Key Components
- **Command Interface**: Defines the `execute()` method.
- **Concrete Commands**: Implement the command interface and perform specific actions.
- **Invoker**: Triggers the command's execution.
- **Receiver**: The object that performs the actual work.

### Use Case
When you need to decouple the sender of a request from its receiver or support undo/redo functionality.

### Example
A remote control (**Invoker**) sends commands (**Concrete Commands**) to a TV (**Receiver**) to perform actions like turning on/off.

### Lucas explanation on Main.java
---

## Observer Pattern

### Purpose
Establishes a one-to-many dependency between objects so that when one object (**Subject**) changes state, all its dependents (**Observers**) are notified and updated automatically.

### Key Components
- **Subject**: Maintains a list of observers and notifies them of state changes.
- **Observer Interface**: Defines the `update()` method.
- **Concrete Observers**: Implement the observer interface and react to state changes.

### Use Case
When you need to notify multiple objects about changes in another object’s state.

### Example
A weather station (**Subject**) notifies displays (**Observers**) when temperature, humidity, or pressure changes.

---

## Key Differences

| **Aspect**       | **Command Pattern**                     | **Observer Pattern**                     |
|-------------------|-----------------------------------------|------------------------------------------|
| **Purpose**       | Encapsulates requests as objects.       | Notifies multiple objects of state changes. |
| **Relationship**  | Decouples sender and receiver.          | Establishes a one-to-many dependency.    |
| **Focus**         | Executing actions or operations.        | Reacting to state changes.               |
| **Example**       | Remote control triggering commands.     | Weather station updating displays.       |

---

## Summary
The **Command Pattern** focuses on encapsulating and executing actions, while the **Observer Pattern** focuses on notifying and updating dependent objects when a state changes.