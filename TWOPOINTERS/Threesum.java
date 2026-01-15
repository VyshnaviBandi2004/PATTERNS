import java.util.*;
public class Threesum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array : ");
        int a[]=new int[13];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        // System.out.print(brute(a));

        // System.out.print(better(a));

        System.out.print(optimal(a));
        sc.close();
    }


    static List<List<Integer>>brute(int a[]){
        Set<List<Integer>>ans=new HashSet<>();
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(a[i]+a[j]+a[k]==0){
                        List<Integer>temp=Arrays.asList(a[i],a[j],a[k]);
                        Collections.sort(temp);
                        ans.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }

    static List<List<Integer>>better(int a[]){
        Set<List<Integer>>ans=new HashSet<>();
        int n=a.length;
        for(int i=0;i<n;i++){
            Set<Integer>store=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int k=-(a[i]+a[j]);
                if(store.contains(k)){
                    List<Integer>temp=Arrays.asList(a[i],a[j],k);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                store.add(a[j]);
            }
        }
        return new ArrayList<>(ans);
    }

    static List<List<Integer>>optimal(int a[]){
        int n=a.length;
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(i>0 && a[i]==a[i-1]) continue;
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=a[i]+a[left]+a[right];
                if(sum==0){
                    ans.add(Arrays.asList(a[i],a[left],a[right]));
                    left++;
                    right--;
                    while(left<right && a[left]==a[left-1]) left++;
                    while(left<right && a[right]==a[right+1]) right--;
                }
                else if(sum>0) right--;
                else left++;
            }
        }
        return ans;
    }
}
