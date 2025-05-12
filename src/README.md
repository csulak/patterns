# Design Patterns Exercise Project

This project is an exercise in implementing and understanding various design patterns in Java. Each package demonstrates a specific design pattern or concept, showcasing its structure, components, and use cases.

## Packages and Design Patterns

### [Abstract Classes](src/abstractClasses)
The **Abstract Classes** package demonstrates the use of abstract classes in Java to define common behavior and enforce specific implementations in subclasses.
- **Key Classes**: `Animal`, `Dog`, `Labrador`

### [Command Pattern](src/patternCommand/README.md)
The **Command Pattern** encapsulates requests as objects, allowing for parameterization, queuing, and undo/redo functionality.
- **Key Classes**: `ICommand`, `CommandRetire`, `CommandDeposit`, `Invoker`, `User`

### [Mediator Pattern](src/patternMediator/README.md)
The **Mediator Pattern** centralizes communication between objects, promoting loose coupling by ensuring objects interact through a mediator.
- **Key Classes**: `ChatMediator`, `User`, `ConcreteChatMediator`

### [Observer Pattern](src/patternObserver/README.md)
The **Observer Pattern** establishes a one-to-many dependency between objects, ensuring that when one object changes state, all its dependents are notified.
- **Key Classes**: `Subject`, `Observer`, `ConcreteObserver`

### [Strategy Pattern](src/patternStrategy/README.md)
The **Strategy Pattern** defines a family of algorithms, encapsulates each one, and makes them interchangeable.
- **Key Classes**: `Strategy`, `ConcreteStrategyA`, `ConcreteStrategyB`, `Context`

---

## How to Navigate

Click on the package names above to explore the implementation of each design pattern. Each package contains a `README.md` file with detailed explanations and examples of the pattern or concept.