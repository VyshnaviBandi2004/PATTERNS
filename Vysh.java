import java.util.*;
public class Vysh{
    public static void main(String args[]){
        int a[]={1,1,1,1,3,2,2,2};
        int n=a.length;
        System.out.println(fn(a,n));
    }
    public static List<Integer>fn(int a[],int n){
        int cnt1=0;
        int cnt2=0;
        int e1=0;
        int e2=0;
        for(int i=0;i<n;i++){
            if(cnt1==0 && a[i]!=e2){
                cnt1=1;
                e1=a[i];
            }
            else if(cnt2==0 && a[i]!=e1){
                cnt2=1;
                e2=a[i];
            }
            else if(e1==a[i]) cnt1++;
            else if(e2==a[i]) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        cnt1=0;
        cnt2=0;
        for(int i=0;i<n;i++){
            if(e1==a[i]) cnt1++;
            if(e2==a[i]) cnt2++;
        }
        int req=(int)(n/3)+1;
        if(cnt1>=req) ans.add(e1);
        if(cnt2>=req) ans.add(e2);
        Collections.sort(ans);
        return ans;
    }
}