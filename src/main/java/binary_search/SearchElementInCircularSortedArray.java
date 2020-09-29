package binary_search;

public class SearchElementInCircularSortedArray {

    public static void main(String[] args) {
        findElementInCircularSortedArray();
    }

    public static void findElementInCircularSortedArray() {
        int a[] = { 11, 12, 15, 18, 2, 5, 6, 8 };
        int x = 12;
        int low = 0, high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == a[mid]) { // Case 1 Found Middle element
                System.out.println(" Index of element :: " + mid);
                break;
            } else if (a[mid] <= a[high]) { // Case 2 : Right Side array is
                // sorted Check on right side
                if (x > a[mid] && x <= a[high]) {
                    low = mid + 1; // Element on Right side.
                } else {
                    high = mid - 1;
                }
            } else {
                if (x >= a[low] && x < a[mid]) {
                    high = mid - 1; // Element on Left hand Side
                } else {
                    low = mid + 1;
                }
            }
        }

    }

}
