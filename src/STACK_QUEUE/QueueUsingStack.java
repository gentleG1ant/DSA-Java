import java.util.Stack;

/*
    Brute Approach:

    Continuous transfer of elements from st1 to st2
    and back to st1 at the end.

    class StackQueue
    {
        Stack<Integer> st1, st2;

        StackQueue()
        {
            st1 = new Stack<>();
            st2 = new Stack<>();
        }

        void push(int x)
        {
            while(!st1.isEmpty())
                st2.push(st1.pop());

            st1.push(x);

            while(!st2.isEmpty())
                st1.push(st2.pop());
        }

        int pop()
        {
            if(st1.isEmpty())
            {
                System.out.println("Stack is empty");
                return -1;
            }

            return st1.pop();
        }

        int peek()
        {
            if(st1.isEmpty())
            {
                System.out.println("Stack is empty");
                return -1;
            }

            return st1.peek();
        }

        boolean is_Empty()
        {
            return st1.isEmpty();
        }
    }
*/


/*
    Optimal Approach:

    inp stores newly inserted elements.
    out stores elements in queue order.

    Elements are transferred from inp to out
    only when out is empty.
*/

class QueueStack
{
    Stack<Integer> inp, out;

    QueueStack()
    {
        inp = new Stack<>();
        out = new Stack<>();
    }

    void push(int n)
    {
        inp.push(n);
    }

    void pop(Stack<Integer> x, Stack<Integer> y)
    {
        if(x.isEmpty())
            return;

        while(!x.isEmpty())
        {
            y.push(x.pop());
        }
    }

    int pop()
    {
        if(out.isEmpty())
            pop(inp, out);

        if(out.isEmpty())
            return -1;

        return out.pop();
    }

    int peek()
    {
        if(out.isEmpty())
            pop(inp, out);

        if(out.isEmpty())
            return -1;

        return out.peek();
    }

    boolean is_Empty()
    {
        return inp.isEmpty() && out.isEmpty();
    }
}


public class QueueUsingStack
{
    public static void main(String[] args)
    {
        QueueStack sq = new QueueStack();

        String[] commands = {
                "push",
                "push",
                "pop",
                "peek",
                "pop",
                "isEmpty"
        };

        int[][] inputs = {
                {20}, {30}, {}, {}, {}, {}};

        for(int i = 0; i < commands.length; i++)
        {
            if(commands[i].equals("push"))
            {
                sq.push(inputs[i][0]);
                System.out.println("Element pushed");
            }
            else if(commands[i].equals("pop"))
            {
                System.out.println(sq.pop());
            }
            else if(commands[i].equals("peek"))
            {
                System.out.println(sq.peek());
            }
            else if(commands[i].equals("isEmpty"))
            {
                System.out.println(sq.is_Empty());
            }
        }
    }
}