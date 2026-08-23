//brute method
/*class middleLL
{
    int data;
    middleLL next;
    middleLL prev;
    middleLL(int data)
    {
        this.data=data;
        this.prev=null;
        this.next=null;
    }
    middleLL(int data,middleLL prev,middleLL next)
    {
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
}
class FindMiddle
{
    middleLL insertion(int arr[])
    {
        middleLL head=new middleLL(arr[0]);
        middleLL prev=head;
        for(int i=1;i<arr.length;i++) {
            middleLL temp=new middleLL(arr[i],prev,null);
            prev.next=temp;//it is the previous node whose next is updated
            // with the address of new node
            prev=temp;//nowthe prev  variable  holds the  value of
            // current new node for giving the
            //previous node address to the upcoming node
            }
        return head;
    }
    void FindmiddleElement(middleLL head)
    {
        middleLL temp=head;
        int c=0;
        while(temp!=null)
        {
            temp=temp.next;
            c++;
        }
        int mid=(c/2)+1;
        //chooses second middle for even nos
        // & round it properly to whole for odd
        // ex:(5/2)+1=3 & (6/2)=3 but 3+1=4(second middle)
        temp=head;
        while(temp!=null)
        {
            mid=mid-1;
            if(mid==0) {
                break;
            }
            temp=temp.next;
        }
        System.out.println("This is the middle value "+  temp.data);

    }
}
class MiddleElement
{
    public static void main(String []args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        FindMiddle fm=new FindMiddle();
        middleLL head=fm.insertion(arr);
        fm.FindmiddleElement(head);
    }
}
 */
//Optimal Approach
class middleLL
{
    int data;
    middleLL prev;
    middleLL next;
    middleLL(int data)
    {
        this.data=data;
        next=null;
        prev=null;
    }
    middleLL(int data,middleLL prev,middleLL next)
    {
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
}
class FindMiddle
{
    middleLL insertion(int arr[])
    {
        middleLL prev;
        middleLL head=new middleLL(arr[0]);
        prev=head;
        for(int i=0;i<arr.length;i++)
        {
            middleLL temp=new middleLL(arr[i],prev,null);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    void FindmiddleElement(middleLL head)
    {
        middleLL slow=head;
        middleLL fast=head;
        while(fast!=null && fast.next!=null&& slow!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println("Middle element "+slow.data);
    }
}
class MiddleElement
{
    public static void main(String []args)
    {
        FindMiddle fm=new FindMiddle();
        int arr[]={1,2,3,4,5,6,7};
        middleLL head=fm.insertion(arr);
        fm.FindmiddleElement(head);
    }
}
