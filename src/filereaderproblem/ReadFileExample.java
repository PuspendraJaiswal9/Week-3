package filereaderproblem;

import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
        String fileName = "sample.txt"; // File name

        try {
            // Create a FileReader wrapped with BufferedReader
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;

            // Read the file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Print each line
            }

            // Close
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}