import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFileExample {
    public static void main(String[] args) {
        try {
            // Writing multiple lines using BufferedWriter.
            BufferedWriter bw = new BufferedWriter(new FileWriter("example2.txt"));
            bw.write("Hello, this is Example 2.");
            bw.newLine();  // add line break
            bw.write("BufferedReader and BufferedWriter are efficient.");
            bw.newLine();
            bw.write("End of file.");
            bw.close();
            System.out.println("Data written to example2.txt");

            // Reading line by line using BufferedReader
            BufferedReader br = new BufferedReader(new FileReader("example2.txt"));
            String line;
            System.out.println("\nReading from example2.txt:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
