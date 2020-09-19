package recursion;

public class FibnoacciExample {

    public static int fib[] = new int[10];
    public static void main(String[] args) {
        int result = 0;
//        result = simpleFibRecursion(6);
//        result = fibIterative(6);

        for(int i=0;i<fib.length;i++){
         fib[i]=-1;
        }

        result = fibRecursionWithMemoerization(6);
        System.out.println(" result " + result);

    }

    public static int fibRecursionWithMemoerization(int n){
        if(n<=1){
           fib[n]=n;
           return n;
        }
        else {
            if(fib[n-2]==-1){
              fib[n-2] = fibRecursionWithMemoerization(n-2);
            }
            if(fib[n-1]==-1){
               fib[n-1] = fibRecursionWithMemoerization(n-1);
            }
            fib[n] = fib[n-2]+fib[n-1];

            return fib[n];
        }

    }

    public static int simpleFibRecursion(int n){
        if(n<=1){
            return n;
        }
        else {
            return simpleFibRecursion(n-2) + simpleFibRecursion(n-1);
        }
    }

    public static int fibIterative(int n){
        int t0=0,t1=1,sum=0;
        if(n<=1){
            return n;
        }

        for(int i=2;i<=n;i++){
            sum=t0+t1;
            t0=t1;
            t1=sum;
        }
        return sum;
    }
}
