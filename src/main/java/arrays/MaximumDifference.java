package arrays;

public class MaximumDifference {
    public static void main(String[] args) {
        maxDiff();
    }

    private static void maxDiff(){
        int arr[]={2,3,10,6,4,8,1};
        int res=arr[1]-arr[0],min=arr[0];

        for(int j=1;j<arr.length;j++){
            res=Math.max(res,arr[j]-min);
            min=Math.min(min,arr[j]);
        }

        System.out.println(" Max. diff " + res);
    }
}
