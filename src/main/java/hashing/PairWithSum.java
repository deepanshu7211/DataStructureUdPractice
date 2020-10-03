package hashing;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.HashSet;

public class PairWithSum {
    public static void main(String[] args) {

        pairSumInArray();
    }

    private static void pairSumInArray() {
        int arr[]={3,2,8,15,-8};
        int sum=17;

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(hashSet.contains(sum-arr[i])){
                System.out.println(" Got the pair " + arr[i] + " " + (sum-arr[i]));
                break;
            }
            hashSet.add(arr[i]);
        }

    }
}
