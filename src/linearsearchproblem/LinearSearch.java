package linearsearchproblem;

public class LinearSearch {
    // Method to find the first negative number
    public static int findFirstNegative(int[] arr) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is negative
            if (arr[i] < 0) {
                return i; // Return the index of the first negative number
            }
        }
        return -1; // Return -1 if no negative number is found
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {3, 5, -2, 7, 4, -1, 8};

        // Find the index of the first negative number
        int result = findFirstNegative(arr);

        // Print the result
        if (result != -1) {
            System.out.println("First negative number is at index: " + result);
        } else {
            System.out.println("No negative number found.");
        }
    }
}

