package recursion;

public class PowerExpression {
    public static void main(String[] args) {
        int result= power(2,9);
        System.out.println("power " + result);
    }

    public static int power(int m,int n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return  power(m*m,n/2);
        }
        else {
            return m*power(m*m,(n-1)/2);
        }
    }
}
