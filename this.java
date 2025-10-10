.class Student {
    String name;
    int age;

    // 1. Constructor Chaining using 'this'
    Student() {
        this("Unknown", 0); // Calls parameterized constructor.
    }

    // 2. Referring to instance variables using 'this'
    Student(String name, int age) {
        this.name = name; // 'this.name' → instance variable, 'name' → local variable
        this.age = age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    // 3. Passing current object as a parameter
    void sendToPrinter(Printer printer) {
        printer.print(this); // 'this' refers to current object
    }

    // 4. Returning current object
    Student getSelf() {
        return this;
    }
}

class Printer {
    void print(Student s) {
        System.out.println("Printing Student: " + s.name + " (Age: " + s.age + ")");
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        // Using default constructor (calls parameterized one via 'this')
        Student s1 = new Student();
        s1.display();

        // Using parameterized constructor
        Student s2 = new Student("Pranav", 20);
        s2.display();

        // Passing current object
        Printer printer = new Printer();
        s2.sendToPrinter(printer);

        // Returning current object
        Student s3 = s2.getSelf();
        System.out.println("Returned Object: " + s3.name + ", " + s3.age);
    }
}
