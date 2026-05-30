package SORTING;
import java.util.*;
public class Insertion {
    public static void main(String args[]){
        int a[]={5,7,3,9,1};
        System.out.println(Arrays.toString(fn(a)));
    }
    public static int[] fn(int a[]){
        int n=a.length;
        for(int i=1;i<n;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        return a;
    }
    public static int[] insertion(int a[]){
        int n=a.length;
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && a[j-1]>a[j]){
                int temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
                j--;
            }
        }
        return a;
    }
}
