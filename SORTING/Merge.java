package SORTING;
import java.util.*;
public class Merge {
    public static void main(String args[]){
        int a[]={4,7,32,9,2,1,2};
        fn(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void fn(int a[],int low,int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        fn(a,low,mid);
        fn(a,mid+1,high);
        merge(a,low,mid,high);
    }
    static void merge(int a[],int low,int mid,int high){
        List<Integer>temp=new ArrayList<>();
        int i=low;
        int j=mid+1;
        while(i<=mid && j<=high){
            if(a[i]<=a[j]){
                temp.add(a[i]);
                i++;
            }
            else{
                temp.add(a[j]);
                j++;
            }
        }
        while(i<=mid){
                temp.add(a[i]);
                i++;
        }
        while(j<=high){
                temp.add(a[j]);
                j++;
        }
        for(int k=low;k<=high;k++){
            a[k]=temp.get(k-low);
        }
    }
}
