package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GenerateNumber {
    public static void main(String[] args) {
//        generateNumberUsing5and6();
        generateBinaryNumber();
    }

    private static void generateBinaryNumber() {
        Queue<String> q = new LinkedList<>();
        q.add("1");
        q.add("0");
        int n=10;
        for(int i=0;i<n;i++){
            String curr=q.peek();
            if(curr.equals("0")){
                q.remove();
                continue;
            }
            else {
                System.out.print(curr + " ");
                q.remove();
                q.add(curr + "0");
                q.add(curr + "1");
            }
        }
    }

    private static void generateNumberUsing5and6() {
        Queue<String> q = new LinkedList<>();
        q.add("5");
        q.add("6");
        int n=10;
        for(int i=0;i<n;i++){
            String curr=q.peek();
            System.out.print(curr +" " );
            q.remove();
            q.add(curr + "5");
            q.add(curr + "6");
        }
    }
}
