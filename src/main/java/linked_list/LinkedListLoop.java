package linked_list;

public class LinkedListLoop {

    static Node head;

    // Driver program to test above functions
    public static void main(String[] args) {
        LinkedListLoop list = new LinkedListLoop();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next;
        System.out.println(" " + head.next.next.next.next.next.data + "   " + head.next.next.data);
        list.detectAndRemoveLoop(head);
        System.out.println("Linked List after removing loop : ");
        list.printList(head);
    }

    // Function that detects loop in the list
//    Check here https://www.geeksforgeeks.org/detect-and-remove-loop-in-a-linked-list/
    int detectAndRemoveLoop(Node head) {
        Node slow = head   , fast = head;
        while (slow != null && fast != null && fast.next != null) {
            System.out.println(" slow " + slow.data + " fast :: " + fast.data);
            slow = slow.next;
            fast = fast.next.next;


            // If slow and fast meet at same point then loop is present
            /*if (slow == fast) {
                removeLoop(slow, node);
                return 1;
            }*/

            /* If loop exists */
            if (slow == fast) {
                System.out.println(" Loop found ..... " + fast.data );
                slow = head;
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }

                /* since fast->next is the looping point */
                fast.next = null; /* remove loop */
                return 1;
            }
        }
        return 0;
    }


    // Function to print the linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

}
