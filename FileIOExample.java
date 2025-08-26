import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) {
        try {
            // Writing to a file using FileOutputStream 
            FileOutputStream fout = new FileOutputStream("example.txt");

            String message = "Hello, this is a FileOutputStream & FileInputStream example!";
            // Convert string into bytes and write into file
            fout.write(message.getBytes());

            fout.close();
            System.out.println("Data written successfully to example.txt");

            // ---------- Reading from a file using FileInputStream ----------
            FileInputStream fin = new FileInputStream("example.txt");

            int i;
            System.out.print("Reading from file: ");
            while ((i = fin.read()) != -1) {
                System.out.print((char) i); // convert byte back to character
            }

            fin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
