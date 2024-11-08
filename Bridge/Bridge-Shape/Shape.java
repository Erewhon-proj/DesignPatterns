// Abstraction class - Bridge pattern
public abstract class Shape {

    //Protected for access by subclasses
   protected Color color;

   // Constructor
    public Shape(Color color){
        this.color = color;
    }

    abstract void draw();
}
