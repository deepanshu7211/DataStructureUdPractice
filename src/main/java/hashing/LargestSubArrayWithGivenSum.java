package hashing;

import java.util.HashMap;
import java.util.HashSet;

public class LargestSubArrayWithGivenSum {
    public static void main(String[] args) {
        findLargestSubArrayWithGivenSum();
    }

    /*
    * Approch is similar to SubArrayWithSumK just we use HashMap to find the index
    * */
    private static void findLargestSubArrayWithGivenSum() {
        int arr[]={8,3,1,5,-6,6,2,2};
//    pre-fix     8 11 12 17 11 17 19 21
        int sum=4;   // Possible pairs (3,1),(-6,6,2,2),(2,2)
        int pre_sum=0;
        int res=-1;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            pre_sum+=arr[i];

            if(pre_sum==sum){
                res=i+1;
            }
            if(!map.containsKey(pre_sum)){
                map.put(pre_sum,i);
            }
            if(map.containsKey(pre_sum-sum)){
                res = Math.max(res,(i-(int)map.get(pre_sum-sum)));
            }
        }

        System.out.println(" Max. legnth array is " + res);


    }
}
