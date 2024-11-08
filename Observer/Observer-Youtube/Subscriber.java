public interface Subscriber {

    void update(String channelName, String videoTitle);
    String getSubscriberName();
}
