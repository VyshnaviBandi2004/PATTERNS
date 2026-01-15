import java.util.*;
public class Palindrome {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string : ");
    String s=sc.nextLine();
    palindrome(s);
    sc.close();
   } 

   static void palindrome(String str){
    int l=0;
    int r=str.length()-1;
    while(l<r){
        if(str.charAt(l)!=str.charAt(r)){
        System.out.println("given string is not a palindrome");
        return;
        }
        l++;
        r--;
    }
    System.out.println("given string is a palindrome");
   }
}
