package arrays;

import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        naiveSolution();
        trappingRainWaterSol();
    }


    private static void trappingRainWaterSol(){
        int arr[]={5,0,6,2,3};
        int res=0;
        int lmax[]= new int[arr.length];
        int rmax[]= new int[arr.length];

//      Precomputing the Lmax lmax= {5,5,6,6,6}
        lmax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            lmax[i]=Math.max(arr[i],lmax[i-1]);
        }

//      Precomputing the Rmax Rmax= {6,6,6,3,3}. It will start filling from right hand side

        rmax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rmax[i]=Math.max(arr[i],rmax[i+1]);
        }

        for(int i=1;i<arr.length-1;i++){
            res+=Math.min(lmax[i],rmax[i])-arr[i];
        }

        Arrays.stream(lmax).forEach(System.out::print);
        System.out.println();
        Arrays.stream(rmax).forEach(System.out::print);
        System.out.println();
        System.out.println(" max filled " + res);
    }

//    To find the how much water we can store is using Lmax for ith Element and Rmax for the ith element
//    Min of lmax and rmax - minus arr[i] will result how much water we can store in it.
    private static void naiveSolution(){
        int res=0;
        int arr[]={3,0,1,2,5};
        int lmax=0,rmax=0;
//        Why start from 1 - We can't store water on the Leftmost height
//        Why arr.length -1 - We can't store water on the rightmost height
        for(int i=1;i<arr.length-1;i++){
            lmax= arr[i];
//            To get the Left side maximum height for ith index eg. for 0 it is 3
            for(int j=0;j<i;j++){
                lmax=Math.max(lmax,arr[j]);
            }

//          To get the Right side max height for the ith index . Eg. for 0 it is 5
            rmax=arr[i];
            for(int j=i+1;j<arr.length;j++){
                rmax=Math.max(rmax,arr[j]);
            }

            res+=Math.min(lmax,rmax) - arr[i];
        }

        System.out.println(" max water store " + res);
    }
}
