// Purpose: This class is a concrete implementation of the Colleague interface.
// It is used to send and receive messages from the Mediator.
public class ConcreteColleague1 implements Colleague{

    // Purpose: The Mediator object that this Colleague will communicate with
    private final Mediator mediator;

    // Purpose: Constructor
    public ConcreteColleague1(Mediator mediator) {
        this.mediator = mediator;
    }

    // Purpose: Sends a message to another Colleague.
    @Override
    public void send(String message) {
        System.out.println("ConcreteColleague1 is sending a message: " + message);
        mediator.notify(this, message);
    }

    // Purpose: Receives a message from another Colleague.
    @Override
    public void receive(String message) {
        System.out.println("ConcreteColleague1 received a message: " + message);
    }
}
