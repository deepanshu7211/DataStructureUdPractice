package arrays;

public class WindowSlidingTechinques {
    public static void main(String[] args) {
        windowSlidingSum();
        isSubarrayOfSum();
    }

/*
*   Given an array of non-negative integers and find if there is a subarray with given sum or not
* */
    private static void isSubarrayOfSum(){
        int arr[]={1,4,20,3,10,5}; int sum=33;
//        start and end represents the start and end of the window
        int start=0,end=0;
        int curr_sum=arr[0];
        for(end=1;end<arr.length;end++){
//            Clean the previous window before checking the sum or adding the number.
//            start<end-1 to keep 1 element in the window
            while (curr_sum>sum && start<end-1){
                    curr_sum=curr_sum-arr[start];
                    start++;
              }

            if(curr_sum==sum){
                System.out.println(" found sum");
                break;
            }
            if(curr_sum<sum){
                curr_sum=curr_sum+arr[end];
            }
        }
        System.out.println(" for last set " + (curr_sum==sum));
    }

    /*
    * arry of integer and number k . Find max. sum of k consecutive numbers
    * */
    private static void windowSlidingSum(){
        int arr[]={1,8,30,-5,20,7};
        int k=3;
        int curr_sum=0,res=0;

//        First get the sum of 1st Window. At kth position window ends
        for(int i=0;i<k;i++){
            curr_sum+=arr[i];
        }
        res = Math.max(res,curr_sum);

//    Add one element in the window and remove one elment from window. New window will start from k
     for(int i=k;i<arr.length;i++){
        curr_sum=(curr_sum +arr[i])-arr[i-k]; // i-k helps in removing element from begining
        res= Math.max(res,curr_sum);
     }

        System.out.println(" Maximum sum is " + res);

    }
}
