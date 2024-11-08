//Refined Abstraction class - Bridge pattern
public class Rectangle extends Shape{

    // Constructor
    public Rectangle(Color color) {
        // Call the constructor of the superclass
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Rectangle filled with color: ");
        color.applyColor();
    }
}
