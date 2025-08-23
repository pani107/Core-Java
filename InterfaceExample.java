// Step 1: Define an interface
interface Animal {
    void sound();   // abstract method
    void sleep();   // abstract method
}

// Step 2: Implement interface in Dog class
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog says: Woof Woof");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping...");
    }
}

// Step 3: Implement interface in Cat class
class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat says: Meow Meow");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping...");
    }
}

// Step 4: Main class to test interface
public class InterfaceExample {
    public static void main(String[] args) {
        // Using interface reference
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        dog.sleep();

        cat.sound();
        cat.sleep();
    }
}
