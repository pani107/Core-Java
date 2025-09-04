// Abstract class
abstract class Shape {
    String type = "Shape";  // variable in abstract class.

    // Abstract method (must be implemented by subclass)
    abstract void draw();

    // Concrete method.
    void display() {
        System.out.println("This is a shape");
    }
}

// Subclass
class Circle extends Shape {
    String type = "Circle"; // variable in subclass (same name)

    @Override
    void draw() {   // implementing abstract method
        System.out.println("Drawing a Circle");
    }

    @Override
    void display() {   // overriding concrete method
        System.out.println("This is a Circle");
    }
}

// Main class
public class AbstractExample {
    public static void main(String[] args) {
        // Abstract class reference, subclass object
        Shape s = new Circle();

        // Variable access -> based on reference type (Shape)
        System.out.println("Variable: " + s.type);   // Output: Shape

        // Method access -> based on object type (Circle)
        s.draw();       // Output: Drawing a Circle
        s.display();    // Output: This is a Circle
    }
}
