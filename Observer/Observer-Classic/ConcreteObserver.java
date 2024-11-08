public class ConcreteObserver implements Observer{

    private final String ObserverName;

    // Constructor sets the observer name
    ConcreteObserver(String observerName){
        this.ObserverName = observerName;
    }

    // Update method prints the message received from the subject
    @Override
    public void update(Subject subject, Object state)  {
        String s = ((ConcreteSubject) subject).getState();
        System.out.println(ObserverName + " received message: " + s);
    }
}
