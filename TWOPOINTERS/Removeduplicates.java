import java.util.*;
public class Removeduplicates{
    public static void main(String args[]){
        int a[]={6,8,3,8,6,4,5};
        Arrays.sort(a);
        System.out.println(Arrays.toString(brute(a)));
        System.out.println(Arrays.toString(optimal(a)));
    }
    public static int[] brute(int a[]){
        Set<Integer>set=new LinkedHashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        System.out.println(set.size());
        int res[]=new int[set.size()];
        int idx=0;
        for(int num : set){
            res[idx]=num;
            idx++;
        }
        return res;
    }
    public static int[] optimal(int a[]){
        int i=0;
        for(int j=1;j<a.length;j++){
            if(a[j]!=a[i]){
                a[i+1]=a[j];
                i++;
            }
        }
        System.out.println(i+1);
        int res[]=new int[i+1];
        for(int k=0;k<res.length;k++){
            res[k]=a[k];
        }
        return res;
    }
}
