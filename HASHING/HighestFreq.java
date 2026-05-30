package HASHING;

public class HighestFreq {
    public static void main(String args[]){
        int a[]={4,4,4,4,2,2,1};
        System.out.println(numbers(a));
        String s="success";
        System.out.println(characters(s));
    }
    public static char characters(String s){
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int max=0;
        char ans=' ';
        for(int i=0;i<26;i++){
            if(freq[i]>max){
                max=freq[i];
                ans=(char)(i+'a');
            }
        }
        return ans;
    }
    public static int numbers(int a[]){
        int n=a.length;
        int freq[]=new int[13];
        for(int i=0;i<n;i++){
            freq[a[i]]++;
        }
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>max){
               max=freq[i];
               ans=i;
            }
        }
        return ans;
    }
}
