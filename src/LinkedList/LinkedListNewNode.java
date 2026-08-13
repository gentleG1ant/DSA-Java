class Node {
    int data;
    Node next;

    // Constructor to initialize data and next reference
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Constructor to create a node with no next node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SolutionInsertion {

    // Inserts a new node at the beginning of the linked list
    public Node insertAtHead(int data, Node head) {
        return new Node(data, head);
    }

    // Traverses and prints the linked list
    public void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class LinkedListNewNode {

    public static void main(String[] args) {

        SolutionInsertion solution = new SolutionInsertion();

        // Create the initial linked list: 1 -> 2 -> null
        Node head = new Node(1);
        head.next = new Node(2);

        System.out.println("Original Linked List:");
        solution.printList(head);

        // Insert 3 at the beginning
        head = solution.insertAtHead(3, head);

        System.out.println("After Inserting 3 at Head:");
        solution.printList(head);
    }
}