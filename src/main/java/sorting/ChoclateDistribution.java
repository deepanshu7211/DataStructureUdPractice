package sorting;

import java.util.Arrays;

public class ChoclateDistribution {
    public static void main(String[] args) {
        chocolatesDistributionProblem();
    }

//    Distribute the choclates such that the difference b/w the max and min chocolates will be minimum
    private static void chocolatesDistributionProblem() {
        int arr[]={2,3,4,7,9,12,56}; // No. of chocolates
        int m=3; // M is children

        if(m>arr.length){
            System.out.println("   Not possible ");
        }

        Arrays.sort(arr);
        int res= arr[m-1]-arr[0];

        for(int i=1;(i+m-1)<arr.length;i++){
            res= Math.min(res,(arr[i+m-1]-arr[i]));
        }

        System.out.println(" result is " + res);
    }
}
