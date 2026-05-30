package SORTING;
import java.util.*;
public class Selection {
    public static void main(String args[]){
        int a[]={5,4,3,7,2,0};
        System.out.println(Arrays.toString(fn(a)));
    }
    public static int[] fn(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        return a;
    }
}
