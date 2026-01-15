import java.util.*;
public class Maxwater {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array : ");
        int a[]=new int[9];
        for(int i=0;i<9;i++){
            a[i]=sc.nextInt();
        }
        // water(a);
        optimal(a);
        sc.close();
    }
    static void water(int a[]){
        int n=a.length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int wt=j-i;
                int ht=Math.min(a[i],a[j]);
                int waterlevel=wt*ht;
                max=Math.max(max,waterlevel);
            }
        }
        System.out.print(max);
    }

    static void optimal(int a[]){
        int n=a.length;
        int l=0;
        int r=n-1;
        int max=0;
        while(l<r){
            int wt=r-l;
            int ht=Math.min(a[l],a[r]);
            int water=wt*ht;
            max=Math.max(max,water);
            if(a[l]<a[r]) l++;
            else r--;
        }
        System.out.print(max);
    }
}
