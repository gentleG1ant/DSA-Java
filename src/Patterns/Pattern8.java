package Day5;
import java.util.*;
public class Pattern8 {
    public static void main(String  args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any no");
        int n=sc.nextInt();
        for(int ro=n;ro>=1;ro--)//row handling
        {
            for(int l=0;l<n-ro;l++)//left space
                System.out.print(" ");
            for(int s=1;s<=(2*(ro-1)+1);s++)//star
                System.out.print("*");
            for(int r=0;r<n-ro;r++)//right space
                System.out.print(" ");
            System.out.println();
        }
    }
}
