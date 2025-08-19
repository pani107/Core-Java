public class NestedTryCatchExample {
    public static void main(String[] args) {
        // Outer try block
        try {
            int arr[] = {10, 20, 30};

            // Inner try block 1
            try {
                System.out.println("Accessing element at index 5: " + arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch 1: Array index is out of bounds!");
            }

            // Inner try block 2
            try {
                int num = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch 2: Cannot divide by zero!");
            }

            System.out.println("End of inner try blocks.");

        } catch (Exception e) {
            // Outer catch block
            System.out.println("Outer Catch: Exception occurred - " + e);
        }

        System.out.println("Program continues after try-catch blocks...");
    }
}
