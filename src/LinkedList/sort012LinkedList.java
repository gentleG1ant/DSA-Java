class sortNode
{
    int data;
    sortNode head;
    sortNode next;

    sortNode()
    {
        head = null;
    }

    sortNode(int data)
    {
        this.data = data;
        next = null;
    }

    sortNode(int data, sortNode next)
    {
        this.data = data;
        this.next = next;
    }
}

class NodeCre
{
    sortNode newNode = new sortNode();

    // Inserts a new node at the end of the linked list.
    void insert(int val)
    {
        if(newNode.head == null)
        {
            newNode.head = new sortNode(val);
            return;
        }

        sortNode temp = newNode.head;

        while(temp.next != null)
            temp = temp.next;

        temp.next = new sortNode(val);
    }

    // Prints all elements of the linked list.
    void print()
    {
        sortNode temp = newNode.head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // Sorts a linked list containing only 0, 1 and 2.
    // Uses three separate lists for 0, 1 and 2.
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    void sort012(sortNode ll)
    {
        // Dummy nodes act as anchor points for the
        // three separate linked lists.
        sortNode zero = new sortNode(-1);
        sortNode one = new sortNode(-1);
        sortNode two = new sortNode(-1);

        // Tail pointers keep track of the last node
        // in each individual linked list.
        sortNode zeroTail = zero;
        sortNode oneTail = one;
        sortNode twoTail = two;

        sortNode current = ll.head;

        // Divide the original list into three lists
        // according to the node value.
        while(current != null)
        {
            if(current.data == 0)
            {
                zeroTail.next = current;
                zeroTail = zeroTail.next;
            }
            else if(current.data == 1)
            {
                oneTail.next = current;
                oneTail = oneTail.next;
            }
            else
            {
                twoTail.next = current;
                twoTail = twoTail.next;
            }

            current = current.next;
        }

        // Connect the 0-list with the 1-list.
        // If the 1-list is empty, connect directly to the 2-list.
        zeroTail.next = (one.next != null) ? one.next : two.next;

        // Connect the 1-list with the 2-list.
        oneTail.next = two.next;

        // Mark the end of the final list.
        twoTail.next = null;

        // Update the original head to the first
        // actual node after the zero dummy node.
        ll.head = zero.next;
    }
}

public class sort012LinkedList
{
    public static void main(String[] args)
    {
        sortNode ll = new sortNode();
        NodeCre nce = new NodeCre();

        nce.insert(1);
        nce.insert(2);
        nce.insert(0);
        nce.insert(1);
        nce.insert(2);
        nce.insert(0);

        System.out.println("Original List");
        nce.print();

        nce.sort012(nce.newNode);

        System.out.println("Sorted List");
        nce.print();
    }
}