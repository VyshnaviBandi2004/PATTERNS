import java.util.*;
public class Movezeros {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.print("enter the array : ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        optimal(a);
        sc.close();
    }
    static void optimal(int a[]){
        int i=0;
        for(int j=0;j<a.length;j++){
            if(a[j]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
            }
        }
        System.out.println(i);
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+" ");
        }
    }
}
