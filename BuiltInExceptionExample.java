public class BuiltInExceptionExample {
    public static void main(String[] args) {
        try {
            // ArithmeticException example
            int result = 10 / 0; // This will throw ArithmeticException.
            System.out.println("Result: " + result);

            // ArrayIndexOutOfBoundsException example
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Invalid index.

            // NullPointerException example.
            String text = null;
            System.out.println(text.length());

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed - cleanup code goes here.");
        }

        System.out.println("Program continues normally after handling exceptions.");
    }
}
