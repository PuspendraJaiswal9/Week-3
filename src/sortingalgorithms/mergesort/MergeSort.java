package sortingalgorithms.mergesort;

import java.util.Scanner;

public class MergeSort {
    static void merge(int arr[],int l,int r){
        int mid=(r+l)/2;
        int len1=mid-l+1;
        int len2=r-mid;
        int arr1[]=new int[len1];
        int arr2[]=new int[len2];

        // Copy values to temp arrays
        for(int i=0;i<len1;i++){
            arr1[i]=arr[l+i];
        }
        for(int i=0;i<len2;i++){
            arr2[i]=arr[mid+1+i];
        }

        int minindex=l;
        int index1=0;
        int index2=0;

        // Merging two sorted arrays
        while(index1<len1 && index2<len2){
            if(arr1[index1]<arr2[index2]){
                arr[minindex++]=arr1[index1++];
            }else{
                arr[minindex++]=arr2[index2++];
            }
        }
        while(index1<len1){
            arr[minindex++]=arr1[index1++];
        }
        while(index2<len2){
            arr[minindex++]=arr2[index2++];
        }
    }

    static void mergesort(int arr[],int l,int r){
        if(l >= r){ // Base condition fixed
            return;
        }
        int mid=l+(r-l)/2;
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        merge(arr,l,r);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter total number of books:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter all books price:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array before sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // Method calls
        mergesort(arr,0,arr.length-1);
        System.out.println("Array after sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
