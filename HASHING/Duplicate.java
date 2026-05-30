package HASHING;
public class Duplicate {
    public static void main(String args[]){
        int a[]={1,3,4,2,6,3};
        int res=fn(a);
        System.out.println(res);
    }
    public static int fn(int a[]){
        int n=a.length;
        int freq[]=new int[10];
        for(int i=0;i<n;i++){
            freq[a[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==2) return i;
        }
        return -1;
    }
}
