public class Client {
    public static void main(String[] args) {

        // Create subject
        ConcreteSubject subject = new ConcreteSubject();

        // Create observers
        ConcreteObserver observer1 = new ConcreteObserver("Dario");
        ConcreteObserver observer2 = new ConcreteObserver("Gregorio");

        // Attach observers to the subject
        subject.attach(observer1);
        subject.attach(observer2);


        // Change state and notify observers
        subject.setState("There is a new video");
        subject.setState("There is a new article");

    }
}