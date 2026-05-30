package SUBARRAY;
import java.util.*;
public class Count {
    public static void main(String args[]){
        int a[]={1,2,3};
        int tar=3;
        // int res=CountSubarrayWithGivenSum(a, tar);
        // int res=OnlyPosOrNeg(a, tar);
        int res=optimal(a, tar);
        System.out.println(res);
    }
    public static int CountSubarrayWithGivenSum(int a[],int tar){
        int cnt=0;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum+=a[j];
                if(sum==tar) cnt++;
            }
        }
        return cnt;
    }
    public static int OnlyPosOrNeg(int a[],int tar){
        int cnt=0;
        int sum=0;
        int i=0;
        for(int j=0;j<a.length;j++){
            sum+=a[j];
            while(sum>tar){
                sum-=a[i];
                i++;
            }
            if(sum==tar) cnt++;
        }
        return cnt;
    }
    public static int optimal(int a[],int tar){
        int sum=0;
        int cnt=0;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            int need=sum-tar;
            if(map.containsKey(need)){
                cnt+=map.get(need);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}
