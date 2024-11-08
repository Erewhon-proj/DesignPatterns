public class Context {

    //State start with ConcreteStateA
    State state = new ConcreteStateA();

    void show(){
        state.show();
    }

    //Forward and Backwards methods change the state
    void forward(){
        state = state.forward();
    }
    void backwards(){
        state = state.backwards();
    }

}