class Student {
    int id;
    String name;

    // 1. Default Constructor
    Student() {
        id = 0;
        name = "Not Assigned";
        System.out.println("Default Constructor Called");
    }

    // 2. Parameterized Constructor
    Student(int i, String n) {
        id = i;
        name = n;
        System.out.println("Parameterized Constructor Called");
    }

    // 3. Copy Constructor (Custom Constructor that takes another object)
    Student(Student s) {
        id = s.id;
        name = s.name;
        System.out.println("Copy Constructor Called");
    }

    // Method to display student details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

// Main class
public class ConstructorTypesExample {
    public static void main(String[] args) {
        // Default constructor
        Student s1 = new Student();
        s1.display();

        System.out.println();

        // Parameterized constructor
        Student s2 = new Student(101, "Pranav");
        s2.display();

        System.out.println();

        // Copy constructor
        Student s3 = new Student(s2);
        s3.display();
    }
}
