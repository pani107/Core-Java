import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileExample {
    public static void main(String[] args) {
        try {
            // Writing to a file.
            FileWriter writer = new FileWriter("example1.txt");
            writer.write("Hello, this is Example 1.\n");
            writer.write("We are learning FileReader and FileWriter.");
            writer.close();
            System.out.println("Data written to example1.txt");

            // Reading from the file
            FileReader reader = new FileReader("example1.txt");
            int ch;
            System.out.println("\nReading from example1.txt:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
