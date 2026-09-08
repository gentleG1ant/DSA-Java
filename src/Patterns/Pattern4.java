package Day5;
import java.util.*;
class pattern4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter any no");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("");
            for(int j=0;j<=i;j++)
            {
                System.out.print(i+1);
            }
        }
    }
}
