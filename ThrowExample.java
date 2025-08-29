import java.util.Scanner;

public class ThrowExample {

    // A method that checks age and throws exception if invalid.
    static void checkAge(int age) {
        if (age < 18) {
            // Throwing an exception object manually.
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues after throw demonstration...");
        sc.close();
    }
}
