package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 7, 2, 4, 1, 5, 3 };
        int j = 0, key = 0;

        for(int i=1;i<arr.length;i++){
            key=arr[i];
            j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

        System.out.println(Arrays.toString(arr));
    }
}
