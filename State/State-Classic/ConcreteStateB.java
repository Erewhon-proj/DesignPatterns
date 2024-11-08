//ConcreteStateB class implementing the State interface
public class ConcreteStateB implements State{

    public void show(){
        System.out.println("ConcreteStateB");
    }

    public State forward(){
        System.out.println("There is no next state");
        return new ConcreteStateB();
    }

    public State backwards(){
        System.out.println("Switching from ConcreteStateB to ConcreteStateA");
        return new ConcreteStateA();
    }

}