// Example: Static Members in Java

class Student {
    int rollNo;               // instance variable.
    String name;              // instance variable.
    static String college = "MIT";  // static variable (shared by all)

    // Constructor
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    // Static method
    static void changeCollege() {
        college = "IIT";
    }

    // Display method
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

public class StaticMemberExample {
    public static void main(String[] args) {
        // Before changing
        Student s1 = new Student(1, "Pranav");
        Student s2 = new Student(2, "Rahul");

        s1.display();
        s2.display();

        // Changing college using static method
        Student.changeCollege();

        Student s3 = new Student(3, "Sneha");

        s1.display();
        s2.display();
        s3.display();
    }
}
