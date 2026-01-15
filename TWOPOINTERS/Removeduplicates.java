import java.util.*;
public class Removeduplicates{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.print("enter the array : ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("the non duplicates elements : ");
        // brute(a);
        optimal(a);
        sc.close();
    }
    
    static void brute(int a[]){
        int n=a.length;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    cnt++;
                    break;
                }
            }
            if(cnt==0){
            System.out.print(a[i]+" ");
            }
        } 
    }

    static void optimal(int a[]){
        int i=0;
        for(int j=0;j<a.length;j++){
            if(a[i]!=a[j]){
                i++;
                a[i]=a[j];
            }
        }
        for(int k=0;k<=i;k++){
            System.out.print(a[k]+" ");
        }
    }
}