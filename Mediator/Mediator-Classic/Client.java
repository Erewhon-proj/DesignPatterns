public class Client {
    public static void main(String[] args) {

        // Create a new Mediator object.
        Mediator mediator = new ConcreteMediator();

        // Create two new Colleague objects.
        Colleague colleague1 = new ConcreteColleague1(mediator);
        Colleague colleague2 = new ConcreteColleague2(mediator);


        // Set the Mediator object for each Colleague.
        // if you want to remove the cast you can change the type of mediator to ConcreteMediator
        ((ConcreteMediator) mediator).setColleague1(colleague1);
        ((ConcreteMediator) mediator).setColleague2(colleague2);


        // Send a message from Colleague1 to Colleague2.
        colleague1.send("Hello, Colleague2! How are you?");
        // Send a message from Colleague2 to Colleague1.
        colleague2.send("Hello, Colleague1! I'm fine, thank you!");

    }
}
