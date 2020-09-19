package recursion;

public class RecursionBasics {

    public static void main(String[] args) {
    headRecursion(3);
    tailRecursion(3);
    }

    public static void headRecursion(int n){
        if(n>0){
            headRecursion(n-1);
            System.out.println("headRecursion N value " +n);
        }
    }

    public static void tailRecursion(int n){
        if(n>0){
            System.out.println("tailRecursion N value " +n);
            tailRecursion(n-1);
        }
    }
}
