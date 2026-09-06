import java.util.*;

class QueueStack
{
    Queue<Integer> q = new LinkedList<>();

    // Pushes an element and rearranges the queue so the newest element stays at the front.
    void push(int x)
    {
        int size = q.size();

        // Add the new element at the rear.
        q.add(x);

        // Move all previous elements behind the newly inserted element.
        for(int i = 0; i < size; i++)
            q.add(q.poll());
    }

    // Removes and returns the top element of the stack.
    int pop()
    {
        if(q.isEmpty())
            return -1;

        return q.poll();
    }

    // Returns the top element without removing it.
    int top()
    {
        if(q.isEmpty())
            return -1;

        return q.peek();
    }

    // Checks whether the stack is empty.
    boolean is_empty()
    {
        return q.isEmpty();
    }
}

public class StackUsingQueue
{
    public static void main(String[] args)
    {
        QueueStack qs = new QueueStack();

        // Commands used to test stack operations.
        String[] commands = {"push", "push", "pop", "isEmpty", "top"};

        // Inputs are aligned with their respective commands.
        int[][] inputs = {{12}, {32}, {}, {}, {}};

        // Execute each command.
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