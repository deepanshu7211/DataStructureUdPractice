package stack;

import java.util.Stack;

public class LargestRectangularArea {

    public static void main(String[] args) {
        optimiseRectangularArea();
    }

    private static void optimiseRectangularArea() {
        int[] arr=new int[]{6,2,5,4,1,5,6};
        int res=0;
        int[] ps=new int[arr.length];
        int[] ns=new int[arr.length];
        int n=arr.length;

        Stack<Integer> s=new Stack<>();
        s.add(0);
        for(int i=0;i<arr.length;i++){
            while(s.isEmpty()==false && arr[s.peek()]>=arr[i])
                s.pop();
            int pse=s.isEmpty()?-1:s.peek();
            ps[i]=pse;
            s.push(i);
        }

        while(s.isEmpty()==false){
            s.pop();
        }

        s.push(n-1);
        for(int i=n-1;i>0;i--){
            while(s.isEmpty()==false && arr[s.peek()]>=arr[i])
                s.pop();
            int nse=s.isEmpty()?n:s.peek();
            ns[i]=nse;
            s.add(i);
        }

        for(int i=0;i<n;i++){
            int curr=arr[i];
            curr+=(i-ps[i]-1)*arr[i];
            curr+=(ns[i]-i-1)*arr[i];
            res=Math.max(res,curr);
        }

        System.out.println(" result "+res);
    }
}
