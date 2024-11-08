// ConcreteStateA class implementing the State interface
class ConcreteStateA implements State{

    public void show(){
        System.out.println("ConcreteStateA");
    }

    public State forward(){
        System.out.println("Switching from ConcreteStateA to ConcreteStateB");
        return new ConcreteStateB();
    }

    public State backwards(){
        System.out.println("There is no previous state");
        return new ConcreteStateA();
    }

}