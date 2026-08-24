import java.util.*;

/*
 * Program: Find the Length of a Loop in a Singly Linked List
 *
 * Description:
 * This program detects a loop in a singly linked list and calculates
 * the number of nodes present inside the loop.
 *
 * Two approaches are included:
 *
 * 1. Brute-Force Approach:
 *    Uses a HashMap to store previously visited nodes and their
 *    traversal positions. When a node is visited again, the loop
 *    length is calculated using the difference between positions.
 *
 *    Time Complexity: O(n)
 *    Space Complexity: O(n)
 *
 * 2. Optimal Approach:
 *    Uses Floyd's Cycle Detection algorithm with slow and fast
 *    pointers. Once both pointers meet inside the loop, one pointer
 *    traverses the loop until it reaches the same node again.
 *
 *    Time Complexity: O(n)
 *    Space Complexity: O(1)
 */


// ============================================================
// Brute-Force Approach
// ============================================================

/*
class loopLength
{
    int data;
    loopLength next;

    loopLength(int data)
    {
       this.data = data;
       next = null;
    }

    loopLength(int data, loopLength next)
    {
        this.data = data;
        this.next = next;
    }
}

class findLength
{
    int length(loopLength head)
    {
        // Stores each visited node and its traversal position.
        HashMap<loopLength, Integer> visited = new HashMap<>();

        loopLength temp = head;
        int counter = 0;

        while(temp != null)
        {
            counter++;


             //* If the current node has already been visited,
             //* the linked list contains a loop.

            if(visited.containsKey(temp))
        return (counter - visited.get(temp));

        // Store the current node and its position.
        else
        visited.put(temp, counter);

temp = temp.next;
        }

                // No loop is present.
                return 0;
                }

// Creates a linked list and manually creates a loop.
loopLength insert(int arr[])
{
    loopLength head = new loopLength(arr[0]);
    loopLength temp = head;

    for(int i = 1; i < arr.length; i++)
    {
        temp.next = new loopLength(arr[i]);
        temp = temp.next;
    }

    // Connect the last node to an earlier node to create a loop.
    temp.next = head.next.next.next;

    return head;
}
}

public class linkedListLoopLength
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        findLength fl = new findLength();

        loopLength head = fl.insert(arr);

        int res = fl.length(head);

        if(res == 0)
            System.out.println("No loop found");
        else
            System.out.println("Length of the loop found = " + res);
    }
}
*/


// ============================================================
// Optimal Approach
// ============================================================

class loopLength
{
    int data;
    loopLength next;

    loopLength(int data)
    {
        this.data = data;
        next = null;
    }

    loopLength(int data, loopLength next)
    {
        this.data = data;
        this.next = next;
    }
}

class findLength
{
    /*
     * Uses Floyd's Cycle Detection algorithm to detect a loop.
     *
     * Once slow and fast pointers meet, the loop length is
     * calculated by traversing the loop once.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    int length(loopLength head)
    {
        loopLength fast = head;
        loopLength slow = head;

        // Starts from 1 because the meeting node itself is counted.
        int counter = 1;

        /*
         * Slow moves one step while fast moves two steps.
         * If a loop exists, they will eventually meet.
         */
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            // Both pointers meet inside the loop.
            if(slow == fast)
            {
                /*
                 * Move slow one step forward and continue until
                 * it reaches the meeting node again.
                 */
                slow = slow.next;

                while(slow != fast)
                {
                    counter++;
                    slow = slow.next;
                }

                return counter;
            }
        }

        // No loop is present.
        return 0;
    }

    /*
     * Creates a linked list from the given array and connects
     * the last node to an earlier node to create a loop.
     */
    loopLength insert(int arr[])
    {
        loopLength head = new loopLength(arr[0]);
        loopLength temp = head;

        for(int i = 1; i < arr.length; i++)
        {
            temp.next = new loopLength(arr[i]);
            temp = temp.next;
        }

        /*
         * Creates a loop by connecting the last node to
         * the fourth node in the linked list.
         *
         * Example:
         * 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
         *                ^              |
         *                |______________|
         */
        temp.next = head.next.next.next;

        return head;
    }
}

public class linkedListLoopLength
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        findLength fl = new findLength();

        loopLength head = fl.insert(arr);

        int res = fl.length(head);

        if(res == 0)
            System.out.println("No loop found");
        else
            System.out.println("Length of the loop found = " + res);
    }
}