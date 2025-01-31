package sortingalgorithms.quicksort;

import java.util.Scanner;

public class QuickSort {
       static public int partition(int arr[],int s,int e){
              int pivot=arr[s];
              int count=0;
              for(int i=s+1;i<=e;i++){
                     if(arr[i]<=pivot){
                            count++;
                     }
              }
              int pivotindex=s+count;
              int t=arr[s];
              arr[s]=arr[pivotindex];
              arr[pivotindex]=t;
              int i=s;int j=e;
              while(i<pivotindex && j> pivotindex){
                     while(arr[i]<=pivot){
                            i++;
                     }
                     while(arr[j]>pivot){
                            j--;
                     }

                     if(i<pivotindex && j>pivotindex){
                            int temp=arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                            i++;
                            j--;
                     }
              }
              return pivotindex;
       }
       static public void quickSort(int arr[],int s,int e){
              if(s>=e){
                     return;
              }
              int p=partition(arr,s,e);
              quickSort(arr,s,p-1);
              quickSort(arr,p+1,e);
       }
       public static void main(String args[]){
              //Create Scanner object for user input
              Scanner sc=new Scanner(System.in);

              System.out.println("Enter total number of products:");
              int n=sc.nextInt();
              int arr[]=new int[n];
              System.out.println("Enter all products:");
              for(int i=0;i<n;i++){
                     arr[i]=sc.nextInt();
              }

              System.out.println("Array before sorting:");
              for(int i=0;i<n;i++){
                     System.out.print(arr[i]+" ");
              }
              System.out.println();
              //Method calls
              quickSort(arr,0,n-1);
              System.out.println("Array after sorting:");
              for(int i=0;i<n;i++){
                     System.out.print(arr[i]+" ");
              }
       }
}
