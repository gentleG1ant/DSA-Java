// Brute Approach
/*
class MidNode
{
    int data;
    MidNode next;

    MidNode(int data)
    {
        this.data = data;
        next = null;
    }

    MidNode(int data, MidNode next)
    {
        this.data = data;
        this.next = next;
    }
}

class deleteUtilities
{
    // Creates a singly linked list from the given array.
    MidNode insert(int arr[])
    {
        MidNode head = new MidNode(arr[0]);
        MidNode temp = head;

        for(int i = 1; i < arr.length; i++)
        {
            temp.next = new MidNode(arr[i]);
            temp = temp.next;
        }

        return head;
    }

    // Finds and deletes the middle node using traversal count.
    // For an even-length list, the second middle node is deleted.
    int findMid(MidNode head)
    {
        int counter = 0;
        int midcount = 0;

        MidNode temp = head;

        // Count the total number of nodes.
        while(temp != null)
        {
            counter++;
            temp = temp.next;
        }

        temp = head;
        MidNode prev = head;

        // Traverse until the middle node is reached.
        while(temp != null)
        {
            midcount++;

            // Deletes the middle node.
            if(midcount == ((counter / 2) + 1))
            {
                prev.next = temp.next;
                return 1;
            }
            else
            {
                prev = temp;
                temp = temp.next;
            }
        }

        return 0;
    }

    // Displays all elements of the linked list.
    void display(MidNode head)
    {
        MidNode temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class DeleteMiddleNode
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5};

        deleteUtilities du = new deleteUtilities();

        MidNode head = du.insert(arr);

        System.out.println("Original linked list:");
        du.display(head);

        int res = du.findMid(head);

        if(res == 1)
        {
            System.out.println("Linked list after deleting the middle node:");
            du.display(head);
        }
        else
        {
            System.out.println("Enter more than one node");
        }
    }
}
*/


// Optimal Approach

class MidNode
{
    int data;
    MidNode next;

    MidNode(int data)
    {
        this.data = data;
        next = null;
    }

    MidNode(int data, MidNode next)
    {
        this.data = data;
        this.next = next;
    }
}

class deleteUtilities
{
    // Creates a singly linked list from the given array.
    MidNode insert(int arr[])
    {
        MidNode head = new MidNode(arr[0]);
        MidNode temp = head;

        for(int i = 1; i < arr.length; i++)
        {
            temp.next = new MidNode(arr[i]);
            temp = temp.next;
        }

        return head;
    }

    // Deletes the middle node using the slow and fast pointer technique.
    // For an even-length list, the second middle node is deleted.
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    MidNode findMid(MidNode head)
    {
        // A list with zero or one node has no deletable middle node.
        if(head == null || head.next == null)
            return null;

        MidNode slow = head;

        // Starts fast from the third node so that slow stops
        // at the node immediately before the middle node.
        MidNode fast = head.next.next;

        while(fast != null && fast.next != null)
        {
            // Move slow one step.
            slow = slow.next;

            // Move fast two steps.
            fast = fast.next.next;
        }

        // Bypass the middle node.
        slow.next = slow.next.next;

        return head;
    }

    // Displays all elements of the linked list.
    void display(MidNode head)
    {
        MidNode temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class DeleteMiddleNode
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5};

        deleteUtilities du = new deleteUtilities();

        MidNode head = du.insert(arr);

        System.out.println("Original linked list:");
        du.display(head);

        du.findMid(head);

        System.out.println("Linked list after deleting the middle node:");
        du.display(head);
    }
}