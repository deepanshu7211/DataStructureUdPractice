package linked_list;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LRUCache {
    public static void main(String[] args) {
        LRUCache obj = new LRUCache(4);
        obj.refer(11); obj.print();
        obj.refer(11); obj.print();
        obj.refer(11); obj.print();
        obj.refer(11); obj.print();

        obj.refer(22); obj.print();
        obj.refer(22); obj.print();
        obj.refer(22); obj.print();

        obj.refer(33); obj.print();
        obj.refer(33); obj.print();
        obj.refer(33); obj.print();

        obj.refer(22); obj.print();
        obj.refer(22); obj.print();
        obj.refer(22); obj.print();

        obj.refer(11); obj.print();
        obj.refer(11); obj.print();

        obj.refer(11); obj.print();
        obj.refer(11); obj.print();

        obj.refer(5); obj.print();
        obj.refer(11); obj.print();

        obj.refer(6); obj.print();
        obj.refer(11); obj.print();
    }

    Deque<Integer> dq ;
    HashSet<Integer> set;
    int size;

    public LRUCache(int s){
        size = s;
        dq = new LinkedList<>();
        set = new HashSet<>();
    }

    public void refer(int key) {
        if(! set.contains(key)) {//key not present in cache - LRU Miss Case
            if(dq.size() == size) {
                set.remove(dq.removeLast());
            }
            dq.addFirst(key);
            set.add(key);
        }else {//key present in cache - LRU Hit case
                //get key location
            if(dq.getFirst() != key) {
                dq.remove(key);//not removing that element from list - since this is DQ not array
                dq.addFirst(key);
                //set.add(key); // not required - data already present in set sice we are in else block
            }
        }
    }


    public void print() {
        Iterator<Integer> it = dq.iterator();
        System.out.print("LRU cache : ");
        while(it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println();
    }

}
