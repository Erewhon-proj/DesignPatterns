// Purpose: This file contains the ConcreteFactory1 class which implements the AbstractFactory interface.
public class ConcreteFactory1 implements AbstractFactory {

    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    public AbstractProductB createProductB() {
        return new ProductB1();
    }

}
