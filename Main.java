import java.util.*;
public class Main{
    public static void main(String args[]){
        int a[]={1,4,3,1,6,2,2,3,2,3,4,5,1};
        int res=mostFrequentElement(a);
        System.out.print(res);
    }
    public static int mostFrequentElement(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        for(int key : map.keySet()){
            if(map.get(key)>max){
                max=key;  
            }
        }
        return max;
    }
}