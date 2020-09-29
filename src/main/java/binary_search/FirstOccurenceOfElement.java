package binary_search;

public class FirstOccurenceOfElement {

    public static void main(String[] args) {
        binarySearchFirstOccurence(10);
    }

    public static void binarySearchFirstOccurence(int num) {
         int arr2[] = { 2, 6, 10, 10, 10, 18, 20 };
        int first = 0, last = arr2.length - 1, result = -1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (num == arr2[mid]) {
                result = mid;
                last = mid - 1; // For Last Occurrence first= mid+1
            } else if (num < arr2[mid]) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        System.out.println(" result " + result);
    }
}
