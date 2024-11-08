// Purpose: ConcreteMediator class for the Mediator Design Pattern
public class ConcreteMediator implements Mediator {

    // ConcreteMediator has a reference to all the colleagues
    private Colleague colleague1;
    private Colleague colleague2;

    // Setters for the colleagues
    public void setColleague1(Colleague colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Colleague colleague2) {
        this.colleague2 = colleague2;
    }

    // ConcreteMediator implements the notify method
    @Override
    public void notify(Colleague colleague, String event) {
        if (colleague == colleague1) {
            colleague2.receive(event);
        } else {
            colleague1.receive(event);
        }
    }


}
