package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static void main(String[] args) {
        reverseIterative();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverseUsingRecursion(q);
        System.out.println("using recusion " +q);

    }

    private static void reverseUsingRecursion(Queue<Integer> q) {
        if(q.isEmpty()){
            return;
        }
        int x= q.peek();
        q.remove();
        reverseUsingRecursion(q);
        q.add(x);
    }

    private static void reverseIterative() {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()){
            s.push(q.remove());
        }

        while (!s.isEmpty()){
            q.add(s.pop());
        }

        System.out.println(q);
    }
}
