//Concrete Product class
public class SMSNotification  implements Notification {

    @Override
    public void sendMessage(String msg) {
        System.out.println("Sending SMS: " + msg);
    }
}
