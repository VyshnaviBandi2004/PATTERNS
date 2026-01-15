import java.util.*;
public class Mergearrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array 1 a = ");
        int[] a=new int[3];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the array 2 b = ");
        int[] b=new int[3];
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }  
        int[] c=new int[a.length+b.length];
        // mergearr(a, b, c);
        System.out.print("merged array : ");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
        merge(a, b);
        sc.close();
    }

    static void merge(int a[],int b[]){
        int n=a.length+b.length;
        int[] c=new int[n];
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
                k++;
            }else{
                c[k]=b[j];
                j++;
                k++;   
            }
        }
        while(i<a.length){
            c[k]=a[i];
            k++;
            i++;
        }
        while(j<b.length){
            c[k]=b[j];
            k++;
            j++;
        }
        for(int x=0;x<n;x++){
            System.out.print(c[x]+" ");
        }
        System.out.println();
    }

    static void mergearr(int a[],int b[],int c[]){
        int k=0;
        for(int i=0;i<a.length;i++){
            c[k]=a[i];
            k++;
        }
        for(int j=0;j<b.length;j++){
            c[k]=b[j];
            k++;
        }
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]>c[j]){
                    int temp=c[j];
                    c[j]=c[i];
                    c[i]=temp;
                }
            }
        }
    }
}
