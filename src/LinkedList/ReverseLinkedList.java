package LinkedList;

/*
 * Program: Reverse a Doubly Linked List
 *
 * Description:
 * This program demonstrates two approaches for reversing a doubly
 * linked list.
 *
 * 1. Brute-Force Approach:
 *    Stores all node data values in a Stack and then replaces the
 *    data in reverse order.
 *
 *    Time Complexity: O(n)
 *    Space Complexity: O(n)
 *
 * 2. Optimal Approach:
 *    Reverses the doubly linked list by swapping the next and prev
 *    references of each node.
 *
 *    Time Complexity: O(n)
 *    Space Complexity: O(1)
 *
 * The brute-force implementation is retained as a commented learning
 * reference, while the optimal approach is used by the program.
 */


/*
 * =========================
 * Brute-Force Approach
 * =========================
 *
 * import java.util.*;
 *
 * class DLRNode
 * {
 *     int data;
 *     DLRNode prev;
 *     DLRNode next;
 *
 *     DLRNode(int data)
 *     {
 *         this.data = data;
 *         prev = null;
 *         next = null;
 *     }
 *
 *     DLRNode(int data, DLRNode prev, DLRNode next)
 *     {
 *         this.data = data;
 *         this.prev = prev;
 *         this.next = next;
 *     }
 * }
 *
 * class SolutionFunctions
 * {
 *     // Creates a doubly linked list from an array.
 *     DLRNode Insertion(int[] arr)
 *     {
 *         DLRNode head = new DLRNode(arr[0]);
 *
 *         // prev always refers to the previously created node.
 *         DLRNode prev = head;
 *
 *         for(int i = 1; i < arr.length; i++)
 *         {
 *             // The new node stores the previous node in prev.
 *             DLRNode temp = new DLRNode(arr[i], prev, null);
 *
 *             // Establish the forward connection.
 *             prev.next = temp;
 *
 *             // Move prev to the newly created node.
 *             prev = temp;
 *         }
 *
 *         return head;
 *     }
 *
 *     // Prints the elements of the linked list.
 *     void print(DLRNode head)
 *     {
 *         DLRNode temp = head;
 *
 *         while(temp != null)
 *         {
 *             System.out.print(temp.data + " ");
 *             temp = temp.next;
 *         }
 *     }
 *
 *     // Reverses the node data using a Stack.
 *     DLRNode reverse(DLRNode head)
 *     {
 *         if(head == null || head.next == null)
 *             return head;
 *
 *         Stack<Integer> st = new Stack<>();
 *         DLRNode temp = head;
 *
 *         // Store all node data in the Stack.
 *         while(temp != null)
 *         {
 *             st.push(temp.data);
 *             temp = temp.next;
 *         }
 *
 *         // Reset temp to the head.
 *         temp = head;
 *
 *         // Replace the data with values popped from the Stack.
 *         while(temp != null)
 *         {
 *             temp.data = st.pop();
 *             temp = temp.next;
 *         }
 *
 *         return head;
 *     }
 * }
 *
 * public class ReverseLinkedList
 * {
 *     public static void main(String[] args)
 *     {
 *         int arr[] = {1, 2, 3, 4, 5, 6};
 *
 *         SolutionFunctions obj = new SolutionFunctions();
 *
 *         DLRNode head = obj.Insertion(arr);
 *
 *         System.out.println("Original List");
 *         obj.print(head);
 *         System.out.println("");
 *
 *         head = obj.reverse(head);
 *
 *         System.out.println("Reversed List");
 *         obj.print(head);
 *     }
 * }
 */


/*
 * =========================
 * Optimal Approach
 * =========================
 */

class DLR
{
    int data;
    DLR next;
    DLR prev;

    // Creates an isolated node.
    DLR(int data)
    {
        this.data = data;
        next = null;
        prev = null;
    }

    // Creates a node with next and previous references.
    DLR(int data, DLR next, DLR prev)
    {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

class Reverse
{
    /*
     * Reverses the doubly linked list by swapping the
     * next and prev references of every node.
     */
    DLR ReverseSolution(DLR head)
    {
        // Start traversal from the current head.
        DLR temp = head;

        // Temporarily stores the original next reference.
        DLR revSwap = null;

        while(temp != null)
        {
            // Save the original next node before changing references.
            revSwap = temp.next;

            // Original previous node becomes the new next node.
            temp.next = temp.prev;

            // Original next node becomes the new previous node.
            temp.prev = revSwap;

            // The current node is the latest potential head.
            head = temp;

            // Move forward using the original next reference.
            revSwap = temp;
            temp = temp.prev;
        }

        // The last processed node becomes the new head.
        return head;
    }

    // Prints the elements of the doubly linked list.
    void Printing(DLR head)
    {
        DLR temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // Creates a doubly linked list from an array.
    DLR Insertion(int arr[])
    {
        // Create the first node as the head.
        DLR head = new DLR(arr[0]);

        // prev refers to the most recently created node.
        DLR prev = head;

        for(int i = 1; i < arr.length; i++)
        {
            /*
             * The new node stores:
             *
             * next → null
             * prev → previous node
             */
            DLR temp = new DLR(arr[i], null, prev);

            // Establish the forward connection.
            prev.next = temp;

            // Move prev to the newly created node.
            prev = temp;
        }

        return head;
    }
}

public class ReverseLinkedList
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};

        Reverse rev = new Reverse();

        // Create the doubly linked list.
        DLR head = rev.Insertion(arr);

        System.out.println("Linked list without reversing");
        rev.Printing(head);

        // Reverse the doubly linked list.
        head = rev.ReverseSolution(head);

        System.out.println("Linked list after reversing");
        rev.Printing(head);
    }
}