package filereaderproblem;

import java.io.*;

public class WordCountInFile {
    public static void main(String[] args) {
        String fileName = "sample.txt"; // File name
        String targetWord = "file"; // Word to count
        int wordCount = 0; // Counter for occurrences

        try {
            // Create a FileReader wrapped with BufferedReader
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;

            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Split the line into words
                String[] words = line.split("\\s+");

                // Count occurrences of the target word
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        wordCount++;
                    }
                }
            }

            // Close
            br.close();
            fr.close();

            // Print the final count
            System.out.println("The word '" + targetWord + "' appears " + wordCount + " times in the file.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

