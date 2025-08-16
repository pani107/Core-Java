// Superclass
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class DynamicDispatchExample {
    public static void main(String[] args) {
        // Superclass reference
        Animal a;

        // Object of Dog
        a = new Dog();
        a.sound();   // Output: Dog barks

        // Object of Cat
        a = new Cat();
        a.sound();   // Output: Cat meows

        // Object of Animal
        a = new Animal();
        a.sound();   // Output: Animal makes a sound
    }
}
