package sortingalgorithms.countingsort;


import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] ages) {
        int minAge = 10, maxAge = 18;
        int range = maxAge - minAge + 1;

        // Step 1: Count array to store frequency of each age
        int[] count = new int[range];
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 2: Place elements in the original array in sorted order
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                ages[index++] = i + minAge;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 14, 18, 17, 13, 16, 12, 11, 15};
        System.out.println("Before Sorting: " + Arrays.toString(ages));
        countingSort(ages);
        System.out.println("After Sorting:  " + Arrays.toString(ages));
    }
}
