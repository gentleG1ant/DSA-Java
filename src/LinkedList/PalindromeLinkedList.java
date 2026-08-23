package LinkedList;

/*
 * Program: Check if a Singly Linked List is a Palindrome
 *
 * Description:
 * This program checks whether the elements of a singly linked list
 * form the same sequence when read from both directions.
 *
 * Example:
 *
 *     1 → 5 → 2 → 5 → 1
 *
 * The above linked list is a palindrome because its elements are
 * identical when read from left to right and right to left.
 *
 * Two approaches are included:
 *
 * 1. Brute-Force Approach:
 *    Uses a Stack to store the linked list elements and then compares
 *    them with the original list while traversing it again.
 *
 *    Time Complexity: O(n)
 *    Space Complexity: O(n)
 *
 * 2. Optimal Approach:
 *    Finds the middle of the linked list, reverses the second half,
 *    and compares both halves using pointer traversal.
 *
 *    Time Complexity: O(n)
 *    Space Complexity: O(1)
 *
 * The brute-force approach is currently active, while the optimal
 * approach is retained below as a commented reference.
 */


// ============================================================
// Brute-Force Approach
// ============================================================

import java.util.Stack;

class PaliLL
{
    int data;
    PaliLL next; // Reference to the next node.

    // Creates an isolated node.
    PaliLL(int data)
    {
        this.data = data;
        next = null;
    }

    // Creates a node with data and a next-node reference.
    PaliLL(int data, PaliLL next)
    {
        this.data = data;
        this.next = next;
    }
}

class PaliSol
{
    // Stack stores the elements in reverse order.
    Stack<Integer> st = new Stack<>();

    // Creates a singly linked list from the given array.
    PaliLL insert(int arr[])
    {
        // Insert the first element as the head.
        PaliLL head = new PaliLL(arr[0]);

        // temp keeps track of the current last node.
        PaliLL temp = head;

        for(int i = 1; i < arr.length; i++)
        {
            // Create a new node and connect it to the current node.
            temp.next = new PaliLL(arr[i]);

            // Move temp to the newly created node.
            temp = temp.next;
        }

        return head;
    }

    /*
     * Checks whether the linked list is a palindrome
     * using a Stack.
     */
    boolean travCheckRev(PaliLL head)
    {
        PaliLL temp = head;

        /*
         * First traversal:
         * Store every node's data in the Stack.
         *
         * Stack follows LIFO (Last In, First Out),
         * so the last element will be retrieved first.
         */
        while(temp != null)
        {
            st.push(temp.data);
            temp = temp.next;
        }

        // Reset temp to the head for the second traversal.
        temp = head;

        /*
         * Second traversal:
         * Compare each node's data with the value popped
         * from the Stack.
         */
        while(temp != null)
        {
            if(st.pop() != temp.data)
            {
                return false;
            }
            else
            {
                temp = temp.next;
            }
        }

        return true;
    }
}

public class PalindromeLinkedList
{
    public static void main(String[] args)
    {
        int[] arr = {1, 5, 2, 5, 1};

        PaliSol ps = new PaliSol();

        // Create the linked list from the array.
        PaliLL head = ps.insert(arr);

        // Check whether the linked list is a palindrome.
        if(ps.travCheckRev(head))
        {
            System.out.println("It is a Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}


// ============================================================
// Optimal Approach
// ============================================================

/*
class PaliLL
{
    int data;
    PaliLL next;

    PaliLL(int data)
    {
        this.data = data;
        next = null;
    }

    PaliLL(int data, PaliLL next)
    {
        this.data = data;
        this.next = next;
    }
}

class PaliSol
{
    PaliLL insert(int arr[])
    {
        PaliLL head = new PaliLL(arr[0]);
        PaliLL temp = head;

        for(int i = 1; i < arr.length; i++)
        {
            temp.next = new PaliLL(arr[i]);
            temp = temp.next;
        }

        return head;
    }

    boolean midRev(PaliLL head)
    {
        PaliLL mid = null;
        PaliLL slow = head;
        PaliLL fast = head;
        PaliLL current = null;
        PaliLL prev = null;
        PaliLL front = null;

        // Find the middle using slow and fast pointers.
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            mid = slow;
            fast = fast.next.next;
        }

        // Start reversing from the middle.
        current = mid;

        while(current != null)
        {
            front = current.next;
            current.next = prev;
            prev = current;
            current = front;
        }

        // prev points to the head of the reversed second half.
        fast = prev;
        slow = head;

        // Compare the first half with the reversed second half.
        while(slow != null && fast != null)
        {
            if(slow.data != fast.data)
                return false;

            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }
}

public class PalindromeLinkedList
{
    public static void main(String[] args)
    {
        int[] arr = {1, 5, 2, 5, 1};

        PaliSol ps = new PaliSol();
        PaliLL head = ps.insert(arr);

        if(ps.midRev(head))
            System.out.println("It is a Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
*/