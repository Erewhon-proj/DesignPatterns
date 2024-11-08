// Concrete Product class
public class EmailNotification implements  Notification{
    @Override
    public void sendMessage(String msg) {
        System.out.println("Sending Email: " + msg);
    }
}
