import java.util.ArrayList;
import java.util.List;

public class Subject {

    private final List<Observer> observers = new ArrayList<>();
    private boolean changed = false;


    void attach(Observer observer) {
        observers.add(observer);
    }

    void detach(Observer observer) {
        observers.remove(observer);
    }

    void notifyObservers(Object state) {
        // If there are no changes, do not notify observers
        if (!changed) {
            return;
        }
        // Notify all observers
        for (Observer observer : observers) {
            observer.update(this, state);
        }
        // Reset the changed flag
        changed = false;
    }

    void setChanged() {
        changed = true;
    }
}
