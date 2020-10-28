package linked_list;

public class CircularLinkedList {

    private CLLNode head=null;
    private CLLNode tail = null;

    public static void main(String[] args) {
        System.out.println("in main");
        CircularLinkedList cLLNodeOperations = new CircularLinkedList();
        cLLNodeOperations.add(10);
        cLLNodeOperations.add(20);
        cLLNodeOperations.add(30);
        cLLNodeOperations.add(50);


        cLLNodeOperations.traverse();

    }

    public void add(int data) {
        CLLNode temp = new CLLNode(data);
        if (head == null) {
            head = temp;
            tail = temp;

        } else {
            tail.setNext(temp);
            tail = temp;
        }
        tail.setNext(head);
    }

    public void traverse() {
        CLLNode current = head;
        while (current != null) {
            System.out.println("data :: " + current.getData());
            current = current.getNext();
            if (current == head) {
                break;
            }
        }
    }

    public CLLNode getHead() {
        return head;
    }

    public CLLNode getTail() {
        return tail;
    }
}
