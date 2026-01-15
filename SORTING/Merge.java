package SORTING;
import java.util.*;
public class Merge {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[7];
        int n=a.length;
        System.out.print("enter the array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        mergesort(a,0,n-1);
        System.out.print("sorted array : ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
    static void mergesort(int a[],int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergesort(a, l, mid);
            mergesort(a, mid+1, r);
            merge(a,l,mid,r);
        }
    }
    static void merge(int a[],int l,int mid,int r){
        int i=l;
        int j=mid+1;
        int k=0;
        int b[]=new int[r - l + 1];
        while(i<=mid && j<=r){
            if(a[i]<=a[j]){
                b[k++]=a[i++];
            }else{
                b[k++]=a[j++];
            }
        }
        while(i<=mid){
            b[k++]=a[i++];
        }
        while(j<=r){
            b[k++]=a[j++];
        }
        for(int x=0;x<k;x++){
            a[l+x]=b[x];
        }
    }
}
