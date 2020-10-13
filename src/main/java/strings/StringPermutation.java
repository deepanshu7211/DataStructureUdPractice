package strings;

public class StringPermutation {
    public static void main(String[] args) {
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

}
