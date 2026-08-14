/*
 * Program: Linked List Introduction
 *
 * A linked list is a linear data structure where each node contains
 * data and a reference to the next node.
 *
 * This program demonstrates how to create a basic node and initialize
 * the head of a linked list.
 *
 * Example:
 * Array: {1, 2, 0, 4, 6}
 * Head data: 1
 *
 * Approach:
 * 1. Create a Node class with data and next reference.
 * 2. Use constructors to initialize the node.
 * 3. Create the first node using the first array element.
 * 4. Store its reference in head.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 *
 * Author: Raj Aryan
 */

class NodeIns {

    int data;
    NodeIns next;

    // Constructor for initializing data and the next node reference.
    NodeIns(int data, NodeIns next) {
        this.data = data;
        this.next = next;
    }

    // Constructor for initializing only data.
    NodeIns(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListIntro {

    public static void main(String[] args) {

        int arr[] = {1, 2, 0, 4, 6};

        // Create the first node and store its reference in head.
        NodeIns head = new NodeIns(arr[0]);

        // Prints the reference of the head node.
        System.out.println("Address of the head " + head);

        // Prints the data stored in the head node.
        System.out.println("Data in the head " + head.data);
    }
}