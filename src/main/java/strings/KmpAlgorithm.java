package strings;

import java.util.Arrays;

public class KmpAlgorithm {
    public static void main(String[] args) {
        kmpAlgorithm();
    }

    private static void kmpAlgorithm() {
        String text="AAAAABAAABA";
        String patt="AAAA";
        int n=text.length();
        int m=patt.length();

        int lps[] =new int[m];
        computeLps(lps,m,patt);
        int i=0,j=0;

        while (i<n){
//      Case 1 when text.charAt[i]==patt.charAt[j] , best case of matching
           if(text.charAt(i)==patt.charAt(j)){
               i++;j++;
           }
//      Case 2 if j==m pattern found, then will reset j to previous to lps[j-1].
//      Using this we will check only for last character with i. As the value of lps[j-1]
//      will represent already these many character were matched
            if(j==m){
                System.out.println(" pattern found " + (i-j));
                j=lps[j-1];
            }
            else if(i<n && text.charAt(i)!=patt.charAt(j)){
//     Case 3a. if j==0 means second character doesn't match do i++ to check for the next character in text
                if(j==0){
                    i++;
                }
                else {
//   Case 3b. if j!=0, then reset j to lps[j-1] and compare again patt[j] with text[i]
//   Till either character match or j reached to zero i.e. case2 or case 3a
                    j=lps[j-1];
                }
            }
        }

    }

//    LPS of AAAA ={0,1,2,3}. First element of LPS array will always be zero
    private static void computeLps(int[] lps, int m, String patt) {
        int len=0,i=1;
        lps[0]=0;

        while (i<m){
//            Case 1 where patt[i]==patt[len]
            if(patt.charAt(i)==patt.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else {
                //Case 2a. if len==0, means second character does not match with first then
                // do i++ to check for second character
                if(len==0){
                    lps[i]=len;
                    i++;
                }else{
//           case 2b. If len!=0 then will update len = lps[len-1] to check if any previous character
//           is matching or not. Till we get either in case 1 or case 2a.
                    len=lps[len-1];
                }
            }
        }

        System.out.println(" Genrated LPS ");
        Arrays.stream(lps).forEach(System.out::print);
        System.out.println();
    }
}
