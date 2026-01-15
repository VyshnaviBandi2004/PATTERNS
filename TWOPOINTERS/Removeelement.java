import java.util.*;
public class Removeelement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        System.out.print("enter the array : ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("enter the value to be removed : ");
        int value=sc.nextInt();
        optimal(a, value);
        sc.close();
    }
    static void optimal(int a[],int val){
        int i=0;
        for(int j=0;j<a.length;j++){
            if(a[j]!=val){
                a[i]=a[j];
                i++;
            }
        }
        for(int k=0;k<i;k++){
            System.out.print(a[k]+" ");
        }
        System.out.println();
        System.out.print(i);
    }
}
