import java.util.*;
public class Twosum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array : ");
        int a[]=new int[6];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int res[]=Sum(a, 9);
        System.out.println(res[0]+" "+res[1]);
        System.out.print(Arrays.toString(Sum(a, 9)));
        // optimal(a, 9);
        sc.close();
    }
    static int[] Sum(int a[],int target){
        int sum;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                sum=a[i]+a[j];
                if(sum==target) return new int[]{i+1,j+1};
            }
        }
        return new int[]{-1,-1};
    }
    
    static void optimal(int a[],int target){
        int n=a.length;
        int l=0;
        int r=n-1;
        int sum;
        while(l<r){
            sum=a[l]+a[r];
            if(sum==target){
                System.out.print((l+1)+","+(r+1));
                break;
            }
            else if(sum>target) r--;
            else l++;
        }
    }
}
