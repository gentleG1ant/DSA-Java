import java.util.*;

public class SecondLargest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter 5 elements in an array");

        // Take input.
        for(int i = 0; i < 5; i++)
            arr[i] = sc.nextInt();

        // Find the largest element.
        int largest = arr[0];

        for(int i = 1; i < 5; i++)
        {
            if(arr[i] > largest)
                largest = arr[i];
        }

        System.out.println("The largest element is " + largest);

        // Find the second largest element.
        int seclargest = Integer.MIN_VALUE;

        for(int i = 0; i < 5; i++)
        {
            if(arr[i] > seclargest && arr[i] < largest)
                seclargest = arr[i];
        }

        System.out.println("Second largest element is " + seclargest);

        sc.close();
    }
}