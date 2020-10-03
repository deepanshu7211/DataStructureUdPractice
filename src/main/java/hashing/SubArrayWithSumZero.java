package hashing;

import java.util.HashSet;

public class SubArrayWithSumZero {

    public static void main(String[] args) {
        findSubArrayWithSumZero();
    }

    private static void findSubArrayWithSumZero() {
        int arr[]={1,4,13,-3,-10,5};
//        Prefix sum array  = {1,5,18,15,5,10} . As 5 is repeated twice the sum after
//        1st index to 5th index is zero
//        Pair is 13,-3,-10
        int pre_sum=0;
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            pre_sum+=arr[i];

//hashSet.contains(pre_sum) or hashSet.contains(pre_sum-0)
            if(hashSet.contains(pre_sum)){
                System.out.println(" Got the sub array with zero ");
                break;
            }

            /*
            *  Corner case with array {3,-2,-1,5}
            * pre_fix array {3,2,0,5}
            * */
            if(pre_sum==0){
                System.out.println("got the sub array with zero");
                break;
            }

            hashSet.add(pre_sum);
        }

    }
}
