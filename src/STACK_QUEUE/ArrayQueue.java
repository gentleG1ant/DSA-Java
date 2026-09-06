import java.util.*;

class Queue
{
    int[] arr;
    int front;
    int rear;
    int maxSize;
    int currentSize;

    Queue(int size)
    {
        arr = new int[size];
        front = -1;
        rear = -1;
        maxSize = size;
        currentSize = 0;
    }

    Queue()
    {
        this(100);
    }

    // Checks whether the queue is full.
    public boolean isFull()
    {
        return rear == maxSize - 1;
    }

    // Checks whether the queue is empty.
    public boolean isEmpty()
    {
        return front == -1;
    }

    // Adds an element at the rear of the queue.
    public void Enqueue(int n)
    {
        if(isFull())
        {
            System.out.println("Queue is overflown");
            return;
        }

        if(front == -1)
            front = 0;

        arr[++rear] = n;
        currentSize++;
    }

    // Removes and returns the front element.
    public int Dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is underflown");
            return -1;
        }

        int popped = arr[front];

        // Reset both pointers when the last element is removed.
        if(currentSize == 1)
        {
            front = -1;
            rear = -1;
        }
        else
        {
            front++;
        }

        currentSize--;
        return popped;
    }

    // Returns the front element without removing it.
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is underflown");
            return -1;
        }

        return arr[front];
    }
}

public class ArrayQueue
{
    public static void main(String[] args)
    {
        Queue que = new Queue();

        String[] commands = {
                "ArrayQueue",
                "push",
                "push",
                "peek",
                "pop",
                "isEmpty"
        };

        int[][] inputs = {
                {},
                {5},
                {10},
                {},
                {},
                {}
        };

        // Executes each queue operation according to the command.
        for(int i = 0; i < commands.length; i++)
        {
            switch(commands[i])
            {
                case "ArrayQueue":
                    System.out.println("ArrayQueue");
                    break;

                case "push":
                    que.Enqueue(inputs[i][0]);
                    System.out.println("pushed");
                    break;

                case "peek":
                    System.out.println(que.peek());
                    break;

                case "pop":
                    System.out.println(que.Dequeue());
                    break;

                case "isEmpty":
                    System.out.println(que.isEmpty());
                    break;
            }
        }
    }
}