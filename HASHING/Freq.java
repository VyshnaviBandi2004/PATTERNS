package HASHING;
public class Freq {
    public static void main(String args[]){
        int a[]={1,2,2,3,1,1};
        numbers(a);
        String str="apple";
        characters(str);
    }
    public static void numbers(int a[]){
        int n=a.length;
        int freq[]=new int[13];
        for(int i=0;i<n;i++){
            freq[a[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println(i+" -> "+freq[i]);
            }
        }
    }
    public static void characters(String str){
        int n=str.length();
        int freq[]=new int[26];
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                char ch=(char)(i+'a');
                System.out.println(ch+" -> "+freq[i]);
            }
        }
    }
}
