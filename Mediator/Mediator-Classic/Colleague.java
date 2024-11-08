// Purpose: Interface for Colleague objects.
public interface Colleague {
    // Send a message to another Colleague.
    void send(String message);
    // Receive a message from another Colleague.
    void receive(String message);
}
