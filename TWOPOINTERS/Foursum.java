import java.util.*;
public class Foursum{
    public static void main(String args[]){
        int a[]={1,0,-1,0,-2,2};
        // List<List<Integer>>ans=brute(a);
        // List<List<Integer>>ans=better(a);
        List<List<Integer>>ans=optimal(a);
        System.out.println(ans);
    }

    public static List<List<Integer>> brute(int a[]){
        int n=a.length;
        Set<List<Integer>>set=new HashSet<>();
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                for(int k=j+1;k<n-1;k++){
                    for(int l=k+1;l<n;l++){
                        int sum=a[i]+a[j]+a[k]+a[l];
                        if(sum==0){
                            List<Integer>temp=Arrays.asList(a[i],a[j],a[k],a[l]);
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static List<List<Integer>> better(int a[]){
        Set<List<Integer>>ans=new HashSet<>();
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Integer>set=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    int l=-(a[i]+a[j]+a[k]);
                    if(set.contains(l)){
                        List<Integer>temp=Arrays.asList(a[i],a[j],a[k],l);
                        Collections.sort(temp);
                        ans.add(temp);
                    }
                    set.add(a[k]);
                }
            }
        }
        return new ArrayList<>(ans);
    }

    public static List<List<Integer>> optimal(int a[]){
        Arrays.sort(a);
        List<List<Integer>>ans=new ArrayList<>();
        int n=a.length;
        for(int i=0;i<n;i++){
            if(i>0 && a[i]==a[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j!=i+1 && a[j]==a[j-1]) continue;
                int k=j+1; int l=n-1;
                while(k<l){
                    int sum=a[i]+a[j]+a[k]+a[l];
                    if(sum<0){
                        k++;
                    }
                    else if(sum>0){
                        l--;
                    }
                    else{
                        List<Integer>temp=Arrays.asList(a[i],a[j],a[k],a[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k<l && a[k]==a[k-1]) k++;
                        while(k<l && a[l]==a[l+
                            
                            1]) l--;
                    }
                }
            }
        }
        return ans;
    }
}