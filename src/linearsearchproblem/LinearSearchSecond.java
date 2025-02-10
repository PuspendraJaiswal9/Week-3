package linearsearchproblem;

public class LinearSearchSecond {
    // Method to find the first sentence containing the specific word
    public static String findSentenceWithWord(String[] sentences, String word) {
        // Iterate through the array of sentences
        for (String sentence : sentences) {
            // Check if the current sentence contains the word
            if (sentence.contains(word)) {
                return sentence; // Return the sentence containing the word
            }
        }
        return "Not Found"; // Return "Not Found" if no sentence contains the word
    }

    public static void main(String[] args) {
        // Example array of sentences
        String[] sentences = {
                "I love programming.",
                "Java is awesome.",
                "This is a test sentence.",
                "Searching for a word."
        };

        String word = "test";

        // Find the sentence containing the word
        String result = findSentenceWithWord(sentences, word);

        // Print the result
        System.out.println(result);
    }
}

