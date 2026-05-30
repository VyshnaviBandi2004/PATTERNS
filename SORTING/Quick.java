package SORTING;
public class Quick {
    public static void main(String args[]){
        int a[]={4,7,32,9,2,1,2};
        fn(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void fn(int a[],int low,int high){
        if(low<high){
            int pivotIdx=partition(a,low,high);
            fn(a,low,pivotIdx-1);
            fn(a,pivotIdx+1,high);
        }
    }
    static int partition(int a[],int low,int high){
        int pivot=a[low];
        int i=low;
        int j=high;
        while(i<j){
            while(i<=high-1 && a[i]<=pivot) i++;
            while(j>=low+1 && a[j]>pivot) j--;
             if(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        }
       
        int temp=a[low];
        a[low]=a[j];
        a[j]=temp;
        return j;
    }
}
