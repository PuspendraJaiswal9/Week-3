package sortingalgorithms.heap;

class Heap{
    int arr[];
    int size;
    int capacity;
    Heap(int capacity){
        this.capacity=capacity;
        size=0;
        arr=new int[capacity];
    }

    public void add(int value){
        size=size+1;
        int index=size;
        arr[index]=value;
        while(index>1){
            int parent=(index/2);
            if(arr[parent]<arr[index]){
                //swap
                int temp=arr[parent];
                arr[parent]=arr[index];
                arr[index]=temp;
                index=parent;
            }else{
                return;
            }
        }
    }

    public void delete(){
        if(size==0){
            System.out.println("Nothing delete:");
            return;
        }

        arr[1]=arr[size];
        size--;
        int i=1;
        while(i<size){
            int leftindex=2*i;
            int rightindex=2*i+1;
            if(leftindex<size && arr[i]<arr[leftindex]){
                //swap
                int temp=arr[i];
                arr[i]=arr[leftindex];
                arr[leftindex]=temp;
                i=leftindex;
            }else if(rightindex<size && arr[i]<arr[rightindex]){
                //swap
                int temp=arr[i];
                arr[i]=arr[rightindex];
                arr[rightindex]=temp;
                i=rightindex;
            }else{
                return;
            }
        }
    }

    public void heapyfy(int arr1[],int n,int i){
        int largest=i;
        int left=2*i;
        int right=2*i+1;
        if(left<n && arr1[largest]<arr1[left]){
            largest=left;
        }

        if(right<n && arr1[largest]<arr1[right]){
            largest=right;
        }

        if(largest!=i){
            //swap
            int temp=arr1[i];
            arr1[i]=arr1[largest];
            arr1[largest]=temp;
            heapyfy(arr1,n,largest);
        }
    }

    public void print(){
        for(int i=1;i<=size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class HeapSort {
    public static void main(String args[]) {
        Heap h = new Heap(20);
        h.add(13);
        h.add(11);
        h.add(12);
        h.add(5);
        h.add(6);
        h.add(7);
        h.print();
        //h.delete();
       // h.print();

        int arr1[]={-1,13,11,12,5,6,7};
        int n=6;
        for(int i=n/2;i>0;i--){
            h.heapyfy(arr1,n,i);
        }
        System.out.println("Heapyfy");
        for(int i=1;i<=n;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
