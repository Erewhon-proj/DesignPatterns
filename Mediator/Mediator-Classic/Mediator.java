// Purpose: Mediator interface for the Mediator design pattern.
public interface Mediator {
    // The notify method is implemented by the ConcreteMediator class
    void notify(Colleague colleague, String event);
}

