package arrays;

public class MaxIndexDiff {

    public static void main(String[] args)
    {
        MaxIndexDiff max = new MaxIndexDiff();
        int arr[] = {9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
        int n = arr.length;
        int maxDiff = max.maxIndexDiff(arr, n);
        System.out.println(maxDiff);
    }

    int maxIndexDiff(int arr[], int n)
    {
        int rmax[] = new int[n];

        rmax[n-1] = arr[n-1];

        for(int i=n-2;i >= 0; i--)
        {
            rmax[i] = Math.max(arr[i], rmax[i+1]);
        }

        int j =0, k=0, maxdiff = 0;

        while(j <n && k < n)
        {
            if(arr[j] <= rmax[k])
            {
                maxdiff = Math.max(maxdiff, k-j);
                k++;

            }
            else
            {
                j++;
            }
        }

        return maxdiff;
    }


}
