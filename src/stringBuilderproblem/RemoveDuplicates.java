package stringBuilderproblem;

import java.util.HashSet;

public class RemoveDuplicates {
    public static String removeDuplicateChars(String input) {
        // Initialize StringBuilder to store result
        StringBuilder sb = new StringBuilder();

        // HashSet to track seen characters
        HashSet<Character> seen = new HashSet<>();

        // Iterate through each character in the string
        for (char ch : input.toCharArray()) {
            if (!seen.contains(ch)) {
                sb.append(ch);  // Append unique character
                seen.add(ch);   // Mark character as seen
            }
        }

        // Return the string without duplicates
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "programming"; // Input string
        String result = removeDuplicateChars(input); // Remove duplicates

        // Print the result
        System.out.println("String without duplicates: " + result);
    }
}

