package binary_search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class PeakElements {
    public static void main(String[] args) {
//        findPeakElement();
    }

    /*
    *   Peak Element means it is greater than from both the left and right side immediate elements
    * */

    private static void findPeakElement(){
        int arr[]={5,10,20,15,7};
        int low=0,high=arr.length-1;

        while (low<=high){
            int mid=(low+high)/2;

            if((mid==0|| arr[mid]>arr[mid-1]) && (mid==arr.length-1 || arr[mid]>arr[mid+1])){
                System.out.println(" find the peak " + mid + " " + arr[mid]);
                break;
            }
//            If element in the left side is greater then ther is a chance that peak element can exist in
//            the left hand side of the array
            else if(arr[mid-1]>arr[mid]){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
    }
}
