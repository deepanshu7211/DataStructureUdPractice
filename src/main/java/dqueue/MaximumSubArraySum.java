package dqueue;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int arr[] ={10,8,5,12,15,7,6};
        int n=7,k=3;
        printMax(arr,n,k);
    }

    private static void printMax(int[] arr, int n, int k) {
        Deque<Integer> dq = new LinkedList<>();

//        Addition of first queue
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && arr[i]>arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

//        After first queue
        for(int i=k;i<n;i++){
            System.out.print(arr[dq.peek()] +" ");
            //removing old window elements from queue

            while(!dq.isEmpty() && dq.peek() <=i-k){
                dq.removeFirst();
            }
//       Same olf logic add i in the queue

            while (!dq.isEmpty() && arr[i]> arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        System.out.print(arr[dq.peek()]);
    }
}
