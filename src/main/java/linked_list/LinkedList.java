package linked_list;

public class LinkedList {
    private Node head=null;
    private Node tail = null;

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.traverse();
        linkedList.traverseRecursively(linkedList.head);
        System.out.println();
        System.out.println(" Length " + linkedList.length(linkedList.head));
        System.out.println(" max " + linkedList.max(linkedList.head));
        System.out.println(" search " + linkedList.search(linkedList.head,5));
        linkedList.addAtAfter(7,5);
        System.out.println("\n After adding 7 ");
        linkedList.traverse();

        linkedList.insertInSortedList(4) ;
        System.out.println("\n After adding 4 ");
        linkedList.traverse();

        linkedList.deleteAfter(4);
        System.out.println("\n Original Linked List After deleting 4  ");
        linkedList.traverse();

        linkedList.reverse();
        System.out.println("\n Reversed Linked List using iterative method ");
        linkedList.traverse();

        linkedList.reverseUsingRecursion(linkedList.head);
        System.out.println("\n Reversed Linked List using Recursion");
        linkedList.traverse();

        System.out.println("\n Reversed K group nodes in Linked List using Recursion");
        Node newHead = linkedList.reverseKNodes(linkedList.head,3);
        linkedList.head =newHead;
        linkedList.traverse();
    }

    private Node reverseKNodes(Node head,int k){
        Node cn=head;
        Node prev=null,next=null;
        int count = 0;

        while (cn!=null && count<k){
            next=cn.getNext();
            cn.setNext(prev);
            prev=cn;
            cn=next;
            count++;
        }

        if(next!=null){
            Node rest_head = reverseKNodes(next,k);
            head.setNext(rest_head);
        }
        return prev;
    }

    private void reverseUsingRecursion(Node currentNode) {
//        Base Case
        if(currentNode.getNext()==null){
            head=currentNode;
            return;
        }
        else {
            reverseUsingRecursion(currentNode.getNext());
            Node nextNode =currentNode.getNext();
            nextNode.setNext(currentNode);
            currentNode.setNext(null);
        }
    }


    private void reverse() {
        Node currentNode =head;
        Node prev=null,next=null;

        while (currentNode!=null){
            next=currentNode.getNext();
            currentNode.setNext(prev);
            prev=currentNode;
            currentNode=next;
        }
        head=prev;
    }

    private void deleteAfter(int position) {
        Node next=null;
        Node currentNode = head;
        for(int i=0;i<position-2;i++){
            currentNode = currentNode.getNext();
        }
        System.out.println(" Current node " + currentNode.getData());
        next=currentNode.getNext();
        currentNode.setNext(next.getNext());
        next.setNext(null);
    }


    private void insertInSortedList(int data) {
        Node q=null;
        Node p = head;
        Node temp = new Node(data);
        while (p!=null && p.getData()<data){
            q=p;
            p=p.getNext();
        }
        temp.setNext(p);
        q.setNext(temp);
    }

    public int search(Node currentNode, int key){
        if(currentNode==null){
            return -1;
        }
        if(currentNode.getData()==key){
            return 1;
        }
        else{
            return search(currentNode.getNext(),key);
        }
    }

    public int max(Node currentNode){
        int x=0;
        if(currentNode==null){
            return Integer.MIN_VALUE;
        }else {
            x =max(currentNode.getNext());
            return x>currentNode.getData()?x:currentNode.getData();
        }
    }

    public void add(int data){
        Node temp = new Node(data);
        if(head==null){
            head=temp;
            tail=temp;
        }else {
            tail.setNext(temp);
            tail=temp;
        }
    }

    public void addAtBegning(int data) {
        Node temp = new Node(data);
        temp.setNext(head);
        head = temp;
    }

    public void addAtAfter(int data,int position) {
        Node temp = new Node(data);
        Node currentNode = head;
        int count=0;
        for(int i=0;i<position-1;i++){
            currentNode=currentNode.getNext();
        }
        temp.setNext(currentNode.getNext());
        currentNode.setNext(temp);
    }


    public int length(Node currentNode){
        if(currentNode.getNext()==null){
            return 1;
        }
        else {
            return 1+ length(currentNode.getNext());
        }
    }

    public void traverseRecursively(Node currentNode){
        if(currentNode==null){
            return;
        }
        else {
            traverseRecursively(currentNode.getNext());
//            System.out.println(" Node data " + currentNode.getData());

        }
    }

    public void traverse(){
        Node currentNode=null;
        currentNode = head;
        while (currentNode!=null){
            System.out.print(" " + currentNode.getData());
            if(currentNode.getNext()!=null)
                System.out.print(" --> ");
            currentNode = currentNode.getNext();
        }
    }
}

