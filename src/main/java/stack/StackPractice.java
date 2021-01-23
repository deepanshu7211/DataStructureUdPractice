package stack;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Stack<Integer> s = _push(arr,arr.length);
        _getMinAtPop(s);
    }

    static  Stack<Integer> ax = new Stack<>();

    public static Stack<Integer> _push(int arr[],int n)
    {
        // your code here
        Stack<Integer> ms = new Stack<>();
        for(int i=0;i<n;i++){
            if(ms.isEmpty()){
                ms.push(arr[i]);
                ax.push(arr[i]);
            }
            else{
                ms.push(arr[i]);
                if(ax.peek()>=arr[i])
                {
                    ax.push(arr[i]);
                }
            }
        }
        return ms;
    }

    /* print minimum element of the stack each time
       after popping*/
    static void _getMinAtPop(Stack<Integer>s)
    {
        // your code here
        while (!s.isEmpty()){
            System.out.print(ax.peek() +" ");
            if(s.peek()==ax.peek()){
                ax.pop();
            }
            s.pop();

        }
    }
}
