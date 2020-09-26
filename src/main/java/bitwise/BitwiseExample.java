package bitwise;

public class BitwiseExample {
    public static void main(String[] args) {
//        leftShift();
//        rightShift();
//        checkKthBItSetOrNot();
//        setCountBits();
//        powerOfTwo();
//        oddOcurrence();
        twoOddOccurrence();
    }


    private static void twoOddOccurrence(){
        int arr[]={3,4,3,4,5,4,4,6,7,7};
        int xor=0,res1=0,res2=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i]; // XOR will contain 5^6
        }

        int sn = xor & (~(xor-1));  // TO get the right most set bit
//        It will create two for one right most bit will set and for right most bit will be zero

        for(int i=0;i<arr.length;i++){
            if((arr[i]&sn)!=0){
                res1=res1^arr[i];
            }
            else {
                res2=res2^arr[i];
            }
        }

        System.out.println(" res1 " + res1);
        System.out.println(" res2 " + res2);
    }

/*
*   x^0=x
*   x^x=0
*   x^y=y^x
*   x^(y^z) = (x^y)^z
* */
    public static void oddOcurrence(){
        int arr[]={4,3,4,4,4,5,5};
        int res=0;
        for(int i=0;i<arr.length;i++){
            res=res^arr[i];
        }

        System.out.println(" Odd number is " + res);
    }

    public static void powerOfTwo(){
        int num=8;
        if(num==0){
            System.out.println(" not power of two");
        }
// Using Brian kriningam's algorithm , we can unset the Bit which is set by applying AND operation with n&(n-1)
// As in power of 2 only 1 bit will be set so n&(n-1) should result zero
        if((num&(num-1))==0){
            System.out.println(" Power of two");
        }
        else {
            System.out.println(" Not power of two");
        }
    }

//    It means we need to check how many bits are 1 in a number
//    When we subract 1 from a number then all the zero after the left most bit becomes 1's and
//    the left most bit becomes 0's ( Brian kriningam's algorithm )
    /*
    *  40 = 101000
    *  39 = 100111
    * -----------------
    * 32  = 100000
    * 31  = 011111
    * ----------------
    * 0   = 000000
    *
    * */
    public static void setCountBits(){
        int num = 40;
        int res = 0;
        while (num > 0) {
            num = (num & (num - 1));
            res++;
        }
        System.out.println(" number of bit set is " + res);
    }

//    We are shifting the k-1 bit to right shift(to move to last ) and compare with 1 using AND operation
    public static void checkKthBItSetOrNot(){
        int n=8,k=4;
        if((n >>(k-1)&1)==1){
            System.out.println(" bit is set");
        }
        else {
            System.out.println(" bit is not set");
        }
    }

//    Left shift work as multiple by 2 = (x * 2^y)
    public static void leftShift(){
        int x=3;
        System.out.println(x << 1);
        System.out.println(x << 2);
        System.out.println(x << 4);
    }

    //    RIght shift work as divide by 2 = (x / 2^y)
    public static void rightShift(){
        int x=33;
        System.out.println(x >> 1);
        System.out.println(x >> 2);
        System.out.println(x >> 4);
    }
}
