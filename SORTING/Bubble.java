package SORTING;
import java.util.*;
public class Bubble {
    public static void main(String args[]){
        int a[]={2,5,3,7,8,1};
        System.out.println(Arrays.toString(fn(a)));
    }
    public static int[] fn(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
}
