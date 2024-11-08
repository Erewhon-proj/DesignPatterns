// Purpose: This class is a concrete implementation of the Colleague interface.
// It is used to send and receive messages from the Mediator.
public class ConcreteColleague2 implements Colleague{

    // The Mediator object that this Colleague will communicate with.
    private Mediator mediator;

    // Constructor
    public ConcreteColleague2(Mediator mediator) {
        this.mediator = mediator;
    }

    // Sends a message to another Colleague.
    @Override
    public void send(String message) {
        System.out.println("ConcreteColleague2 sends message: " + message);
        mediator.notify(this, message);
    }

    // Receives a message from another Colleague.
    @Override
    public void receive(String message) {
        System.out.println("ConcreteColleague2 receives message: " + message);
    }
}