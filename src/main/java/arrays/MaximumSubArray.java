package arrays;

public class MaximumSubArray {
    public static void main(String[] args) {
        naiveSolution();
        kadensAlgorithm();
        kadensAlgoAlternate();

    }

    private static void kadensAlgoAlternate(){
        int arr[]={1,-3,2,1,-1};
        int maxsum=0;
        int cursum=0;
        for(int i=0;i<arr.length;i++){
            cursum=cursum+arr[i];
            if(cursum>maxsum){
                maxsum=cursum;
            }
            if (cursum <0){
                // Discarding the left sub-array and starting fresh from the next element
                cursum=0;
            }
        }
        System.out.println(" kadensAlgoAlternate " + maxsum);
    }

    private static void kadensAlgorithm() {
        int arr[]={1,-3,2,1,-1};
        int res=0,maxEnding=arr[0];

        for(int i=1;i<arr.length;i++){
            maxEnding= Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(res,maxEnding);
        }

        System.out.println(" max sum using kadens algo " + res);
    }

    /*
*   For {1,2,3} = for 1 ={1},{1,2},{1,2,3}
*                 for 2 ={2}.{2,3}
*                 for 3={3}
* */
    private static void naiveSolution(){
        int arr[]={1,-3,2,1,-1};
        int res=0,curr=0;

        for(int i=0;i<arr.length;i++){
            curr=0;
            for(int j=i;j<arr.length;j++){
                curr=curr+arr[j];
                res=Math.max(res,curr);
            }
        }
        System.out.println(" maximum sum " + res);
    }
}
