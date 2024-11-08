//Concrete Implementor #1 for bridge pattern
public class RedColor implements Color {

    @Override
    public void applyColor() {
        System.out.println("red.");
    }
}
