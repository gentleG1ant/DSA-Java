package Day5;
import java.util.*;
public class Pattern7 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any no of rows");
        int n=sc.nextInt();
        for(int r=1;r<=n;r++)//loop to control row
        {
            for(int l=1;l<=(n-r);l++)//loop for left blank space
                System.out.print(" ");
            for(int s=1;s<=((2*r)-1);s++)//loop for star
                System.out.print("*");
            for(int ri=1;ri<=(n-r);ri++)//loop for right blank spaces
                System.out.print(" ");
            System.out.println();

        }
    }
}
