package sortingalgorithms.selectionsort;

import java.util.Scanner;

public class SelectionSort {
    static void selection(int arr[],int n){
        for (int i=0;i<n;i++){
            int minindex=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
    }
    public static void main(String args[]) {
        //Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number of students:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter marks of all students:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //Method calls
        selection(arr, n);
        System.out.println("Array after sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
