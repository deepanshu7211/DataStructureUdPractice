package binary_search;

public class RotationCountUsingBS {

    public static void main(String[] args) {
        findRotationCountUsingBinarySearch();
        naiveRotationCount();
    }

    private static void naiveRotationCount() { // Find Index of Lowest Element To know
        // the no. of rotation. We can use
        // binary search also
        int rot[] = { 11, 12, 15, 18, 2, 5, 6, 8 };
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int i = 0; i < rot.length; i++) {
            if (rot[i] < min) {
                min = rot[i];
                minIndex = i;
            }
        }
        System.out.println(" Rotation Count :: " + minIndex);
    }

    private static void findRotationCountUsingBinarySearch() {
        int rot[] = { 11, 12, 15, 18, 2, 5, 6, 8 };
        int low=0,high=rot.length-1,mid=0,next,prev;
        int rotCount=-1,n=rot.length;
        while(low<=high) {
            if(rot[low]<=rot[high]) // Case 1 when array is sorted
            {
                rotCount = low;
                break;
            }
            mid=(low+high)/2;
            next = (mid+1)%n;
            prev = (mid-1+n)%n;
            if (rot[mid]<= rot[next] && rot[mid]<=rot[prev]) {
                rotCount=mid;		// Case 2 find pivot element
                break;
            }
            else if (rot[mid]<=rot[high]) {
                high=mid-1;
            }
            else if (rot[low] <= rot[mid]) {
                low=mid+1;
            }
        }
        System.out.println(" rotation index " + rotCount);
    }

}
