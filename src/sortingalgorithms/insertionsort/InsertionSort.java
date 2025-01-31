package sortingalgorithms.insertionsort;

import java.util.Scanner;

public class InsertionSort {
       static void insertion(int arr[],int n){
           for(int i=1;i<n;i++){
               int j=i-1;
               int temp=arr[i];
               while(j>=0 && arr[j]>temp){
                   //shift element
                   arr[j+1]=arr[j];
                   j--;
               }
               arr[j+1]=temp;
           }
       }
       public static void main(String args[]){
           //Create Scanner object for user input
           Scanner sc=new Scanner(System.in);

           System.out.println("Enter total employee id (length of employeeid):");
           int n=sc.nextInt();
           int arr[]=new int[n];
           System.out.println("Enter all employee id:");
           for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
           }

           System.out.println("Array before sorting:");
           for(int i=0;i<n;i++){
               System.out.print(arr[i]+" ");
           }
           System.out.println();
           //Method calls
           insertion(arr,n);
           System.out.println("Array after sorting:");
           for(int i=0;i<n;i++){
               System.out.print(arr[i]+" ");
           }
       }
}
