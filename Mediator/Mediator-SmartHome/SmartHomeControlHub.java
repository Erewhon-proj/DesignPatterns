import java.util.ArrayList;
import java.util.List;

// This class is the concrete implementation of the SmartHomeHub interface.
// It is responsible for notifying all devices in the smart home network except the device that triggered the notification.
public class SmartHomeControlHub implements SmartHomeHub {

    private final List<Device> devices = new ArrayList<>();


    public void addDevice(Device device) {
        devices.add(device);
    }

    @Override
    public void notify(Device device, String event) {
        if (event.equals("intrusionDetected")) {
            System.out.println("Alarm: Intrusion detected");
            for (Device d : devices) {
                if (d instanceof Light) {
                    d.execute("turnON");
                } else if (d instanceof AlarmSystem) {
                    d.execute("activate");
                }
            }
        } else {
            System.out.println("Unknown event");
        }
    }

}
