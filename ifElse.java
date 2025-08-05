import java.util.Scanner;
public class NumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // here just create Scanner class.

        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); //Take input from user.

        if (number > 0) {
            System.out.println(number + " is a Positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a Negative number.");
        } else {
            System.out.println("The number is Zero.");
        }

        scanner.close();
    }
}
