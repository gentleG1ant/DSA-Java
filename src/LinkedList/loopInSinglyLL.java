//brute approach
/*class loopLL
{
    int data;
    loopLL next;
    loopLL(int data)
    {
        this.data=data;
        next=null;
    }
    loopLL(int data,loopLL next)
    {
        this.data=data;
        this.next=next;
    }
}
class Loop
{
    boolean findLoop(loopLL head)
    {
        HashMap<loopLL,Integer> pnde=new HashMap<>();
        loopLL temp=head;
        while(temp!=null)
        {
            if(pnde.containsKey(temp))
                return true;
            pnde.put(temp,1);
            temp=temp.next;
        }
        return false;
    }

}
public class loopInSinglyLL {

    public static void main()
    {
        Loop lo=new Loop();
        int arr[]={1,2,3,4,5,6,7,8,9};
        loopLL head=new loopLL(arr[0]);
        loopLL temp=head;
        for(int i=1;i<arr.length;i++)
        {
            temp.next=new loopLL(arr[i]);//new node creation and elemnt insertion
            temp=temp.next;
        }
        System.out.println(lo.findLoop(head));
    }
}*/
//Optimal Approach
class Loop
{
    int data;
    loopheadLL next;

    Loop(int data)
    {
        this.data=data;
        next=null;
    }
    Loop(int data, loopheadLL next)
    {
        this.data=data;
        this.next=next;
    }
}
class SolutionLoop
{
    boolean findLoop(loopheadLL head)
    {
        loopheadLL fast=head;
        loopheadLL slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;//taking two steps at a time

            if(slow==fast)
                return true;
        }
        return false;
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
     temp.next=head;//loop creation
     return head;
    }
}
public class  loopInSinglyLL
{
    public static void main(String[]  args)
    {
        int[] arr={1,2,3,4,5,6,7};
        SolutionLoop sl=new SolutionLoop();
       loopheadLL head= sl.insertion(arr);
      boolean res= sl.findLoop(head);
      if(res==true)
          System.out.println("Loop is present");
      else
          System.out.println("No loop found");
    }
}

