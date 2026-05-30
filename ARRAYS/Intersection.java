package ARRAYS;
import java.util.*;
public class Intersection {
    public static void main(String args[]){
        int a[]={1,2,3,4};
        int b[]={3,4,5,6};
        System.out.println(Arrays.toString(brute(a,b)));
    }
    static int[] brute(int a[],int b[]){
        int n1=a.length;
        int n2=b.length;
        List<Integer>ans=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(a[i]<b[j]) i++;
            else if(a[i]>b[j]) j++;
            else{
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        int res[]=new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            res[k]=ans.get(k);
        }
        return res;
    }
}
