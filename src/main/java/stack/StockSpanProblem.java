package stack;

import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int price[] = {100,80, 60, 70, 60, 75, 85};
        stockSpanProblem(price,price.length);
    }

    private static void stockSpanProblem(int[] price, int length) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        System.out.print(1+" ");

        for(int i=1;i<length;i++){
//            int span=1;
//            To keep the previous greater element in the stack
            while(!stack.isEmpty() && price[stack.peek()]<=price[i]){
                stack.pop();
            }
            int span = stack.isEmpty()?i+1:i-stack.peek();
            System.out.print(span +" ");
            stack.push(i);
        }
    }
}
