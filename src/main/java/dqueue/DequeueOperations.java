package dqueue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueOperations {

    Deque<Integer> dq;

    public static void main(String[] args) {
        DequeueOperations ds = new DequeueOperations();

        ds.insertMin(10);
        ds.insertMax(15);
        ds.insertMin(5);

        int x= ds.extractMin();
        System.out.println(x);

        x= ds.extractMax();
        System.out.println(x);

        ds.insertMin(8);
    }

    DequeueOperations()
    {
        dq = new LinkedList<>();
    }

    void insertMin(int x)
    {

        dq.offerFirst(x);
    }

    void insertMax(int x)
    {

        dq.offerLast(x);
    }

    int getMin()
    {

        return dq.peekFirst();
    }

    int getMax()
    {

        return dq.peekLast();
    }

    int extractMin()
    {

        return dq.pollFirst();
    }

    int extractMax()
    {

        return dq.pollLast();
    }
}
