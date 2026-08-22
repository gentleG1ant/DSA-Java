package LinkedList;

/*
 * Program: Find the Length of a Singly Linked List
 *
 * Description:
 * This program calculates the number of nodes in a singly linked list.
 * It traverses the list from the head node to null and increments a
 * counter for every node visited.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class NodeLength
{
    int data;
    NodeLength next;

    NodeLength(int data)
    {
        this.data = data;
        this.next = null;
    }

    NodeLength(int data, NodeLength next)
    {
        this.data = data;
        this.next = next;
    }
}

class SolutionCount
{
    // Traverses the linked list and counts its nodes.
    public void count(NodeLength head)
    {
        int c = 0;

        // Start traversal from the head node.
        NodeLength temp = head;

        // Continue until the end of the linked list is reached.
        while(temp != null)
        {
            c++;
            temp = temp.next;
        }

        System.out.println("Length of LinkedList: " + c);
    }
}

public class LengthofLinkedList
{
    public static void main(String[] args)
    {
        SolutionCount sc = new SolutionCount();

        // Create the nodes of the linked list.
        NodeLength head = new NodeLength(1);
        NodeLength second = new NodeLength(2);
        NodeLength third = new NodeLength(3);
        NodeLength fourth = new NodeLength(4);

        // Connect the nodes.
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        // Count and display the number of nodes.
        sc.count(head);
    }
}