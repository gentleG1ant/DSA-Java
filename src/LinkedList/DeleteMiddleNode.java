//Brute Approach
/*class  MidNode
{
    int data;
    MidNode  next;

    MidNode(int data)
    {
        this.data=data;
        next=null;
    }
    MidNode(int data,MidNode next)
    {
        this.data=data;
        this.next=next;
    }
}
class  deleteUtilities
{
    MidNode insert(int arr[])
    {
        MidNode head=new MidNode(arr[0]);//entered the first node
        MidNode temp=head;
        for(int i=1;i<arr.length;i++)
        {
            temp.next= new  MidNode(arr[i]);
            temp=temp.next;
        }
        return head;
    }
    int findMid(MidNode head)//finds the mid  element and deletes it
    {
        int counter=0;
        int midcount=0;
        MidNode temp=head;
        while(temp!=null)
        {
            counter++;
            temp=temp.next;
        }
        temp=head;
        MidNode  prev=head;
        while(temp!=null)
        {
             midcount++;
            if(midcount==((counter/2)+1))//counts the mid nodefor odd and second mid for even
            {
                prev.next=temp.next;
                return 1;
            }
            else {
                prev=temp;
                temp = temp.next;
            }
        }
        return 0;
    }
    void display(MidNode head)
    {
        MidNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

}
public class DeleteMiddleNode {
    public  static void main(String[]  args)
    {
        int arr[]={1,2,3,4,5};
        deleteUtilities du=new deleteUtilities();
       MidNode head = du.insert(arr);//insert array elements in the nodes
        du.display(head);
        int res=du.findMid(head);
        if(res==1)
            du.display(head);
        else
            System.out.println("Enter more than one node");
    }
}
*/
//Optimal Approach
class MidNode
{
    int data;
    MidNode next;

    MidNode(int data)
    {
        this.data=data;
        next=null;
    }
    MidNode(int data, MidNode next)
    {
        this.data=data;
        this.next=next;
    }
}
class  deleteUtilities
{
    MidNode insert(int arr[])
    {
        MidNode head=new MidNode(arr[0]);//entered the first node
        MidNode temp=head;
        for(int i=1;i<arr.length;i++)
        {
            temp.next= new MidNode(arr[i]);
            temp=temp.next;
        }
        return head;
    }
     MidNode findMid(MidNode head)//finds the mid  element and deletes it
    {
        if(head==null||head.next==null)
            return null;
        MidNode slow = head;
        MidNode fast = head.next.next;//initialy starts from3rd element
        while (fast != null && fast.next != null) {
            slow = slow.next;//slow stops initialy jus before mid on finding fast next
            fast = fast.next.next;
            //general approach if fast would start from head
            // it would have stopped slow at exactly middle point
            // so we would need to use a prev variable to hold the previous element
            // and then we could bypass the middle element
        }
        slow.next=slow.next.next;
        return head;
    }
    void display(MidNode head)
    {
        MidNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

}
public class DeleteMiddleNode {
    public  static void main(String[]  args)
    {
        int arr[]={1,2,3,4,5};
        deleteUtilities du=new deleteUtilities();
        MidNode head = du.insert(arr);//insert array elements in the nodes
        du.display(head);
        du.findMid(head);
        du.display(head);
    }
}
