/*
import java.util.*;

// Brute Approach

class DelNode
{
    int data;
    DelNode next;

    DelNode(int data)
    {
        this.data = data;
        next = null;
    }

    DelNode(int data, DelNode next)
    {
        this.data = data;
        this.next = next;
    }
}

class deleteNthNode
{
    // Creates a singly linked list from the given array.
    DelNode insert(int arr[])
    {
        DelNode head = new DelNode(arr[0]);
        DelNode temp = head;

        for(int i = 1; i < arr.length; i++)
        {
            temp.next = new DelNode(arr[i]);
            temp = temp.next;
        }

        return head;
    }

    // Deletes the Nth node from the end using two traversals.
    // First traversal calculates the length.
    // Second traversal reaches the node before the target.
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    DelNode findNthNode(DelNode head, int n)
    {
        int counter = 0;
        int res = 0;
        int Delcount = 0;

        DelNode temp = head;

        // Count the total number of nodes.
        while(temp != null)
        {
            counter++;
            temp = temp.next;
        }

        // Calculate the position of the target node from the beginning.
        res = counter - n;

        temp = head;

        // If the first node has to be deleted.
        if(res == 0)
            return head.next;

        // Reach the node immediately before the target node.
        while(temp != null)
        {
            Delcount++;

            if(Delcount == res)
                break;

            temp = temp.next;
        }

        // Bypass the target node.
        temp.next = temp.next.next;

        return head;
    }

    // Displays the linked list.
    void display(DelNode head)
    {
        DelNode temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class DeleteNthNodeEnd
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5};

        deleteNthNode du = new deleteNthNode();

        DelNode head = du.insert(arr);

        du.display(head);

        int n = 3;

        head = du.findNthNode(head, n);

        du.display(head);
    }
}
*/


// Optimal Approach

class DelNode
{
    int data;
    DelNode next;

    DelNode(int data)
    {
        this.data = data;
        next = null;
    }

    DelNode(int data, DelNode next)
    {
        this.data = data;
        this.next = next;
    }
}

class deleteNthNode
{
    // Creates a singly linked list from the given array.
    DelNode insert(int arr[])
    {
        DelNode head = new DelNode(arr[0]);
        DelNode temp = head;

        for(int i = 1; i < arr.length; i++)
        {
            temp.next = new DelNode(arr[i]);
            temp = temp.next;
        }

        return head;
    }

    // Deletes the Nth node from the end using slow and fast pointers.
    // Fast pointer maintains a gap of N nodes from slow pointer.
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    DelNode findNthNode(DelNode head, int n)
    {
        DelNode slow = head;
        DelNode fast = head;

        // Move fast N positions ahead.
        for(int i = 1; i <= n; i++)
        {
            fast = fast.next;
        }

        // If fast reaches null, the head itself is the Nth node.
        if(fast == null)
            return head.next;

        // Move both pointers until fast reaches the last node.
        // Slow stops at the node immediately before the target.
        while(fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        // Bypass the Nth node from the end.
        slow.next = slow.next.next;

        return head;
    }

    // Displays the linked list.
    void display(DelNode head)
    {
        DelNode temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class DeleteNthNodeEnd
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5};

        deleteNthNode du = new deleteNthNode();

        DelNode head = du.insert(arr);

        System.out.println("Original linked list:");
        du.display(head);

        int n = 3;

        head = du.findNthNode(head, n);

        System.out.println("After deleting " + n + "rd node from the end:");
        du.display(head);
    }
}