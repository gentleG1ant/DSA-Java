package LinkedList;
/*
 * Program: Delete Last Node of a Singly Linked List
 *
 * Working:
 * - Traverse to the second-last node.
 * - Set its next pointer to null to remove the last node.
 *
 * Edge Cases:
 * - Empty list
 * - Single-node list
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class NodeDel
{
    int data;
    NodeDel next;

    NodeDel(int data) {
        this.data = data;
        this.next = null;
    }

    NodeDel(int data, NodeDel next) {
        this.data = data;
        this.next = next;
    }
}

class LinkedListOperations {

    // Deletes the last node and returns the updated head.
    public NodeDel deleteLast(NodeDel head) {

        if (head == null || head.next == null) {
            return null;
        }

        NodeDel temp = head;

        // Move to the second-last node.
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }

    // Prints all nodes of the linked list.
    public void printList(NodeDel head) {

        NodeDel temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class linkedListDeletion
{

    public static void main(String[] args)
    {

        LinkedListOperations operations = new LinkedListOperations();

        // Creating: 1 -> 2 -> 3
        NodeDel head = new NodeDel(1);
        head.next = new NodeDel(2);
        head.next.next = new NodeDel(3);

        System.out.println("Original linked list:");
        operations.printList(head);

        head = operations.deleteLast(head);

        System.out.println("After deleting last node:");
        operations.printList(head);
    }
}
