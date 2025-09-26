class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound() method.
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal a1 = new Dog(); // Upcasting
        Animal a2 = new Cat();

        a1.sound(); // Calls Dog's overridden method
        a2.sound(); // Calls Cat's overridden method
    }
}
