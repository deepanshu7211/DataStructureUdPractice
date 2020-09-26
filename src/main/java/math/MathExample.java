package math;

public class MathExample {
    public static void main(String[] args) {
//        countDigits();
//        isPallindrom();
          countOfDigitsUsingLog();
          trailingZerosInFactorial();
          digitsInFactorial();
          highestCommonFactor();
          lcm();
          isPrime(7);
    }

    /*
    * Pair of Number like 30 =(1,30),(2,15),(3,10),(5,6)
    * x*y = n, such that x<y
    * x*x = n
    * x= Math.sqrt(n)
    * if any number y > sqrt(n) then its pair(x) will already be counted in sqrt(n)
    * */
    private static void isPrime(int n){

        int limit = (int)Math.sqrt(n);
        boolean isPrime=true;

        for(int i = 2; i <= limit; i++){

            if(n % i == 0){
                isPrime=false;
            }
        }
        System.out.println(" is prime " + isPrime);
    }

    public static void lcm(){
//        Mulltiple of 4 = 4,8,12,16
//        Mulltiple of 6 = 6,12,18
        int a=4,b=6;  // Common multiple of 4 and 6 is 12
        int res=Math.max(a,b);
        while (true){
            if(res%a==0 && res%b==0){
                break;
            }
            res++;
        }
        System.out.println(" LCM is " + res);

    }

    public static void highestCommonFactor(){
        int a=10;int b=15;
        int res=Math.min(10,15);
        while (res>0){
            if(a%res==0 && b%res==0){
                break;
            }
            res--;
        }

        System.out.println(" GCD is " + res);
    }

    /*
    * An efficient way to solve this problem is to observe the properties of prime factorization. Consider prime factors of N!.
    * A trailing zero is always produced by the prime factors 2 and 5. If we can count the number of 5s and 2s in prime factorization of N!, our task is done.

      Consider the following examples:
      N = 5: There is one 5 and 3 2s in prime factors of 5! (2 * 2 * 2 * 3 * 5). So count of trailing 0s is 1.
      N = 11: There are two 5s and three 2s in prime factors of 11! (2 8 * 34 * 52 * 7). So count of trailing 0s is 2.

     We can easily observe that the number of 2s in prime factors is always more than or equal to the number of 5s.
     *  So if we count 5s in prime factors, we are done.
    * */
    public static  void trailingZerosInFactorial(){
        int num=251;
        int res=0;
        for(int i=5;i<=num;i=i*5){
            res= res + (num/i);
        }
        System.out.println(" number of trailing zeros are " + res);
    }

//    To check number is pallindrome or not we reverse the number and compare with original number
    public static void isPallindrom(){
        int originalNum=363;
        int num = originalNum;
        int rev=0;
        while (num>0){
            int reminder = num%10;    //it will give reminder = 3;
            rev = rev*10+reminder;
            num=num/10;
        }
        if(rev==originalNum){
            System.out.println(" it is pallindrome");
        }
        else {
            System.out.println(" it is not pallindrome");
        }

    }

    /*
    *  IN this we will use log properties log(a*b) = log(a) + log(b)
    *  log(1*2*3*4*5) = log(1)+log(2)+log(3)+log(4)+log(5)
    * */
    public static void digitsInFactorial(){
        int num=5; // 5!=120 = digits=3
        double count=0;
        while (num>0){
            count+=Math.log10(num);
            num--;
        }

        System.out.println(" number of digits in factorail " +(((int)Math.floor(count))+1));
    }

    public static void countOfDigitsUsingLog(){
        int num=363;
        int log10 = (int) Math.log10(num);
        System.out.println(" number of digits is " + (Math.floor(Math.log10(num)) +1));
    }
    public static void countDigits(){
        int n=363;
        int count =0;
        while (n>0){
            n=n/10; // it will remove last digit 363 --> 36
            count++;
        }
        System.out.println(" no. of digits " + count);
    }
}
