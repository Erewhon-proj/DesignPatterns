import java.util.ArrayList;
import java.util.List;

//Concrete Subject class in Observer pattern
public class MyChannel implements YoutubeChannel {

    private final List<Subscriber> subscribers = new ArrayList<>();
    private final String channelName;

    // Constructor to set the channel name
    public MyChannel(String channelName) {
        this.channelName = channelName;
    }

    // Method to upload a new video
    public void newVideo(String videoTitle) {
        System.out.println("New video: " + videoTitle + " is uploaded to " + channelName);
        notifySubscribers(videoTitle);
    }

    @Override
    // Method to subscribe to the channel
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber.getSubscriberName() + " subscribed to " + channelName);
    }

    @Override
    // Method to unsubscribe from the channel
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber.getSubscriberName() + " unsubscribed from " + channelName);
    }

    @Override
    // Method to notify all subscribers
    public void notifySubscribers(Object state) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(channelName, (String) state);
        }
    }
}
