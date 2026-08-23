import java.util.*;
//brute method
/*class loopLength
{
    int data;
    loopLength next;

    loopLength(int data)
    {
       this.data=data;
       next=null;
    }
    loopLength(int data, loopLength next)
    {
        this.data=data;
        this.next=next;
    }
}
class findLength
{
    int length(loopLength head)
    {
        HashMap<loopLength,Integer> visited=new HashMap<>();
        loopLength temp=head;
        int counter=0;
       while(temp!=null)
       {
           counter++;
           if(visited.containsKey(temp))
               return (counter-visited.get(temp));
           else
               visited.put(temp,counter);
           temp=temp.next;

       }
       return 0;
    }
    loopLength insert(int arr[])
    {
        loopLength head=new loopLength(arr[0]);
       loopLength temp=head;
       for(int i=1;i<arr.length;i++)
       {
           temp.next=new loopLength(arr[i]);
           temp=temp.next;
       }
       temp.next=head.next.next.next;

        return head;
    }
}
public class linkedListLoopLength {
    public static void main(String[]  args)
    {
        int arr[]={1,2,3,4,5,6,7};
        findLength fl=new findLength();
        loopLength head=fl.insert(arr);
        int res=fl.length(head);
        if(res==0)
            System.out.println("No loop found");
        else
            System.out.println("Lenghth of the loop found = "+res);

    }
}
*/
//Optimal Approach
class loopLength
{
    int data;
    loopLength next;

    loopLength(int data)
    {
        this.data=data;
        next=null;
    }
    loopLength(int data, loopLength next)
    {
        this.data=data;
        this.next=next;
    }
}
class findLength
{
    int length(loopLength head)
    {
        loopLength fast=head;
        loopLength slow=head;
        int counter=1;
        while(fast!=null&&fast.next!=null)
        {
         slow=slow.next;//takes a single step at one iteration
         fast=fast.next.next;//takes two steps at one iteration
            if(slow==fast) {//if a loop is found
                slow = slow.next;
                while (slow != fast)
                {
                    counter++;
                    slow = slow.next;
                }
                return counter;
            }
        }
        return 0;
    }
    loopLength insert(int arr[])
    {
        loopLength head=new loopLength(arr[0]);
        loopLength temp=head;
        for(int i=1;i<arr.length;i++)
        {
            temp.next=new loopLength(arr[i]);
            temp=temp.next;
        }
        temp.next=head.next.next.next;

        return head;
    }
}
public class linkedListLoopLength {
    public static void main(String[]  args)
    {
        int arr[]={1,2,3,4,5,6,7};
        findLength fl=new findLength();
        loopLength head=fl.insert(arr);
        int res=fl.length(head);
        if(res==0)
            System.out.println("No loop found");
        else
            System.out.println("Lenghth of the loop found = "+res);

    }
}