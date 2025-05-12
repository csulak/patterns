# Mediator Design Pattern

The **Mediator** design pattern is a behavioral pattern that centralizes communication between objects, promoting loose coupling and simplifying object interactions. Instead of objects communicating directly with each other, they interact through a mediator, which handles the communication logic.

---

## 🧩 Key Components

1. **Mediator Interface**  
   Defines the contract for communication between objects. It provides methods for sending messages and managing participants.

2. **Concrete Mediator**  
   Implements the mediator interface and coordinates communication between objects (colleagues).

3. **Colleagues**  
   Objects that interact with each other through the mediator. They rely on the mediator to handle their interactions.

---

## 🛠 How It Works

1. **Colleagues** send messages to the **Mediator** instead of directly communicating with other colleagues.
2. The **Mediator** processes the message and determines how to handle it (e.g., forwarding it to other colleagues).
3. This reduces dependencies between colleagues, making the system easier to maintain and extend.

---

## 💡 Example: Chat Room

Imagine a chat room where users communicate with each other. Instead of users directly sending messages to each other, they send messages to a **ChatMediator**, which handles the delivery.

### Components in the Example

- **ChatMediator**: The interface defining the mediator's behavior.
- **ChatRoom**: The concrete mediator that manages communication between users.
- **User**: The abstract class representing a participant in the chat.
- **ChatUser**: A concrete implementation of a user.

