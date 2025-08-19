public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            // Example 1: ArithmeticException
            int result = 10 / 0;

            // Example 2: ArrayIndexOutOfBoundsException
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);

            // Example 3: NullPointerException
            String str = null;
            System.out.println(str.length());

        } 
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Division by zero is not allowed.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid array index accessed.");
        } 
        catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Attempted to access a null object.");
        } 
        catch (Exception e) {
            System.out.println("Caught General Exception: " + e);
        }

        System.out.println("Program continues after handling exceptions...");
    }
}
