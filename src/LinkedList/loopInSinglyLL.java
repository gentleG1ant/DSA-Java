import java.util.HashMap;

/*
 * Program: Detect a Loop in a Singly Linked List
 *
 * Description:
 * This program checks whether a singly linked list contains a loop.
 *
 * Approaches:
 *
 * 1. Brute-Force Approach
 *    Uses a HashMap to store previously visited nodes.
 *    Time Complexity: O(n)
 *    Space Complexity: O(n)
 *
 * 2. Optimal Approach
 *    Uses Floyd's Cycle Detection algorithm with slow and fast pointers.
 *    Time Complexity: O(n)
 *    Space Complexity: O(1)
 */


// Brute-Force Approach

/*
class loopLL
{
    int data;
    loopLL next;

    loopLL(int data)
    {
        this.data = data;
        next = null;
    }

    loopLL(int data, loopLL next)
    {
        this.data = data;
        this.next = next;
    }
}

class Loop
{
    boolean findLoop(loopLL head)
    {
        // Stores previously visited nodes.
        HashMap<loopLL, Integer> pnde = new HashMap<>();

        loopLL temp = head;

        while(temp != null)
        {
            // A previously visited node indicates a loop.
            if(pnde.containsKey(temp))
                return true;

            pnde.put(temp, 1);
            temp = temp.next;
        }

        return false;
    }
}

public class loopInSinglyLL
{
    public static void main(String[] args)
    {
        Loop lo = new Loop();

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        loopLL head = new loopLL(arr[0]);
        loopLL temp = head;

        for(int i = 1; i < arr.length; i++)
        {
            temp.next = new loopLL(arr[i]);
            temp = temp.next;
        }

        // Connects the last node to the head to create a loop.
        temp.next = head;

        System.out.println(lo.findLoop(head));
    }
}
*/


// Optimal Approach

class loopLL
{
    int data;
    loopLL next;

    loopLL(int data)
    {
        this.data = data;
        next = null;
    }

    loopLL(int data, loopLL next)
    {
        this.data = data;
        this.next = next;
    }
}

class SolutionLoop
{
    // Detects a loop using Floyd's Cycle Detection algorithm.
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    boolean findLoop(loopLL head)
    {
        loopLL fast = head;
        loopLL slow = head;

        // Slow moves one step and fast moves two steps.
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            // If both pointers meet, a loop exists.
            if(slow == fast)
                return true;
        }

        // No loop is present.
        return false;
    }

    // Creates a linked list from the given array.
    loopLL insertion(int[] arr)
    {
        loopLL head = new loopLL(arr[0]);
        loopLL temp = head;

        // Insert the remaining elements as nodes.
        for(int i = 1; i < arr.length; i++)
        {
            temp.next = new loopLL(arr[i]);
            temp = temp.next;
        }

        // Connects the last node to the head to create a loop.
        temp.next = head;

        return head;
    }
}

public class loopInSinglyLL
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        SolutionLoop sl = new SolutionLoop();

        loopLL head = sl.insertion(arr);
        boolean res = sl.findLoop(head);

        if(res)
            System.out.println("Loop is present");
        else
            System.out.println("No loop found");
    }
}