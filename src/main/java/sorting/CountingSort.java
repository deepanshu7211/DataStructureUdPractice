package sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        countinSort();
    }

    private static void countinSort() {
        int arr[]={1,4,4,1,0,1};
        int k=5;
        int count[] = new int[k];
        int output[]=new int[arr.length];

        for(int i=0;i<k;i++){
            count[i]=0;
        }

//        1st Iteration
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

//        2nd iteraation, will explain how many lements are smaller or equal at that index.
        for(int i=1;i<k;i++){
            count[i] = count[i-1]+count[i];
        }

//        Copying to result array
        for(int i=0;i<arr.length;i++){
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }

        System.out.println(" Finally sorted array is " + Arrays.toString(output));
    }
}
