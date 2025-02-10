package inputstreamreaderproblem;

import java.io.*;

public class ReadInputWriteToFile {
    public static void main(String[] args) {
        String fileName = "user_input.txt"; // File name to save input

        try {
            // Create InputStreamReader to read from console
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            // Create FileWriter to write to the file
            FileWriter fw = new FileWriter(fileName, true); // 'true' to append data

            String userInput;

            System.out.println("Enter text (type 'exit' to stop):");

            // Read input until user types 'exit'
            while (!(userInput = br.readLine()).equalsIgnoreCase("exit")) {
                fw.write(userInput + "\n"); // Write input to file
            }

            // Close resources
            br.close();
            isr.close();
            fw.close();

            System.out.println("Input has been written to the file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage()); // Error handling
        }
    }
}

