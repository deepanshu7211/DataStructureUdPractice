package binary_search;

public class CountOccurenceNumber {

    public static void main(String[] args) {

        /*
         * Find First and last occurence of a number to find out the count of
         * the number in an array.
         */


        int first = findCountOccurenceOfNumber(10, true);
        int last = findCountOccurenceOfNumber(10, false);
        System.out.println(" Occurrence of Number " + (last - first + 1));
    }

    private static int findCountOccurenceOfNumber(int num, boolean firstFlag) {
         int arr2[] = { 2, 6, 10, 10, 10, 18, 20 };
        int first = 0, last = arr2.length - 1, result = -1;

        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (num == arr2[mid]) {
                result = mid;
                if (firstFlag) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            } else if (num < arr2[mid]) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }

        return result;

    }

}
