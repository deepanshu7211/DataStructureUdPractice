package strings;

import java.util.Arrays;

public class LongestSubStringDistinctCharacters {
    public static void main(String[] args) {
        findLongestSubStringWithDistinctCharacters();
    }

    private static void findLongestSubStringWithDistinctCharacters() {
        String text="abcadbd";
//    Task is to prepare window of distinct character and getting the count of window
//    And updating to res if it is greater than the current count
//    To get the current count we need to store the index of each character in an array
        int n=text.length(),res=0;
        int prev[] = new int[256];
        Arrays.fill(prev,-1);
        int i=0; // this is for starting of window and maxEnd will be the length of window

        for(int j=0;j<n;j++){
            i=Math.max(i,prev[text.charAt(j)]+1);
            int maxEnd = j-i+1;
            res=Math.max(res,maxEnd);
            prev[text.charAt(j)]=j;
        }

        System.out.println(" res " + res);
    }
}
