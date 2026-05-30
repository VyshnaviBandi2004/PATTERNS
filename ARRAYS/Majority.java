package ARRAYS;
import java.util.*;
public class Majority {
    public static void main(String args[]){
        int a[]={5,0,0,1,5,5,2,5,5};
        // int res=brute(a);
        int res=optimal(a);
        System.out.println(res);
    }
    static int brute(int a[]){
        int n=a.length;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)>n/2) return key;
        }
        return 0;
    }
    static int optimal(int a[]){
        int n=a.length;
        int cnt=0;
        int ele=0;
        for(int i=0;i<n;i++){
           if(cnt==0) ele=a[i];
           if(a[i]==ele) cnt++;
           else cnt--;
        }
        // cnt=0;
        // for(int i=0;i<n;i++){
        //     if(a[i]==ele) cnt++;
        // }
        // if(cnt>n/2) return ele;
        return ele;
    }
}
