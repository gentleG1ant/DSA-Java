/*
 * Program: Doubly Linked List - Insertion and Deletion
 *
 * Description:
 * This program demonstrates basic insertion and deletion operations
 * in a doubly linked list.
 *
 * The program:
 * - Creates a doubly linked list containing three nodes.
 * - Inserts a new node at the beginning of the list.
 * - Deletes the last node from the list.
 * - Traverses and displays the elements of the list.
 *
 * Each node contains:
 * - data : Stores the value of the node.
 * - next : Stores the reference to the next node.
 * - prev : Stores the reference to the previous node.
 */

package LinkedList;

import java.util.*;

class DNode
{
    int data;
    DNode next;
    DNode prev;

    DNode(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    DNode(int data, DNode next, DNode prev)
    {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

class SolutionInsertionDeletion
{
    // Inserts a new node at the beginning of the doubly linked list.
    public DNode InsertNewHead(int data, DNode next)
    {
        // Create the new node.
        // Its next reference points to the current head.
        // Its prev reference is null because it will become the first node.
        DNode head = new DNode(data, next, null);

        // Establish the backward connection:
        // The old head's prev must point to the new head.
        if(next != null)
        {
            next.prev = head;
        }

        return head;
    }

    // Deletes the last node of the doubly linked list.
    public DNode deletion(DNode head)
    {
        DNode temp = head;

        // If the list is empty, there is nothing to delete.
        if(head == null)
            return null;

        // If there is only one node, deleting it results in an empty list.
        if(head.next == null)
            return null;

        // Traverse until temp reaches the last node.
        while(temp.next != null)
        {
            temp = temp.next;
        }

        // temp is the last node.
        // temp.prev refers to the second-last node.
        // Remove the last node by setting the second-last node's
        // next reference to null.
        temp.prev.next = null;

        return head;
    }

    // Prints all elements of the linked list.
    public void printing(DNode head)
    {
        DNode temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class DoublyLinkedList
{
    public static void main(String[] args)
    {
        // Create the initial three nodes.
        DNode n1 = new DNode(1);
        DNode n2 = new DNode(2);
        DNode n3 = new DNode(3);

        // Establish the forward and backward connections.
        n1.next = n2;
        n2.prev = n1;

        n2.next = n3;
        n3.prev = n2;

        n3.next = null;

        SolutionInsertionDeletion sI = new SolutionInsertionDeletion();

        System.out.println("Linked List in the initial phase ");
        sI.printing(n1);
        System.out.println("");

        // Insert a new node at the beginning.
        DNode head = sI.InsertNewHead(11, n1);

        System.out.println("Linked List after adding a node");
        sI.printing(head);
        System.out.println("");

        System.out.println("Linked List after deleting a node");

        // Delete the last node.
        sI.deletion(head);

        sI.printing(head);
    }
}