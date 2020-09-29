package binary_search;

public class PairSumSearch {
    public static void main(String[] args) {
        findPairInSortedArray();
    }

    private static void findPairInSortedArray(){
        int arr[]={2,5,8,12,30};
        int sum=17;
        int low=0,high=arr.length-1;
        while (low<high){
            if(arr[low]+arr[high]==sum){
                System.out.println(" pair is " + low + " " +high);
                break;
            }
            else if(arr[low]+arr[high]<sum){
                low++;
            }
            else {
                high--;
            }
        }
    }
}
