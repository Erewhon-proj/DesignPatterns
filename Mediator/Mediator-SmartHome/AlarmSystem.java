public class AlarmSystem implements Device {
    private final SmartHomeHub hub;

    public AlarmSystem(SmartHomeHub hub) {
        this.hub = hub;
    }

    @Override
    public void execute(String command) {
        if (command.equals("activate")) {
            System.out.println("Alarm system activated");
        }else if (command.equals("deactivate")) {
            System.out.println("Alarm system deactivated");
        }
    }

    @Override
    public void triggerEvent(String event) {
        hub.notify(this, event);
    }
}
