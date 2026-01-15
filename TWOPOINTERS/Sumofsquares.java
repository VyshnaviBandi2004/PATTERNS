import java.util.*;
public class Sumofsquares {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array : ");
        int a[]=new int[5];
        int n=a.length;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        // brute(a);
        
        optimal(a);
        sc.close();
    }
    static void brute(int a[]){
        for(int i=0;i<a.length;i++){
            a[i]=a[i]*a[i];
        }
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    static void optimal(int a[]){
        int n=a.length;
        int res[]=new int[n];
        int index=n-1;
        int i=0;
        int j=n-1;
        while(i<=j){
            if(Math.abs(a[i])<Math.abs(a[j])){
                res[index]=a[j]*a[j];
                index--;
                j--;
            }else{
                res[index]=a[i]*a[i];
                index--;
                i++;
            }
        }
        for(int k=0;k<n;k++){
            System.out.print(res[k]+" ");
        }
    }
}
