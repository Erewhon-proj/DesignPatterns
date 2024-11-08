import java.util.concurrent.Flow;

// Subject class in Observer pattern
public interface YoutubeChannel {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers(Object state);

}

