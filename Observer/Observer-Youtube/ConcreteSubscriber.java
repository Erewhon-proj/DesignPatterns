public class ConcreteSubscriber implements Subscriber {

    private final String name;

    public ConcreteSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println(name + " received a notification from " + channelName + " about a new video: " + videoTitle);
    }

    @Override
    public String getSubscriberName() {
        return name;
    }

}
