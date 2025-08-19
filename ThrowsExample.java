import java.io.IOException;

public class OnlyThrowsExample {

    // Method that declares it may throw IOException
    static void displayMessage() throws IOException {
        System.out.println("This method declares IOException using 'throws'.");
    }

    public static void main(String[] args) {
        try {
            displayMessage();  // calling method with 'throws'
        } catch (IOException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues after throws demonstration...");
    }
}
