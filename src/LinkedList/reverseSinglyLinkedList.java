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
    // Brute approach using Stack
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    singlyLL reverse(singlyLL head)
    {
        singlyLL temp = head;
        Stack<Integer> stk = new Stack<>();

        // Store all node values in the Stack
        while(temp != null)
        {
            stk.push(temp.data);
            temp = temp.next;
        }

        temp = head; // Reset temp to the head

        // Replace the node data with values
        // popped from the Stack in reverse order
        while(temp != null)
        {
            temp.data = stk.pop();
            temp = temp.next;
        }

        return head;
    }

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
    // Optimal approach using pointer reversal
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
            // Save the next node before changing current.next
            front = current.next;

            // Reverse the link of the current node
            current.next = prev;

            // Move prev to the current node
            prev = current;

            // Move current to the next node
            current = front;
        }

        // prev now points to the new head
        return prev;
    }

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