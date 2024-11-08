// Purpose: This file contains the ConcreteFactory2 class which implements the AbstractFactory interface.
public class ConcreteFactory2 implements  AbstractFactory {
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
