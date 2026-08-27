

/*
 * Program: Reverse a Singly Linked List
 *
 * Description:
 * This program demonstrates two approaches for reversing a singly
 * linked list.
 *
 * 1. Brute-Force Approach:
 *    Uses a Stack to store the data values of all nodes and then
 *    replaces the node values in reverse order.
 *
 *    Time Complexity: O(n)
 *    Space Complexity: O(n)
 *
 * 2. Optimal Approach:
 *    Reverses the links between nodes using three references:
 *    prev, current, and front.
 *
 *    Time Complexity: O(n)
 *    Space Complexity: O(1)
 *
 * The brute-force implementation is retained as a commented
 * reference, while the optimal approach is currently active.
 */

// Brute Approach
/*
import java.util.*;

class singlyLL
{
    int data;
    singlyLL next;

    singlyLL(int data)
    {
        this.data = data;
        next = null;
    }
}

class reverseLL
{
    // Brute approach using Stack.
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    singlyLL reverse(singlyLL head)
    {
        singlyLL temp = head;
        Stack<Integer> stk = new Stack<>();

        // Store all node values in the Stack.
        while(temp != null)
        {
            stk.push(temp.data);
            temp = temp.next;
        }

        // Reset temp to the head.
        temp = head;

        // Replace node data with values popped
        // from the Stack in reverse order.
        while(temp != null)
        {
            temp.data = stk.pop();
            temp = temp.next;
        }

        return head;
    }

    // Creates a singly linked list from the given array.
    singlyLL insert(int arr[])
    {
        singlyLL head = new singlyLL(arr[0]);
        singlyLL current = head;

        for(int i = 1; i < arr.length; i++)
        {
            current.next = new singlyLL(arr[i]);
            current = current.next;
        }

        return head;
    }

    // Prints all elements of the linked list.
    void print(singlyLL head)
    {
        singlyLL temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

class reverseSinglyLinkedList
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

        reverseLL rLL = new reverseLL();
        singlyLL head = rLL.insert(arr);

        System.out.println("Linked list initially");
        rLL.print(head);

        head = rLL.reverse(head);

        System.out.println("Linked list after reversal");
        rLL.print(head);
    }
}
*/


// Optimal Approach

class singlyLL
{
    int data;
    singlyLL next;

    singlyLL(int data)
    {
        this.data = data;
        next = null;
    }
}

class reverseLL
{
    // Reverses the linked list using pointer manipulation.
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    singlyLL reverse(singlyLL head)
    {
        singlyLL front;
        singlyLL prev = null;
        singlyLL current;

        current = head;

        while(current != null)
        {
            // Save the next node before changing current.next.
            front = current.next;

            // Reverse the link of the current node.
            current.next = prev;

            // Move prev to the current node.
            prev = current;

            // Move current to the next node.
            current = front;
        }

        // prev points to the new head of the reversed list.
        return prev;
    }

    // Creates a singly linked list from the given array.
    singlyLL insert(int arr[])
    {
        singlyLL head = new singlyLL(arr[0]);
        singlyLL current = head;

        for(int i = 1; i < arr.length; i++)
        {
            current.next = new singlyLL(arr[i]);
            current = current.next;
        }

        return head;
    }

    // Prints all elements of the linked list.
    void print(singlyLL head)
    {
        singlyLL temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

class reverseSinglyLinkedList
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

        reverseLL rLL = new reverseLL();
        singlyLL head = rLL.insert(arr);

        System.out.println("Linked list initially");
        rLL.print(head);

        head = rLL.reverse(head);

        System.out.println("Linked list after reversal");
        rLL.print(head);
    }
}
