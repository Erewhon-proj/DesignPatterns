public class Client {
    public static void main(String[] args) {

        // Create a YouTube channel
        YoutubeChannel myChannel = new MyChannel("Fake Channel");


        // Create subscribers
        Subscriber subscriber1 = new ConcreteSubscriber("Alice_77");
        Subscriber subscriber2 = new ConcreteSubscriber("Ash&Bob");
        Subscriber subscriber3 = new ConcreteSubscriber("xKimiko");

        // Subscribers subscribe to the channel
        myChannel.subscribe(subscriber1);
        myChannel.subscribe(subscriber2);
        myChannel.subscribe(subscriber3);

        // New video uploaded to the channel
        /*If you want to remove the cast (MyChannel) you can change the type of myChannel to MyChannel*/
        ((MyChannel) myChannel).newVideo("Design Pattern Observer in Java");

        // Unsubscribe a subscriber
        myChannel.unsubscribe(subscriber1);

        // New video uploaded to the channel
        ((MyChannel) myChannel).newVideo("Design Pattern Singleton in Java");


    }
}
