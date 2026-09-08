package Day5;
import java.util.*;
public class Pattern9
{
    static int n;
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter any no");
        n=sc.nextInt();
        top();
        bottom();

    }//a function can not be declared inside  a function not even main function
    //since we are calling our functions in main function they need to be static
     static void top()
    {
        for(int r=0;r<n;r++)
        {
            for(int l=0;l<n-r-1;l++)
                System.out.print(" ");
            for(int s=1;s<=2*r+1;s++)
                System.out.print("*");
            for(int ri=1;ri<n-r-1;ri++)
                System.out.print("");
            System.out.println();
        }
    }
     static void bottom()
    {
        for(int r=n-2;r>=0;r--)
        {
            for(int l=0;l<n-r-1;l++)
                System.out.print(" ");
            for(int s=1;s<=2*r+1;s++)
                System.out.print("*");
            for(int ri=1;ri<=r;ri++)
                System.out.print(" ");
            System.out.println();
        }
    }

}
