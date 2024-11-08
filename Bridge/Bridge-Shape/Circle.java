// RefinedAbstraction class
public class Circle extends Shape{

    // Constructor
    public Circle(Color color) {
        // Call the constructor of the superclass
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Circle filled with color: ");
        color.applyColor();
    }
}
