import java.util.*;

/*
 * Program: Stack Implementation Using Array
 *
 * Description:
 * This program implements a Stack data structure using an array.
 *
 * Operations included:
 *
 * 1. Push    -> Adds an element to the top of the stack.
 * 2. Pop     -> Removes the top element.
 * 3. Peek    -> Displays the top element without removing it.
 * 4. Display -> Displays all elements in the stack.
 * 5. Exit    -> Terminates the program.
 *
 * Time Complexity:
 * Push    -> O(1)
 * Pop     -> O(1)
 * Peek    -> O(1)
 * Display -> O(n)
 *
 * Space Complexity: O(n)
 */


// ============================================================
// Stack Implementation
// ============================================================

class Stack
{
    // Array used to store stack elements.
    int[] arr;

    // Maximum capacity of the stack.
    int capacity;

    // Stores the index of the top element.
    // -1 represents an empty stack.
    int top;


    // Constructor with user-defined stack capacity.
    Stack(int size)
    {
        capacity = size;
        arr = new int[capacity];

        // Initially, the stack is empty.
        top = -1;
    }


    // Default constructor.
    // Creates a stack with capacity 1000.
    Stack()
    {
        this(1000);
    }


    // Checks whether the stack is empty.
    boolean isEmpty()
    {
        return top == -1;
    }


    // Checks whether the stack is full.
    boolean isFull()
    {
        return top == capacity - 1;
    }


    // ========================================================
    // Push Operation
    // ========================================================

    // Adds an element to the top of the stack.
    void push(int data)
    {
        // Check for stack overflow.
        if(isFull())
        {
            System.out.println("Stack Overflow");
            return;
        }

        // Move the top pointer to the next position.
        top++;

        // Insert the new element.
        arr[top] = data;

        System.out.println(data + " pushed into the stack");
    }


    // ========================================================
    // Pop Operation
    // ========================================================

    // Removes and displays the top element of the stack.
    void pop()
    {
        // Check for stack underflow.
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return;
        }

        // Store the top element before removing it.
        int removedElement = arr[top];

        // Decrease the top index to remove the element.
        top--;

        System.out.println(removedElement + " popped from the stack");
    }


    // ========================================================
    // Peek Operation
    // ========================================================

    // Displays the top element without removing it.
    void peek()
    {
        // Check whether the stack is empty.
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Top element: " + arr[top]);
    }


    // ========================================================
    // Display Operation
    // ========================================================

    // Displays all elements currently present in the stack.
    void display()
    {
        // Check whether the stack is empty.
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack elements:");

        // Print elements from bottom to top.
        for(int i = 0; i <= top; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}


// ============================================================
// Main Class
// ============================================================

public class StackArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Create a stack using the default capacity.
        Stack st = new Stack();

        int choice = 0;


        // Continue displaying the menu until the user exits.
        while(choice != 5)
        {
            System.out.println();

            System.out.println("===== STACK MENU =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();


            // Perform the selected operation.
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the element to push: ");

                    int data = sc.nextInt();

                    st.push(data);

                    break;


                case 2:
                    st.pop();

                    break;


                case 3:
                    st.peek();

                    break;


                case 4:
                    st.display();

                    break;


                case 5:
                    System.out.println("Program terminated");

                    break;


                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }


        // Close the Scanner.
        sc.close();
    }
}