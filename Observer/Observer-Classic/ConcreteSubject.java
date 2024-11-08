public class ConcreteSubject extends Subject {

    // State of the subject
    private String state;

    // Set the state and notify observers
    void setState(String state){
        this.state = state;
        setChanged();
        notifyObservers(state);
    }


    public String getState() {
        return state;
    }
}
