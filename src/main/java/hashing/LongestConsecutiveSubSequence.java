package hashing;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSubSequence {

    public static void main(String[] args) {
        naiveApproach();
        optimizeSolution();
    }

    private static void optimizeSolution() {
        int arr[]={3,8,4,5,7};

        HashSet<Integer> hashSet= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hashSet.add(arr[i]);
        }

        int curr=1,res=0;
        for(int i=0;i<arr.length;i++){
//       TO find out the starting of the Consecutive sequence. If it already exists then it is not a staring point.
            if(!hashSet.contains(arr[i]-1)){
                curr=1;
                while (hashSet.contains(arr[i]+curr)){
                    curr++;
                }
            }

            res= Math.max(res,curr);
        }

        System.out.println(" Longest consecutive Sequence is " + res);
    }

    private static void naiveApproach() {
        int arr[]={3,8,4,5,7};
//O/p 3,4,5
        //First sort the array
        Arrays.sort(arr);
        int curr=1,res=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]+1){
                curr++;
            }
            else {
                res=Math.max(res,curr);
                curr=1;
            }
        }
        res = Math.max(res,curr);
        System.out.println(" Longest consecutive sequence "+res);
    }
}
