import java.util.*;
public class Reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("the given string is "+s);
        rev(s);
        sc.close();
    }
    static void rev(String s){
        char[] arr=s.toCharArray();
        int l=0;
        int r=arr.length-1;
        while(l<r){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        System.out.println(String.valueOf(arr));
    }
}
