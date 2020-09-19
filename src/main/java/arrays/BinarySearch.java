package arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int result = 0;
//        result = binarySearch(arr,5);
        result = recursiveBinarySearch(arr,0,arr.length-1,6);
        System.out.println(" result " + result);

    }

    public static int recursiveBinarySearch(int arr[],int low,int high,int key){
        int mid;
//        Base case
        if(low>high){
            return -1;
        }

        if (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key < arr[mid]) {
                return recursiveBinarySearch(arr, low, mid - 1, key);
            } else {
                return recursiveBinarySearch(arr, mid + 1, high, key);
            }
        }
        return -1;
    }

    public static int binarySearch(int arr[],int key){
        int mid=0,low=0,high=arr.length-1;
        int result =-1;

        while (low<=high){
            mid = (low+high)/2;
            if(arr[mid]==key){
                result = mid;
                break;
            }
            else if(key < arr[mid]){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return result;
    }
}
