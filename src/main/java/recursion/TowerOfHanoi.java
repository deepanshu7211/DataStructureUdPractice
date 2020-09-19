package recursion;

public class TowerOfHanoi {

    public static void main(String[] args) {
        toh(3,1,2,3);
    }

    public static void toh(int n,int A,int B,int C)
    {
        if(n>0){
            toh(n-1,A,C,B);
            System.out.println(" Move Disk from " + A  + " to " + C);
            toh(n-1,B,A,C);

        }
    }
}
