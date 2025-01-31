package sortingalgorithms.bubblesort;
import java.util.Scanner;

public class BubbleSort {
    //Create Method for sorting
    static void bubble(int arr[],int n){
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swapping
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                break;
            }
        }
    }
     public static void main(String args[]){
         //Create Scanner object for user input
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter total number of students:");
         int n=sc.nextInt();
         int arr[]=new int[n];
         System.out.println("Enter marks of all students:");
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }

         System.out.println("Array before sorting:");
         for(int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
         }
         System.out.println();
         //Method calls
         bubble(arr,n);
         System.out.println("Array after sorting:");
         for(int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
         }
     }
}
