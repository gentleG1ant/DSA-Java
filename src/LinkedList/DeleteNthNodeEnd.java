/*import java.util.*;
class DelNode
{
        int data;
        DelNode next;

        DelNode(int data)
        {
            this.data=data;
            next=null;
        }
        DelNode(int data, DelNode next)
        {
            this.data=data;
            this.next=next;
        }
}
class  deleteNthNode
{
    DelNode insert(int arr[])
    {
        DelNode head=new DelNode(arr[0]);//entered the first node
        DelNode temp=head;
        for(int i=1;i<arr.length;i++)
        {
            temp.next= new DelNode(arr[i]);
            temp=temp.next;
        }
        return head;
    }
    DelNode findNthNode(DelNode head, int n)//finds the mid  element and deletes it
    {
        int counter=0;
        int res=0;
        int Delcount=0;
        DelNode temp=head;
        while(temp!=null)//loop to count the length off the linked list
        {
            counter++;
            temp=temp.next;
        }
        res=(counter-n);//the node  to  be deleted
        temp=head;
        if(res==0)
            return head.next;//if the first node is  to be deleted
        while(temp!=null)
        {
            Delcount++;
            if(Delcount==res)//checks for the node to be deleted
            {
              break;//once received  it comes out ofthe  loop
            }
            temp=temp.next;//updates temp to next node always
        }
        temp.next=temp.next.next;//deleted the node in between
        return head;
    }
    void display(DelNode head)
    {
        DelNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

}
public class DeleteNthNodeEnd {
    public  static void main(String[]  args)
    {
        int arr[]={1,2,3,4,5};
        deleteNthNode du=new deleteNthNode();
        DelNode head = du.insert(arr);//insert array elements in the nodes
        du.display(head);
        int n=3;
        head=du.findNthNode(head,n);
        du.display(head);
    }
}
*/
import java.util.*;
class DelNode
{
        int data;
        DelNode next;

        DelNode(int data)
        {
            this.data=data;
            next=null;
        }
        DelNode(int data, DelNode next)
        {
            this.data=data;
            this.next=next;
        }
}
class  deleteNthNode
{
    DelNode insert(int arr[])
    {
        DelNode head=new DelNode(arr[0]);//entered the first node
        DelNode temp=head;
        for(int i=1;i<arr.length;i++)
        {
            temp.next= new DelNode(arr[i]);
            temp=temp.next;
        }
        return head;
    }
    DelNode findNthNode(DelNode head, int n)//finds the mid  element and deletes it
    {
        DelNode slow=head;
        DelNode fast=head;

        for(int i=1;i<=n;i++)//move the  fast pointer to L-n to make a gap
        {
            fast=fast.next;
        }
        if(fast == null)
            return head.next;
        while(fast.next!=null)
        {
            //both slow and fast take one stepat a time
            slow=slow.next;//slow stops just before the node to be deleted
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;

    }
    void display(DelNode head)
    {
        DelNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

}
public class DeleteNthNodeEnd {
    public  static void main(String[]  args)
    {
        int arr[]={1,2,3,4,5};
        deleteNthNode du=new deleteNthNode();
        DelNode head = du.insert(arr);//insert array elements in the nodes
        du.display(head);
        int n=3;
        head=du.findNthNode(head,n);
        du.display(head);
    }
}

