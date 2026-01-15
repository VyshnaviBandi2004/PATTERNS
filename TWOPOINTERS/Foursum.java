import java.util.*;
public class Foursum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array : ");
        int a[]=new int[6];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("enter the target : ");
        int target=sc.nextInt();
        System.out.print(optimal(a, target));

        sc.close();
    }
    static List<List<Integer>>optimal(int a[],int target){
        int n=a.length;
        Arrays.sort(a);
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
        if(i>0 && a[i]==a[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && a[j]==a[j-1]) continue;
                int l=j+1;
                int r=n-1;
                while(l<r){
                    int sum=a[i]+a[j]+a[r]+a[l];
                    if(target==sum){
                        ans.add(Arrays.asList(a[i],a[j],a[l],a[r]));
                        l++;
                        r--;
                        while(l<r && a[l]==a[l-1]) l++;
                        while(l<r && a[r]==a[r+1]) r--;
                    }else if(sum<target) l++;
                    else r--;       
                }    
                    
            }
        }
        return ans;
    }
}

