package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NextLargestElement {
    public static void main(String[] args) {
        int arr[]={5,15,10,8,6,12,9,18};
        nextLargestNumber(arr,arr.length);


    }

    private static void nextLargestNumber(int[] arr, int length) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        stack.push(arr[length-1]);

        for(int i =length-2;i>=0;i--){
            while (!stack.isEmpty() && arr[i]>=stack.peek()){
                stack.pop();
            }

            int gr = stack.isEmpty()?-1:stack.peek();
            list.add(gr);
            stack.push(arr[i]);

        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
