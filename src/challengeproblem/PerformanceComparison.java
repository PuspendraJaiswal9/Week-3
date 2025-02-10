package challengeproblem;

import java.io.*;

public class PerformanceComparison {
    public static void main(String[] args) {
        // Part 1: StringBuilder and StringBuffer for string concatenation
        String str = "hello"; // String to concatenate
        int iterations = 1000000; // Number of iterations to concatenate
        long startTime, endTime;

        // Using StringBuilder
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(str);
        }
        endTime = System.nanoTime();
        long stringBuilderTime = endTime - startTime;
        System.out.println("Time taken by StringBuilder: " + stringBuilderTime + " nanoseconds");

        // Using StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(str);
        }
        endTime = System.nanoTime();
        long stringBufferTime = endTime - startTime;
        System.out.println("Time taken by StringBuffer: " + stringBufferTime + " nanoseconds");

        // Part 2: FileReader for counting words in a large file
        String fileName = "sample.txt"; // Large file to read (100MB)
        long wordCount = 0;

        // Reading file with FileReader and BufferedReader
        try {
            // Reading with FileReader
            startTime = System.nanoTime();
            FileReader fr = new FileReader(fileName);  // Using FileReader directly
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            endTime = System.nanoTime();
            long fileReadTime = endTime - startTime;

            System.out.println("Time taken to read the file and count words: " + fileReadTime + " nanoseconds");
            System.out.println("Total word count in the file: " + wordCount);

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
