//brute approach
/*class loopheadLL
{
    int data;
    loopheadLL next;
    loopheadLL(int data)
    {
        this.data=data;
        next=null;
    }
    loopheadLL(int data, loopheadLL next)
    {
        this.data=data;
        this.next=next;
    }
}
class LoopHead
{
    loopheadLL findLoop(loopheadLL head)
    {
        HashMap<loopheadLL,Integer> pnde=new HashMap<>();
        loopheadLL temp=head;
        while(temp!=null)
        {
            if(pnde.containsKey(temp))
                return temp;
            pnde.put(temp,1);
            temp=temp.next;
        }
        return null;
    }

}
public class loopHeadInSinglyLL {

    public static void main()
    {
        LoopHead lo=new LoopHead();
        int arr[]={1,2,3,4,5,6,7,8,9};
        loopheadLL head=new loopheadLL(arr[0]);
        loopheadLL temp=head;
        for(int i=1;i<arr.length;i++)
        {
            temp.next=new loopheadLL(arr[i]);//new node creation and elemnt insertion
            temp=temp.next;
        }
        //loop creation
        temp.next=head.next.next;
        if(lo.findLoop(head)==null)
            System.out.println ("No loop found");
        else
            System.out.println("Loop head "+lo.findLoop(head).data);
    }
}
 */
//Optimal Approach
class loopheadLL
{
    int data;
    loopheadLL next;

    loopheadLL(int data)
    {
        this.data=data;
        next=null;
    }
    loopheadLL(int data, loopheadLL next)
    {
        this.data=data;
        this.next=next;
    }
}
class SolutionLoopHead
{
    loopheadLL findLoop(loopheadLL head)
    {
        loopheadLL fast=head;
        loopheadLL slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;//taking two steps at a time

            if(slow==fast)//to find the starting point of the loop
            {
                slow=head;
                while(slow!=fast)
                {
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    loopheadLL insertion(int[] arr)
    {
        loopheadLL head=new loopheadLL(arr[0]);
        loopheadLL temp=head;
        for(int i=1;i<arr.length;i++)
        {
            temp.next=new loopheadLL(arr[i]);
            temp=temp.next;
        }
        temp.next=head.next.next;//loop creation
        return head;
    }
}
public class  loopHeadInSinglyLL
{
    public static void main(String[]  args)
    {
        int[] arr={1,2,3,4,5,6,7};
        SolutionLoopHead sl=new SolutionLoopHead();
        loopheadLL head= sl.insertion(arr);
        loopheadLL res= sl.findLoop(head);
        if(res!=null)
            System.out.println("Loop starts at "+res.data);
        else
            System.out.println("No loop found");
    }
}



