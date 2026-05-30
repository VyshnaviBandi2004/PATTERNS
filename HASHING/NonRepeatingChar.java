package HASHING;

public class NonRepeatingChar {
    public static void main(String args[]){
        String s="aabbcdde";
        fn(s);
    }
    public static void fn(String s){
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
