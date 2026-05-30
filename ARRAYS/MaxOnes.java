package ARRAYS;
public class MaxOnes{
    public static void main(String args[]){
        int a[]={1,1,0,1,1,1,0,1,1,1,1};
        System.out.println(brute(a));
        System.out.println(optimal(a));
    }
    static int brute(int a[]){
        int len=Integer.MIN_VALUE;
        int i=0;
        int j=0;
        while(j<a.length){
            if(a[j]==1) j++;
            else{
                len=Math.max(len,j-i);
                i=j+1;
                j++;
            }
        }
        len=Math.max(len,j-i);
        return len;
    }
    static int optimal(int a[]){
        int cnt=0;
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                cnt++;
                max=Math.max(max,cnt);
            }
            else{
                cnt=0;
            }
        }
        return max;
    }
}