package sorting;

public class KthSmallestElement {
    public static void main(String[] args) {
        findKthSmallestEement();
    }

    private static void findKthSmallestEement(){
        int arr[]={10,4,5,8,11,6,26};
        int k=5;
        QuickSortAlgo quickSortAlgo = new QuickSortAlgo();
        int low=0,high=arr.length-1;

        while (low<high){
            int p= quickSortAlgo.partition(arr,low,high);

            if(p==k-1){
                System.out.println(" kth smallest element is " + arr[p]);
                break;
            }
            else if(p>k-1){
                high=p-1;
            }
            else {
                low=p+1;
            }
        }
    }
}
