package binary_search;
//Pivot element means the smallest Element in a sorted rotated array. Where next and prev element is
//greater than the pivot element
public class PivotElement {
    public static void main(String[] args) {
        int arr[]={11,12,15,18,2,5,6,8};
        int res=-1;
        int low=0,high=arr.length-1;
        int n= arr.length;
//        Case 1 if array is sorted
        if(arr[low]<=arr[high]){
            res=low;
        }

        while (low<=high){
            int mid=(low+high)/2;
//          Case 2 . Get Next and prev element . Compare with Pivot element
            int next=(mid+1)%n;
            int prev=(mid+n-1)%n;
            if(arr[mid]<= arr[next] && arr[mid]<= arr[prev]){
                res=mid;
            }
//          Case 3. Pivot cannot lie in a sorted array
            else if(arr[mid]<=arr[high]){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        System.out.println(" result " + res + " element " + arr[res]);
    }
}
