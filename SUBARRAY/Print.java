package SUBARRAY;
import java.util.*;
public class Print {
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        List<List<Integer>>res=fn(a);
        System.out.println(res);
    }
    static List<List<Integer>> fn(int a[]){
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<=a.length;j++){
                List<Integer>subarray=new ArrayList<>();
                for(int k=i;k<j;k++){
                    subarray.add(a[k]);
                }
                ans.add(subarray);
            }
        }
        return ans;
    }
}
