package strings;

public class StringQuestions {
    public static void main(String[] args) {
//        stringLength();
//        stringReverse();
//        stringPallindrome();
//        stringDuplicateCharacter();
//        stringAnagram();
//        For Permutation
        String str ="ABC";
        stringPermutation(str,0,str.length()-1);
    }

    private static void stringPermutation(String str,int l,int h) {
//        Base Condition
        if (l == h)
            System.out.println(str);
        else
        {
            for (int i = l; i <= h; i++)
            {
//                This is for swapping and keeping Constant
                str = swap(str,l,i);
                stringPermutation(str, l+1, h);
//              Backtrack and keep the string same as for passing to the next call
                str = swap(str,l,i);
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    private static void stringAnagram() {
        String str1 = "decimal";
        String str2 = "medical";
        int hash[] = new int[256];
        if(str1.length()!=str2.length()){
            System.out.println(" not anagram");
            return;
        }

        for(int i=0;i<str1.length();i++){
            hash[str1.charAt(i)]++;
        }

        for(int i=0;i<str2.length();i++){
            hash[str2.charAt(i)]--;
        }

        boolean isAnagram = true;
        for(int i=0;i<hash.length;i++){
            if(hash[i]<0 || hash[i]>0){
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

    private static void stringDuplicateCharacter() {
        String str = "test string";
//        No of character 256 - Total Number of character in ASCII table
        int hashArr[] = new int[256];
        for(int i=0;i<str.length();i++){
            hashArr[str.charAt(i)]++; // str.charAt(i) - will return integer value of character
        }

        for(int i=0;i<hashArr.length;i++){
            if(hashArr[i]>1){
//                System.out.println(" duplicate character " +i +" count " + charArr[i]);
                System.out.printf(" duplicate character %c count %d" ,i, hashArr[i]);
                System.out.println();
            }
        }
    }

    private static void stringPallindrome() {
        String str = "aaabaaa";
        char strArr[]= str.toCharArray();
        int i=0,j=strArr.length-1;
        boolean isPallindrome=true;

        while (i<j){
            if(strArr[i]!=strArr[j]){
                isPallindrome=false;
                break;
            }
            i++;
            j--;
        }
        if(isPallindrome){
            System.out.println(" String is pallindrom ");
        }else {
            System.out.println(" String is not pallindrome");
        }
    }

    private static void stringReverse() {
        String str = "welcome";
        char strArr[]= str.toCharArray();
        int i=0,j=strArr.length-1;
        while (i<j){
            char ch = strArr[i];
            strArr[i]=strArr[j];
            strArr[j]=ch;
            i++;j--;
        }
        System.out.println(" " + String.valueOf(strArr));
    }

    private static void stringLength() {
        String str = "welcome";
        int count=0;
        for(char ch : str.toCharArray()){
            count++;
//            System.out.println(" " +ch);
        }
        System.out.println(" lenght using count " + count);
        System.out.println(" lenght using length func " + str.length());
    }
}
