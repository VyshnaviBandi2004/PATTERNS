package RECURSION;

public class Reverse {
    public static void main(String args[]){
        char s[]={'h','e','l','l','o'};
        fn(s,0,s.length-1);
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }
    public static void fn(char s[],int i,int j){
        if(i>=j) return;
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
        fn(s,i+1,j-1);
    }
}
