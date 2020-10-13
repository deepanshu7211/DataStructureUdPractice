package strings;

public class BinaryString {

    public static void main(String[] args) {
        findBinaryString();
    }

    /*
    * Given a binary string S. The task is to count the number of substrings that start and end with 1.
    *  For example, if the input string is “00100101”, then there are three substrings “1001”, “100101”
    *  and “101”.
    * Input:
        N = 4
        S = 1111
        Output: 6
        Explanation: There are 6 substrings from
                     the given string. They are 11, 11, 11,
                      111, 111, 1111.
    * */
    private static void findBinaryString() {
        String str="1111";
        int n=str.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='1')
                count++;
        }
// Formula is nc2 equals to n*(n-1)/2
        System.out.println((count*(count-1))/2);
    }
}
