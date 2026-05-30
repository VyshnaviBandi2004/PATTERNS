package HASHING;

public class Distinct {
    public static void main(String args[]){
        int a[]={2,4,6,4,7,5,3,5};
        int res=fn(a);
        System.out.println(res);
    }
    public static int fn(int a[]){
        int n=a.length;
        int freq[]=new int[13];
        for(int i=0;i<n;i++){
            freq[a[i]]++;
        }
        int cnt=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0) cnt++;
        }
        return cnt;
    }
}
