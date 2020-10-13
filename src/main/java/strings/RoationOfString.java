package strings;

public class RoationOfString {
    public static void main(String[] args) {
        boolean rotation = checkRotationOfString();
        System.out.println(" rotation " + rotation);
    }

    private static boolean checkRotationOfString() {
        String s1="ABCD";
        String s2="CDAB";
        if(s1.length()!=s2.length()){
            return false;
        }
        return (s1+s1).indexOf(s2)>=0;
    }
}
