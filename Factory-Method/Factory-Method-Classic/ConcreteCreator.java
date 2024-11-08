public class ConcreteCreator extends Creator {

    @Override
    public Product factoryMethod(String type) {
        if (type.equals("A")) {
            return new ConcreteProductA();
        }else if (type.equals("B")) {
            return new ConcreteProductB();
        }else {
            return null;
        }
    }

}