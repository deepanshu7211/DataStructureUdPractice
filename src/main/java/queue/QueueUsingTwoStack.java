package queue;

import java.util.Stack;

public class QueueUsingTwoStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public static void main(String[] args) {
        QueueUsingTwoStack queueUsingTwoStack = new QueueUsingTwoStack();
        queueUsingTwoStack.enqueue(10);
        queueUsingTwoStack.enqueue(20);
        queueUsingTwoStack.enqueue(30);
        queueUsingTwoStack.enqueue(40);

        queueUsingTwoStack.dequeue();
        queueUsingTwoStack.dequeue();
    }

    private  void enqueue(int x) {
        s1.push(x);
    }

    private int dequeue(){
        if(s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        int item =s2.peek();
        System.out.println(" dequeue " + item);
            return s2.pop();

    }

    private boolean  isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }

    private int size(){
        return s1.size()+s2.size();
    }


}
