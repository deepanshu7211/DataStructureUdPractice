package sorting;

import java.util.Arrays;

public class SortArrayWithThreeTyeps {

    public static void main(String[] args) {
        sortWithThreeTypes();
    }

//    This is also known as Dtuch flag algo
    private static void sortWithThreeTypes() {
        int arr[]={0,1,2,1,1,2,0,2};
        int low=0,mid=0,high=arr.length-1;

        while (mid<=high){

            switch (arr[mid]){
                case 0:
//                    Swap arr[low] with arr[mid]
                    int temp =arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
//                    Swap arr[mid] with arr[high]
                    int temp2 =arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp2;
                    high--;
                    break;
            }
        }

        System.out.println(" Sorted arrays " + Arrays.toString(arr));
    }
}
