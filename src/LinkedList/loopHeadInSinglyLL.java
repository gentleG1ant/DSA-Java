import java.util.HashMap;

/*
 * Program: Find the Starting Node of a Loop in a Singly Linked List
 *
 * Description:
 * This program detects a loop in a singly linked list and finds
 * the node where the loop begins.
 *
 * Two approaches are included:
 *
 * 1. Brute-Force Approach
 *    Uses a HashMap to store previously visited nodes.
 *
 *    Time Complexity: O(n)
 *    Space Complexity: O(n)
 *
 * 2. Optimal Approach
 *    Uses Floyd's Cycle Detection algorithm.
 *
 *    Time Complexity: O(n)
 *    Space Complexity: O(1)
 */


// ============================================================
// Brute-Force Approach
// ============================================================

/*
class loopheadLL
{
    int data;
    loopheadLL next;

    loopheadLL(int data)
    {
        this.data = data;
        next = null;
    }

    loopheadLL(int data, loopheadLL next)
    {
        this.data = data;
        this.next = next;
    }
}

class LoopHead
{
    boolean findLoop(loopheadLL head)
    {
        // Stores previously visited nodes.
        HashMap<loopheadLL, Integer> pnde = new HashMap<>();

        loopheadLL temp = head;

        while(temp != null)
        {
            // If the node was already visited, a loop exists.
            if(pnde.containsKey(temp))
                return true;

            // Store the current node.
            pnde.put(temp, 1);

            temp = temp.next;
        }

        // No loop exists.
        return false;
    }

    loopheadLL findLoopStart(loopheadLL head)
    {
        // Stores previously visited nodes.
        HashMap<loopheadLL, Integer> pnde = new HashMap<>();

        loopheadLL temp = head;

        while(temp != null)
        {
            // The first repeated node is the loop starting node.
            if(pnde.containsKey(temp))
                return temp;

            pnde.put(temp, 1);
            temp = temp.next;
        }

        return null;
    }
}

public class loopHeadInSinglyLL
{
    public static void main(String[] args)
    {
        LoopHead lo = new LoopHead();

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        loopheadLL head = new loopheadLL(arr[0]);
        loopheadLL temp = head;

        // Create the remaining nodes.
        for(int i = 1; i < arr.length; i++)
        {
            temp.next = new loopheadLL(arr[i]);
            temp = temp.next;
        }

        // Connect the last node to the third node to create a loop.
        temp.next = head.next.next;

        loopheadLL result = lo.findLoopStart(head);

        if(result == null)
            System.out.println("No loop found");
        else
            System.out.println("Loop starts at " + result.data);
    }
}
*/


// ============================================================
// Optimal Approach
// ============================================================

class loopheadLL
{
    int data;
    loopheadLL next;

    loopheadLL(int data)
    {
        this.data = data;
        next = null;
    }

    loopheadLL(int data, loopheadLL next)
    {
        this.data = data;
        this.next = next;
    }
}

class SolutionLoopHead
{
    // Finds the starting node of the loop using Floyd's algorithm.
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    loopheadLL findLoop(loopheadLL head)
    {
        loopheadLL fast = head;
        loopheadLL slow = head;

        // Detect whether a loop exists.
        while(fast != null && fast.next != null)
        {
            // Slow moves one step.
            slow = slow.next;

            // Fast moves two steps.
            fast = fast.next.next;

            // Both pointers meet inside the loop.
            if(slow == fast)
            {
                // Move slow back to the head.
                slow = head;

                // Move both pointers one step at a time.
                // They meet at the starting node of the loop.
                while(slow != fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        // No loop exists.
        return null;
    }

    // Creates a linked list and connects the last node
    // to an earlier node to create a loop.
    loopheadLL insertion(int[] arr)
    {
        // Create the first node as the head.
        loopheadLL head = new loopheadLL(arr[0]);

        loopheadLL temp = head;

        // Create the remaining nodes.
        for(int i = 1; i < arr.length; i++)
        {
            temp.next = new loopheadLL(arr[i]);
            temp = temp.next;
        }

        // Connect the last node to the third node.
        temp.next = head.next.next;

        return head;
    }
}

public class loopHeadInSinglyLL
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        SolutionLoopHead sl = new SolutionLoopHead();

        // Create the linked list with a loop.
        loopheadLL head = sl.insertion(arr);

        // Find the starting node of the loop.
        loopheadLL res = sl.findLoop(head);

        if(res != null)
            System.out.println("Loop starts at " + res.data);
        else
            System.out.println("No loop found");
    }
}