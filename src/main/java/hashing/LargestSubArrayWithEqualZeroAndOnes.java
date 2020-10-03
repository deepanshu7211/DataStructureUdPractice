package hashing;

import java.util.HashMap;

public class LargestSubArrayWithEqualZeroAndOnes {

    public static void main(String[] args) {
        findLargestSubArrayWithEqualZeroAndOnes();
    }

    /*
    * This problem is similar to LargestSubArrayWithGivenSum with Sum =0
    * When we make every element in the array 0 to -1
    * */
    private static void findLargestSubArrayWithEqualZeroAndOnes(){
        int arr[]={1,1,1,0,1,0,1,1,1};
        int pre_sum=0,sum=0,res=0;
        HashMap<Integer,Integer> map = new HashMap<>();

//        Setting all zero to -1
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }

        for(int i=0;i<arr.length;i++){
            pre_sum+=arr[i];

            if(pre_sum==sum){
                res=i+1;
            }

            if (!map.containsKey(pre_sum)){
                map.put(pre_sum,i);
            }
            else
            {
                res=Math.max(res,i-(int)map.get(pre_sum));
            }
        }

        System.out.println(" Maximum length of O's and 1's is " + res);
    }
}
