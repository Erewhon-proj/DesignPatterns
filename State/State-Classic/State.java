// State interface for the state pattern
public interface State {

    void show();
    State forward();
    State backwards();
}