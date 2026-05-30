package SUBARRAY;
import java.util.*;
public class LongestSubarrayWithSumK {
    public static void main(String args[]){
        int a[]={10,5,2,7,1,9};
        int k=15;
        // int res=positive(a, k);
        int res=negative(a, k);
        System.out.println(res);
    }
    static int positive(int a[],int tar){
        int MaxLen=0;
        int i=0;
        int sum=0;
        for(int j=0;j<a.length;j++){
            sum+=a[j];
            while(sum>tar){
                sum-=a[i];
                i++;
            }
            if(sum==tar){
                MaxLen=Math.max(MaxLen,j-i+1);
            }
        }
        return MaxLen;
    }
    static int negative(int a[],int tar){
        Map<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int maxlen=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum==tar) maxlen=i+1;
            int need=sum-tar;
            if(map.containsKey(need)){
                int len=i-map.get(need);
                maxlen=Math.max(maxlen,len);
            }
            if(!map.containsKey(sum)) map.put(sum,i);
        }
        return maxlen;
    }
}
