import java.util.*;
public class Threesum{
    public static void main(String args[]){
        int a[]={-2,-1,2,-1,0,-2,-2,2,2,0,2,-1,0};
        // List<List<Integer>>ans=brute(a);
        // List<List<Integer>>ans=better(a);
        List<List<Integer>>ans=optimal(a);
        System.out.println(ans);
    }
    static List<List<Integer>> brute(int a[]){
        Set<List<Integer>>set=new HashSet<>();
        int n=a.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(a[i]+a[j]+a[k]==0){
                       List<Integer>temp=Arrays.asList(a[i],a[j],a[k]);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
    static List<List<Integer>> better(int a[]){
        int n=a.length;
        Set<List<Integer>>ans=new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer>set=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int k=-(a[i]+a[j]);
                if(set.contains(k)){
                    List<Integer>temp=Arrays.asList(a[i],a[j],k);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                set.add(a[j]);
            }
        }
        return new ArrayList<>(ans);
    }
    static List<List<Integer>> optimal(int a[]){
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(a);
        int n=a.length;
        for(int i=0;i<n;i++){
            if(i>0 && a[i]==a[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=a[i]+a[j]+a[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer>temp=Arrays.asList(a[i],a[j],a[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && a[j]==a[j-1]) j++;
                    while(j<k && a[k]==a[k+1]) k--;
                }
            }
        }
        return ans;
    }
}