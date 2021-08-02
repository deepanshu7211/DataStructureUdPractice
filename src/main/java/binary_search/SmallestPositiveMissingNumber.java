package binary_search;

/*
* You are given an array arr[] of N integers including 0.
* The task is to find the smallest positive number missing from the array.
 * */
public class SmallestPositiveMissingNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int missingNumber = missingNumber(arr, arr.length);
        System.out.println(" missing number " + missingNumber);
    }

    // function to find first positive missing number
    static int missingNumber(int arr[], int size)
    {

        // Your code here
        int n=size;
        boolean[] present = new boolean[n + 1];

        for (int i = 0; i < n; i++) {

            if (arr[i] > 0 && arr[i] <= n)
                present[arr[i]] = true;
        }


        for (int i = 1; i <= n; i++)
            if (!present[i])
                return i;

        return n+1;
    }

}
