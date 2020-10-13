package strings;

import java.util.Arrays;

public class AnagramOrNot {

    public static void main(String[] args) {
        stringAnagram();
    }

    private static void stringAnagram() {
        String str1 = "decimal";
        String str2 = "medical";
        int hash[] = new int[256];
        Arrays.fill(hash,0);

        if(str1.length()!=str2.length()){
            System.out.println(" not anagram");
            return;
        }

        for(int i=0;i<str1.length();i++){
            hash[str1.charAt(i)]++;
            hash[str2.charAt(i)]--;
        }
/*
        for(int i=0;i<str2.length();i++){
            hash[str2.charAt(i)]--;
        }*/

        boolean isAnagram = true;
        for(int i=0;i<hash.length;i++){
            if(hash[i]!=0){
                isAnagram=false;
                break;
            }
        }
        if(isAnagram){
            System.out.println("Strings are anagram ");
        }else {
            System.out.println("Strings are not anagram ");
        }
    }
}
