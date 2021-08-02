package recursion;

public class StringPermutationRecursion {
    public static void main(String[] args) {
        permutation("", "abc");
    }

    private static  void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.err.println(perm);
        } else {
            for (int i = 0; i < word.length(); i++) {
//                System.out.println("word.charAt(i) ::   "+ word.charAt(i));
//                System.out.println("word.substring(0, i) :  " +word.substring(0, i));
//                System.out.println("word.substring(i + 1, word.length())   :: " + word.substring(i + 1, word.length()));

                permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
            }
        }
    }
}
