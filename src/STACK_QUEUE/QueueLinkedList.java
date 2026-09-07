class QueueList
{
    QueueList Top = null;
    QueueList End = null;
    QueueList next;
    int data;

    QueueList()
    {
    }

    QueueList(int data)
    {
        this.data = data;
        next = null;
    }

    void push(int data)
    {
        QueueList temp = new QueueList(data);

        if(Top == null)
        {
            Top = End = temp;
        }
        else
        {
            End.next = temp;
            End = temp;
        }
    }

    int pop()
    {
        if(Top == null)
            return -1;

        int value = Top.data;

        Top = Top.next;

        if(Top == null)
            End = null;

        return value;
    }

    int peek()
    {
        if(Top == null)
            return -1;

        return Top.data;
    }

    boolean is_Empty()
    {
        return Top == null;
    }
}


public class QueueLinkedList
{
    public static void main(String[] args)
    {
        QueueList ql = new QueueList();

        String[] commands = {
                "push",
                "push",
                "peek",
                "pop",
                "peek",
                "is_Empty"
        };

        int[][] inputs = {
                {10},
                {20},
                {},
                {},
                {},
                {}
        };

        for(int i = 0; i < commands.length; i++)
        {
            if(commands[i].equals("push"))
                ql.push(inputs[i][0]);

            else if(commands[i].equals("peek"))
                System.out.println(ql.peek());

            else if(commands[i].equals("pop"))
                System.out.println(ql.pop());

            else if(commands[i].equals("is_Empty"))
                System.out.println(ql.is_Empty());
        }
    }
}