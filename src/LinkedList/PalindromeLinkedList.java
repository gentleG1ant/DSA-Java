//Brute force method
import java.util.*;
class PaliLL
{
    int data;
    PaliLL next;//class type variable to  hold addresses

    PaliLL(int data)
    {
        this.data=data;
        next=null;
    }
    PaliLL (int data,PaliLL next)
    {
        this.data=data;
        this.next=next;
    }
}
class PaliSol {
    Stack<Integer> st=new Stack<>();
    PaliLL insert(int arr[]) {
        PaliLL head = new PaliLL(arr[0]);//inserting 1st element as the  head
        PaliLL temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new PaliLL(arr[i]);
            temp = temp.next;//tem is moved to next
        }
        return head;
    }
    boolean travCheckRev(PaliLL head)
    {
        PaliLL temp=head;
        while(temp!=null)
        {
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null)//checking for similar data in reverse format
        {
            if(st.pop()!=temp.data)
                return false;
            else
                temp=temp.next;
        }
        return true;
    }
}
public class PalindromeLinkedList {
    public static void main (String[] args) {
        int[] arr = {1, 5, 2, 5, 1};
        PaliSol ps = new PaliSol();
        PaliLL head= ps.insert(arr);
        if(ps.travCheckRev(head))
            System.out.println("It is a Palindrome no");
        else
            System.out.println("Not a palindrome no");

    }

}
//Optimal Approach
/*class PaliLL
{
    int data;
    PaliLL next;//class type variable to  hold addresses

    PaliLL(int data)
    {
        this.data=data;
        next=null;
    }
    PaliLL (int data,PaliLL next)
    {
        this.data=data;
        this.next=next;
    }
}
class PaliSol
{
    PaliLL insert(int arr[])
    {
        PaliLL head=new PaliLL(arr[0]);//inserting 1st element as the  head
        PaliLL temp=head;
        for(int i=1;i<arr.length;i++)
        {
            temp.next=new PaliLL(arr[i]);
            temp=temp.next;//tem is moved to next
        }
        return head;
    }
    boolean midRev(PaliLL head)
    {
        PaliLL  mid=null;
        PaliLL slow=head;
        PaliLL fast=head;
        PaliLL current=null;
        PaliLL prev=null;
        PaliLL front=null;
            while(fast!=null&&fast.next!=null)
            {
                slow=slow.next;
                mid=slow;//is the middle element
                fast=fast.next.next;
            }
            current=mid;
            while(current!=null)//reversing the half mid of the linked list
            {
                 front=current.next;
                 current.next=prev;
                 prev=current;
                 current=front;
            }
            fast=prev;
            slow=head;
            while(slow!=null&&fast!=null)//check for palindrome
            {
               if(slow.data!=fast.data)
                   return false;//is not a palindrome linkedList
               slow=slow.next;
               fast=fast.next;
            }
        return true;//is a palindrome linkedList
    }


}
public class PalindromeLinkedList {
    public static void main (String[] args) {
        int[] arr = {1, 5, 2, 5, 1};
        PaliSol ps = new PaliSol();
       PaliLL head= ps.insert(arr);
        if(ps.midRev(head))
            System.out.println("It is a Palindrome no");
        else
            System.out.println("Not a palindrome no");

    }

}
*/