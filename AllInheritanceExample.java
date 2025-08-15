// All Types of Inheritance in One Example

// ---------- Single Inheritance ----------
class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

// Dog inherits Animal (Single Inheritance)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// ---------- Multilevel Inheritance ----------
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps.");
    }
}

// ---------- Hierarchical Inheritance ----------
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

// ---------- Multiple Inheritance (Using Interfaces) ----------
interface Pet {
    void play();
}

interface Guard {
    void guard();
}

// PetDog inherits from Dog (class) + Pet and Guard (interfaces) => Multiple Inheritance
class PetDog extends Dog implements Pet, Guard {
    public void play() {
        System.out.println("PetDog loves to play.");
    }

    public void guard() {
        System.out.println("PetDog guards the house.");
    }
}

// ---------- Hybrid Inheritance ----------
// Hybrid = Combination of more than one type
// PetPuppy inherits from Puppy (Multilevel) + Pet (Interface)
class PetPuppy extends Puppy implements Pet {
    public void play() {
        System.out.println("PetPuppy plays with toys.");
    }
}

// ---------- Main Class ----------
public class AllInheritanceExample {
    public static void main(String[] args) {
        
        // Single Inheritance
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        
        System.out.println();

        // Multilevel Inheritance
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();
        
        System.out.println();

        // Hierarchical Inheritance
        Cat cat = new Cat();
        cat.eat();
        cat.meow();
        
        System.out.println();

        // Multiple Inheritance via Interfaces
        PetDog petDog = new PetDog();
        petDog.eat();
        petDog.bark();
        petDog.play();
        petDog.guard();

        System.out.println();

        // Hybrid Inheritance
        PetPuppy petPuppy = new PetPuppy();
        petPuppy.eat();
        petPuppy.bark();
        petPuppy.weep();
        petPuppy.play();
    }
}
