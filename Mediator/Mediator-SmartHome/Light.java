// Concrete Colleague is a class that implements the Colleague interface.
// It has two methods, send and receive.
public class Light implements Device {

    private final SmartHomeHub hub;

    public Light(SmartHomeHub hub) {
        this.hub = hub;
    }

    @Override
    public void execute(String command) {
        if (command.equals("turnON")) {
            System.out.println("Light is on");
        } else if (command.equals("turnOFF")) {
            System.out.println("Light is off");
        }
    }

    @Override
    public void triggerEvent(String event) {
        hub.notify(this, event);
    }
}
