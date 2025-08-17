// File: ExceptionExample.java

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Code that may cause exception
            int number = 10;
            int result = number / 0;  // Division by zero (ArithmeticException)
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handle exception
            System.out.println("Error: Division by zero is not allowed.");
            System.out.println("Exception Message: " + e.getMessage());
        }

        System.out.println("Program continues after handling exception...");
    }
}
