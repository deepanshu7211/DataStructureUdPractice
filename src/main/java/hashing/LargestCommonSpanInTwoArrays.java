package hashing;

import java.util.HashMap;

public class LargestCommonSpanInTwoArrays {

    public static void main(String[] args) {
        findLargestCommonSpanInTwoBinaryArrays();
    }

    private static void findLargestCommonSpanInTwoBinaryArrays() {
        int arr1[]={0,1,0,0,0,0};
        int arr2[]={1,0,1,0,0,1};
        int temp[] =new int[arr1.length];

//        Create Temp Array
        for(int i=0;i<temp.length;i++){
            temp[i]=arr1[i]-arr2[i];
        }

//        After this question came become same to LargestSubArrayWithGivenSum
        int sum=0;   // Possible pairs (3,1),(-6,6,2,2),(2,2)
        int pre_sum=0;
        int res=-1;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<temp.length;i++){
            pre_sum+=temp[i];

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
