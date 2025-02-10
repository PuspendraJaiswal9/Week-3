package binarysearchproblem;

public class BinarySearchSecond {
    // Method to find a peak element in an array
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            // Check if mid is a peak element
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] <= arr[mid])) {
                return arr[mid];  // Return the peak element
            }

            // If the left neighbor is greater, search the left half
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            }
            // If the right neighbor is greater, search the right half
            else {
                left = mid + 1;
            }
        }

        return -1;  // If no peak element is found
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 3, 44, 20, 1};

        // Find the peak element
        int peakElement = findPeakElement(arr);

        // Print the peak element
        System.out.println("A peak element is: " + peakElement);
    }
}

