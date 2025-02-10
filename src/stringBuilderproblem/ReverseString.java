package stringBuilderproblem;

public class ReverseString {
    public static String reverseString(String input) {
        // Create a new StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Append the input string to the StringBuilder
        sb.append(input);

        // Reverse the string using reverse() method
        sb.reverse();

        // Convert StringBuilder back to string and return
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "hello"; // Input string
        String reversed = reverseString(input); // Call method to reverse string

        // Print the reversed string
        System.out.println("Reversed String: " + reversed);
    }
}

