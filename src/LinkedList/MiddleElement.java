package LinkedList;

/*
 * Program: Find Middle Element of a Doubly Linked List
 *
 * Description:
 * This program finds the middle element of a linked list.
 *
 * Two approaches are demonstrated:
 *
 * 1. Brute-Force Approach:
 *    - Traverse the complete linked list to find its length.
 *    - Calculate the middle position.
 *    - Traverse again until the middle position is reached.
 *
 *    Time Complexity: O(n)
 *    Space Complexity: O(1)
 *
 * 2. Optimal Approach:
 *    - Uses the Slow and Fast Pointer technique.
 *    - Slow moves one step at a time.
 *    - Fast moves two steps at a time.
 *    - When Fast reaches the end, Slow points to the middle.
 *
 *    Time Complexity: O(n)
 *    Space Complexity: O(1)
 *
 * For an even-sized list, this implementation returns the
 * second middle element.
 */


// ============================================================
// Brute-Force Approach
// ============================================================

/*
class middleLL
{
    int data;
    middleLL next;
    middleLL prev;

    middleLL(int data)
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    middleLL(int data, middleLL prev, middleLL next)
    {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

class FindMiddle
{
    // Creates a doubly linked list from the given array.
    middleLL insertion(int arr[])
    {
        // Insert the first element as the head.
        middleLL head = new middleLL(arr[0]);

        // prev keeps track of the previous node.
        middleLL prev = head;

        for(int i = 1; i < arr.length; i++)
        {
            // Create a new node whose previous node is prev.
            middleLL temp = new middleLL(arr[i], prev, null);

            // Connect the previous node to the new node.
            prev.next = temp;

            // Move prev to the newly created node.
            prev = temp;
        }

        return head;
    }

    // Finds the middle element using the length of the list.
    void FindmiddleElement(middleLL head)
    {
        middleLL temp = head;
        int c = 0;

        // First traversal to calculate the length.
        while(temp != null)
        {
            temp = temp.next;
            c++;
        }

        // Selects the second middle element for even-sized lists.
        int mid = (c / 2) + 1;

        /*
         * Example:
         *
         * For 5 nodes:
         * (5 / 2) + 1 = 3
         *
         * For 6 nodes:
         * (6 / 2) + 1 = 4
         *
         * Therefore, the second middle is selected for
         * an even-sized list.
         *

temp = head;

// Traverse until the middle position is reached.
        while(temp != null)
        {
mid = mid - 1;

        if(mid == 0)
        {
        break;
        }

temp = temp.next;
        }

                System.out.println("This is the middle value " + temp.data);
    }
            }

class MiddleElement
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        FindMiddle fm = new FindMiddle();

        middleLL head = fm.insertion(arr);

        fm.FindmiddleElement(head);
    }
}
*/


// ============================================================
// Optimal Approach
// ============================================================

class middleLL
{
    int data;
    middleLL prev;
    middleLL next;

    middleLL(int data)
    {
        this.data = data;
        next = null;
        prev = null;
    }

    middleLL(int data, middleLL prev, middleLL next)
    {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

class FindMiddle
{
    // Creates a doubly linked list from the given array.
    middleLL insertion(int arr[])
    {
        middleLL prev;

        // Insert the first element as the head.
        middleLL head = new middleLL(arr[0]);

        // prev initially points to the head.
        prev = head;

        // Start from index 1 because arr[0] is already inserted.
        for(int i = 1; i < arr.length; i++)
        {
            // Create a new node with prev pointing to the previous node.
            middleLL temp = new middleLL(arr[i], prev, null);

            // Connect the previous node to the new node.
            prev.next = temp;

            // Move prev to the newly created node.
            prev = temp;
        }

        return head;
    }

    /*
     * Finds the middle element using the
     * Slow and Fast Pointer technique.
     *
     * Slow moves one step.
     * Fast moves two steps.
     *
     * When Fast reaches the end, Slow is at the middle.
     */
    void FindmiddleElement(middleLL head)
    {
        middleLL slow = head;
        middleLL fast = head;

        while(fast != null && fast.next != null && slow != null)
        {
            // Fast moves two nodes at a time.
            fast = fast.next.next;

            // Slow moves one node at a time.
            slow = slow.next;
        }

        System.out.println("Middle element " + slow.data);
    }
}

class MiddleElement
{
    public static void main(String[] args)
    {
        FindMiddle fm = new FindMiddle();

        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        middleLL head = fm.insertion(arr);

        fm.FindmiddleElement(head);
    }
}