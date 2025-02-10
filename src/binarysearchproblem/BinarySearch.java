package binarysearchproblem;

public class BinarySearch {
    // Method to find the rotation point in a rotated sorted array
    public static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            // If the middle element is greater than the rightmost element,
            // the smallest element is in the right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }
            // Otherwise, the smallest element is in the left half
            else {
                right = mid;
            }
        }

        // The smallest element is at index 'left' when left == right
        return arr[left];
    }

    public static void main(String[] args) {
        // Example rotated sorted array
        int[] arr = {6, 7, 9, 15, 19, 1,2, 3};

        // Find the rotation point (smallest element)
        int rotationPoint = findRotationPoint(arr);

        // Print the rotation point
        System.out.println("The rotation point is: " + rotationPoint);
    }
}

