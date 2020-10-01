package sorting;

import java.util.Arrays;

public class SortArrayWithTwoTypes {

    public static void main(String[] args) {
        sortWithTwoTypes();
    }

    private static void sortWithTwoTypes() {
        int arr[]={0,1,0,1,0,1,0,1,1};
        int low=0,high=arr.length-1;

        while (low<high){
            while (arr[low]==0){
                low++;
            }
            while (arr[high]==1){
                high--;
            }

            if(low>=high){
                break;
            }
            //swap arr[low] with arr[high]

            int temp =arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
        }

        System.out.println(" Sorted arrays " + Arrays.toString(arr));
    }
}
