package RECURSION;

public class LinearSearch {
    public static void main(String[] args) {
        int a[]={3,2,1,18,9};
        System.out.println(fn(a,9,0));
    }
    public static int fn(int a[],int tar,int idx){
        if(idx==a.length) return -1;
        if(a[idx]==tar) return idx;
        return fn(a,tar,idx+1);
    }
}
