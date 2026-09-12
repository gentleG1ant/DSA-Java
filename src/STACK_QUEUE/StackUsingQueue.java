import java.util.*;
import java.util.Queue;

class StackQueue
{
    Queue<Integer> q = new LinkedList<>();

    void push(int x)
    {
        // Get the current size of the queue.
        int s = q.size();

        // Add the new element to the queue.
        q.add(x);

        // Move all previous elements behind the new element.
        // This makes the latest inserted element come to the front.
        for(int i = 0; i < s; i++)
        {
            q.add(q.poll());
        }
    }

    int pop()
    {
        // If queue is empty, there is nothing to pop.
        if(q.isEmpty())
            return -1;

        // The front element represents the top of the stack.
        int n = q.peek();

        // Remove the front element.
        q.poll();

        // Return the popped element.
        return n;
    }

    int top()
    {
        // If queue is empty, return -1.
        if(q.isEmpty())
            return -1;

        // Front element represents the top of the stack.
        return q.peek();
    }

    public boolean is_empty()
    {
        // Returns true if the queue is empty.
        return q.isEmpty();
    }
}

public class StackUsingQueue
{
    public static void main(String[] args)
    {
        // Object creation of stack.
        StackQueue qs = new StackQueue();

        // Commands used for testing the stack.
        String[] commands = {
                "push",
                "push",
                "pop",
                "isEmpty",
                "top"
        };

        // Inputs should be aligned according to the commands.
        int[][] inputs = {
                {12},
                {32},
                {},
                {},
                {}
        };

        for(int i = 0; i < commands.length; i++)
        {
            switch(commands[i])
            {
                case "push":
                    qs.push(inputs[i][0]);
                    System.out.println("Element is pushed");
                    break;

                case "pop":
                    System.out.println(qs.pop());
                    break;

                case "top":
                    System.out.println(qs.top());
                    break;

                case "isEmpty":
                    System.out.println("Stack is empty: " + qs.is_empty());
                    break;
            }
        }
    }
}