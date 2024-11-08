public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        AbstractProductA productA = factory.createProductA();
        productA.display();

        AbstractProductB productB = factory.createProductB();
        productB.display();
    }
}
