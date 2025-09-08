import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) {
        try {
            // 1. Create File object.
            File file = new File("example.txt");

            // 2. Create a new file
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // 3. Write to the file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is a sample text written into the file.\n");
            writer.write("File handling in Java is simple!");
            writer.close();
            System.out.println("Successfully wrote to the file.");

            // 4. Read the file
            Scanner reader = new Scanner(file);
            System.out.println("\n--- File Content ---");
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

            // 5. File Information Methods
            System.out.println("\n--- File Information ---");
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File size (in bytes): " + file.length());

            // 6. Delete the file (optional)
            if (file.delete()) {
                System.out.println("\nDeleted the file: " + file.getName());
            } else {
                System.out.println("\nFailed to delete the file.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
