public class Main {
    public static void main(String[] args) {

        // Create a new SmartHomeControlHub object
        SmartHomeHub hub = new SmartHomeControlHub();

        // Create a new Light object
        Device light = new Light(hub);
        Device alarm = new AlarmSystem(hub);

        // Add the light to the hub
        ((SmartHomeControlHub) hub).addDevice(light);
        ((SmartHomeControlHub) hub).addDevice(alarm);


        // Trigger the alarm
        alarm.triggerEvent("intrusionDetected");



    }
}
