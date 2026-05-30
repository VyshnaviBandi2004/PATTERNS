package ARRAYS;
import java.util.*;
public class RearrangeBySign {
    public static void main(String args[]){
        int a[]={-4, 4, -4, 4, -4, 4};
        // int ans[]=brute(a);
        int ans[]=optimal(a);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] brute(int a[]){
        int n=a.length;
        int pos[]=new int[n/2];
        int neg[]=new int[n/2];
        int idxx=0;
        for(int i=0;i<n;i++){
            if(a[i]>0) pos[idxx++]=a[i];
        }
        int idx=0;
        for(int i=0;i<n;i++){
            if(a[i]<0) neg[idx++]=a[i];
        }
        int res[]=new int[n];
        for(int i=0;i<n/2;i++){
            res[2*i]=pos[i];
            res[2*i+1]=neg[i];
        }
        return res;
    }
    public static int[] optimal(int a[]){
        int n=a.length;
        int res[]=new int[n];
        int posIdx=0;
        int negIdx=1;
        for(int i=0;i<n;i++){
            if(a[i]>0){
                res[posIdx]=a[i];
                posIdx+=2;
            }
            else{
                res[negIdx]=a[i];
                negIdx+=2;
            }
        }
        return res;
    }
}
