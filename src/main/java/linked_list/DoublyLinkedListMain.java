package linked_list;

public class DoublyLinkedListMain {
    private DLLNode head = null;
    private DLLNode tail = null;

    public static void main(String[] args) {
        DoublyLinkedListMain dllOperation = new DoublyLinkedListMain();
        dllOperation.add(5);
        dllOperation.add(10);
        dllOperation.add(15);
        dllOperation.add(20);
        dllOperation.add(25);

        dllOperation.traverse(dllOperation.getHead());
    }

    public void add(int data) {
        DLLNode temp = new DLLNode(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.setPrevious(tail);
            tail.setNext(temp);
            tail = temp;
        }

    }

    public void traverse(DLLNode currentNode) {
        if (currentNode == null) {
            return;
        }

        System.out.println(currentNode.getData());
        traverse(currentNode.getNext());
    }

    public DLLNode getHead() {
        return head;
    }

    public DLLNode getTail() {
        return tail;
    }

}

