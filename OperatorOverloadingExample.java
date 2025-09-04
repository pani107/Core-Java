public class OperatorOverloadingExample {
    public static void main(String[] args) {
        int x = 10, y = 20;
        String s1 = "Hello", s2 = "Java";

        // '+' used for numbers. (Addition)
        int sum = x + y;
        System.out.println("Sum of numbers: " + sum);

        // '+' used for strings (Concatenation)
        String message = s1 + " " + s2;
        System.out.println("Concatenated String: " + message);

        // '+' with string and number
        String mixed = s1 + " " + x;
        System.out.println("String + Number: " + mixed);
    }
}
