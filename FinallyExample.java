public class FinallyExample {
    public static void main(String[] args) {
        try {
            int data = 10 / 2;  // No exception
            System.out.println("Result: " + data);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
        System.out.println("Rest of the code...");
    }
}
