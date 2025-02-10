package inputstreamreaderproblem;

import java.io.*;

public class ConvertByteToCharacterStream {
    public static void main(String[] args) {
        String fileName = "sample.txt";

        try {
            // Create a FileInputStream to read binary data from the file
            FileInputStream fis = new FileInputStream(fileName);

            // Wrap the FileInputStream in InputStreamReader to convert byte stream to character stream
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

            // Wrap the InputStreamReader in BufferedReader
            BufferedReader br = new BufferedReader(isr);

            String line;

            // Read the file line by line and print characters
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Print each line
            }

            // Close resources
            br.close();
            isr.close();
            fis.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

