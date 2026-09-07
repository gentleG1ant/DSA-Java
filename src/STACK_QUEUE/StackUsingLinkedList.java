import java.util.*;

class stackList
{
    int size = 0;
    stackList prev;
    stackList Top = null;
    int data;

    stackList()
    {
    }

    stackList(int data)
    {
        this.data = data;
        prev = null;
    }

    /*
        Push Operation:

        A new node is created with the given data.
        The new node points to the current Top.
        Then Top is updated to the new node.
        Finally, size is increased by 1.
    */

    void push(int data)
    {
        stackList temp = new stackList(data);

        temp.prev = Top;
        Top = temp;
        size++;
    }

    /*
        Pop Operation:

        If the stack is empty, return -1.
        Otherwise, store the data of the Top node.
        Move Top to the previous node.
        Decrease the size by 1.
        Finally, return the removed value.
    */

    int pop()
    {
        if(Top == null)
            return -1;

        int value = Top.data;

        Top = Top.prev;
        size--;

        return value;
    }

    /*
        Peek Operation:

        If the stack is empty, return -1.
        Otherwise, return the data stored
        in the Top node without removing it.
    */

    int peek()
    {
        if(Top == null)
            return -1;

        return Top.data;
    }

    /*
        is_Empty Operation:

        The stack is empty when its size becomes 0.
    */

    boolean is_Empty()
    {
        return size == 0;
    }
}


public class StackUsingLinkedList
{
    public static void main(String[] args)
    {
        stackList st = new stackList();

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
            {
                st.push(inputs[i][0]);
            }
            else if(commands[i].equals("peek"))
            {
                System.out.println(st.peek());
            }
            else if(commands[i].equals("pop"))
            {
                System.out.println(st.pop());
            }
            else if(commands[i].equals("is_Empty"))
            {
                System.out.println(st.is_Empty());
            }
        }
    }
}