// File: NestedMethodDemo.java
// Author: Pranav Kuber Wadkar.
// Description: Demonstrates nesting of methods in Java (method calling another method).

public class NestedMethodDemo {

    // Method to calculate the square of a number.
    int square(int number) {
        return number * number;
    }

    // Method to calculate the sum of squares of two numbers.
    int sumOfSquares(int a, int b) {
        // Calling square() method inside sumOfSquares() method.
        int squareA = square(a);
        int squareB = square(b);
        return squareA + squareB;
    }

    // Method to display the result.
    void displayResult(int a, int b) {
        // Calling sumOfSquares() inside displayResult().
        int result = sumOfSquares(a, b);
        System.out.println("Sum of squares of " + a + " and " + b + " is: " + result);
    }

    public static void main(String[] args) {
        NestedMethodDemo obj = new NestedMethodDemo();

        // Call displayResult which internally calls other methods.
        obj.displayResult(3, 4);
    }
}
