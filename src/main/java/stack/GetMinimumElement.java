package stack;

import java.util.Stack;

public class GetMinimumElement {


    public static void main(String[] args) {
        int arr[]={1 ,6, 43, 1, 2, 0, 5};
       Stack<Integer> m= minPush(arr,arr.length);
        getMinAtPop(m);

    }
    static  Stack<Integer> ax = new Stack<>();

    public static Stack<Integer>  minPush(int arr[],int n)
    {
        // your code here
        Stack<Integer>s=new Stack<>();
        int min=arr[0];
        for(int i=0;i<n;i++){
            min=Math.min(min,arr[i]);
            s.push(min);
        }
        return s;
    }

    /* print minimum element of the stack each time
       after popping*/
    static void getMinAtPop(Stack<Integer>s)
    {
        // your code here
        while(!s.empty())
            System.out.print(s.pop()+" ");
    }
}
