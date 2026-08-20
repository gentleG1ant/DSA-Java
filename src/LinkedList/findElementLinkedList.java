/*
 * Program: Search for an Element in a Singly Linked List
 *
 * Description:
 * This program searches for a given value in a singly linked list.
 * It traverses the list from the head node and compares the data
 * stored in each node with the target value.
 *
 * If the target value is found, the method returns true.
 * If the complete list is traversed without finding the value,
 * the method returns false.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package LinkedList;

class element
{
    int data;
    element next;

    // Constructor to create a node with data.
    element(int data)
    {
        this.data = data;
    }

    // Constructor to create a node with data and next reference.
    element(int data, element next)
    {
        this.data = data;
        this.next = next;
    }
}

class SolutionFind
{
    // Searches for the given value 'n' in the linked list.
    public boolean find(element head, int n)
    {

        // Start traversal from the head node.
        element temp = head;

        while(temp != null)
        {
            // Compare the current node's data with the target value.
            if(temp.data == n)
                return true;

            // Move to the next node.
            temp = temp.next;
        }

        // Target value was not found in the linked list.
        return false;
    }
}

public class findElementLinkedList
{
    public static void main(String[] args)
    {
        SolutionFind sc = new SolutionFind();

        // Value to be searched in the linked list.
        int n = 3;

        // Create the nodes of the linked list.
        element head = new element(1);
        element second = new element(2);
        element third = new element(3);
        element fourth = new element(4);

        // Connect the nodes.
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        // Search for the given element and display the result.
        System.out.println(sc.find(head, n));
    }
}