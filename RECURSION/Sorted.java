package RECURSION;
public class Sorted{
    public static void main(String args[]){
        int a[]={1,8,48,200,380};
        System.out.println(IsArraySortedOrNot(a, 0));
    }
    public static boolean IsArraySortedOrNot(int a[],int idx){
        if(idx==a.length-1) return true;
        return a[idx]<a[idx+1] && IsArraySortedOrNot(a, idx+1);
    }
}