package hashing;

import java.util.HashMap;
import java.util.HashSet;

public class SubArrayWithSumK {
    public static void main(String[] args) {
        
        findSubArrayWithSumK();
        findSubArrayWithSumKForNegativeInteger();
        
    }

    private static void findSubArrayWithSumKForNegativeInteger() {
        int arr[] = {10,2,-2,-20,10};
        int sum = -10;
        int ctr=0;
        HashMap <Integer,Integer> hm = new HashMap<Integer,Integer>();
        int prefix_sum = 0;
        for(int num:arr){
            prefix_sum += num;
            if(prefix_sum==sum)
                ctr++;
            if(hm.containsKey(prefix_sum-sum))
                ctr+=hm.get(prefix_sum-sum);
            if(hm.containsKey(prefix_sum))
                hm.put(prefix_sum, hm.get(prefix_sum)+1);
            else
                hm.put(prefix_sum, 1);
        }
        System.out.println(" count " + ctr);
    }

    private static void findSubArrayWithSumK() {
        int arr[]={5,8,6,13,3,-1};
        int sum = 22;
//        Pair 6,13,3
        /*
        *  This is the extension of with Sum zero problem
        * I/p       = 5,8,6,13,3,-1
        * Pref-fix  = 5,13,19,32,35,34
        * If we subtract 35-Sum(22) = 13. Which is already present int he set
        * */

        HashSet<Integer> hashSet = new HashSet<>();
        int pre_sum=0;

        for(int i=0;i<arr.length;i++){
            pre_sum+=arr[i];

//            Corner case
            if(pre_sum==sum){
                System.out.println(" Got the pair corner case");
                break;
            }

            if(hashSet.contains(pre_sum-arr[i])){
                System.out.println(" Got the pair for sum ");
                break;
            }
            hashSet.add(pre_sum);
        }
    }
}
