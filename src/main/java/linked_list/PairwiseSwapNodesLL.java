package linked_list;

public class PairwiseSwapNodesLL {


    static Node head = null;

    /* Driver code */
    public static void main(String[] args)
    {
        //Node head = null;

    /* The constructed linked list is:
    1->2->3->4->5->6->7 */
        push( 7);
        push( 6);
        push( 5);
        push( 4);
        push(3);
        push( 2);
        push( 1);

        System.out.print("\n Linked list before calling pairWiseSwap() ");
        printList(head);

        Node start = pairWiseSwap(head);

        System.out.print("\n Linked list after calling pairWiseSwap() ");
        printList(start);
    }

    /* Function to pairwise swap elements of a
    linked list */
    static Node pairWiseSwap(Node head)
    {

        // If linked list is empty or there is only
        // one node in list
        if (head == null || head.next == null)
            return head;

        // Fix the head and its next explicitly to
        // avoid many if else in while loop
        Node curr = head.next.next;
        Node prev = head;
        head = head.next;
        head.next = prev;

        // Fix remaining nodes
        while (curr != null && curr.next != null)
        {
            prev.next = curr.next;
            prev = curr;
            Node next = curr.next.next;
            curr.next.next = curr;
            curr = next;
        }

        prev.next = curr;

        return head;
    }

    /* Function to add a node at the
    beginning of Linked List */
    static void push(int new_data)
    {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = (head);
        (head) = new_node;
    }

    /* Function to print nodes in a given linked list */
    static void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    /* A linked list node */
    static class Node
    {
        int data;
        Node next;
    }
}
