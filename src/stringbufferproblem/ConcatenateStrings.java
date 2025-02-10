package stringbufferproblem;

public class ConcatenateStrings {
    public static String concatenateStrings(String[] words) {
        // Create a new StringBuffer object
        StringBuffer sb = new StringBuffer();

        // Append each string in the array to StringBuffer
        for (String word : words) {
            sb.append(word);
        }

        // Convert StringBuffer to string and return
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Hello", " ", "World", "!", " Welcome", " to Java."}; // Input array
        String result = concatenateStrings(words); // Concatenate strings

        // Print the concatenated result
        System.out.println("Concatenated String: " + result);
    }
}

