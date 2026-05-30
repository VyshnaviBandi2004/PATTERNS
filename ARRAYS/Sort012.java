package ARRAYS;
import java.util.Arrays;
public class Sort012 {
    public static void main(String args[]){
        int a[]={0,2,1,2,1,0};
        // int res[]=sortZeroOneTwo(a);
        int res[]=optimal(a);
        System.out.println(Arrays.toString(res));
    }
    public static int[] sortZeroOneTwo(int[] nums) {
        int cnt0=0; int cnt1=0; int cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) cnt0++;
            if(nums[i]==1) cnt1++;
            if(nums[i]==2) cnt2++;
        }
        int temp[]=new int[nums.length];
        for(int i=0;i<cnt0;i++) temp[i]=0;
        for(int i=cnt0;i<cnt0+cnt1;i++) temp[i]=1;
        for(int i=cnt0+cnt1;i<cnt0+cnt1+cnt2;i++) temp[i]=2;
        return temp;
    }
    public static int[] optimal(int[] nums) {
        int n=nums.length;
        int low=0; int mid=0; int high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
        return nums;
    }
    static void swap(int a[],int left,int right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
    }
}
