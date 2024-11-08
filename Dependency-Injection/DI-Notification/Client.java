// Client class is responsible for sending messages using Notification interface
public class Client {
    private final Notification notification;

    // Constructor (Dependency Injection)
    public Client(NotificationFactory factory) {
        this.notification = factory.createNotification();
    }

    public void send (String message) {
        notification.sendMessage(message);
    }

    public static void main(String[] args) {

        // Injection EmailNotification
        NotificationFactory emailFactory = new EmailNotificationFactory();
        Client emailClient = new Client(emailFactory);
        emailClient.send("Email message");

        // Injection SMSNotification
        NotificationFactory smsFactory = new SMSNotificationFactory();
        Client smsClient = new Client(smsFactory);
        smsClient.send("SMS message");
    }


}
