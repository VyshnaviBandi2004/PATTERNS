import java.util.*;
public class Sortarray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[11];
        int n=a.length;
        System.out.print("enter the array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        better(a, n);
        optimal(a, n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }

    static void better(int a[],int n){
        int cnt0=0;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<n;i++){
            if(a[i]==0) cnt0++; 
            else if(a[i]==1) cnt1++;
            else cnt2++;
        }
        for(int i=0;i<cnt0;i++) a[i]=0;
        for(int i=cnt0;i<cnt0+cnt1;i++) a[i]=1;
        for(int i=cnt0+cnt1;i<cnt0+cnt1+cnt2;i++) a[i]=2;
    }

// dutch national flag algorithm
    static void optimal(int a[],int n){
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(a[mid]==0){
                swap(a,mid, low);
                low++;
                mid++;
            }
            else if(a[mid]==1){
                mid++;
            }else{
                swap(a,mid, high);
                high--;
            }
        }
    }
    static void swap(int a[],int b,int c){
        int temp=a[b];
        a[b]=a[c];
        a[c]=temp;
    }
}
