package recursion;

public class StringSubSets {
    public static void main(String[] args) {
        String str="ABC";
        stringSubSet(str,"",0);
    }

    private static void stringSubSet(String str, String op, int index) {
        if(index==str.length()){
            System.out.println(op + " ");
            return;
        }
        stringSubSet(str,op,index+1);
        stringSubSet(str,op+str.charAt(index),index+1);
    }
}
