package ARRAYS;
import java.util.*;
public class Leader {
    public static void main(String args[]){
        int a[]={1,2,5,3,1,2};
        // List<Integer>res=brute(a);
        List<Integer>res=optimal(a);
        System.out.println(res);
    }
    public static List<Integer> brute(int a[]){
        int n=a.length;
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            boolean leader=true;
            for(int j=i+1;j<n;j++){
                if(a[j]>a[i]){
                    leader=false;
                    break;
                }
            }
                if(leader){
                    ans.add(a[i]);
                }
        }
        return ans;
    }
    public static List<Integer> optimal(int a[]){
        int n=a.length;
        List<Integer>ans=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(a[i]>max){
                max=a[i];
                ans.add(max);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
