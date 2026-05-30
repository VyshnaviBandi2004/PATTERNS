package SUBARRAY;
public class MinimumSize{
public static void main(String args[]){
    int a[]={2,3,1,2,4,3};
    int tar=7;
    // int res=brute(a,tar);
    int res=optimal(a, tar);
    System.out.println(res);
}
static int brute(int a[],int tar){
    int n=a.length;
    int minLen=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        int sum=0;
        for(int j=i;j<n;j++){
            sum+=a[j];
            if(sum>=tar){
                minLen=Math.min(minLen,j-i+1);
            }
        }
    }
    return minLen;
}
static int optimal(int a[],int tar){
    int n=a.length;
    int sum=0;
    int minLen=Integer.MAX_VALUE;
    int i=0;
    for(int j=0;j<n;j++){
        sum+=a[j];
        while(sum>=tar){
            minLen=Math.min(minLen,j-i+1);
            sum-=a[i];
            i++;
        }
    }
    if(minLen==Integer.MAX_VALUE) return 0;
    return minLen;
}
}