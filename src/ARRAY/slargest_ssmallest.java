import java.util.*;

public class slargest_ssmallest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter 5 elements in the array");

        // Take input.
        for(int i = 0; i < 5; i++)
            arr[i] = sc.nextInt();

        // Initialize largest and smallest.
        int largest = arr[0];
        int smallest = arr[0];

        // Initialize second largest and second smallest.
        int slargest = Integer.MIN_VALUE;
        int ssmallest = Integer.MAX_VALUE;

        // Find largest, second largest, smallest and second smallest.
        for(int i = 0; i < 5; i++)
        {
            // Find largest and second largest.
            if(arr[i] > largest)
            {
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > slargest)
            {
                slargest = arr[i];
            }

            // Find smallest and second smallest.
            if(arr[i] < smallest)
            {
                ssmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] > smallest && arr[i] < ssmallest)
            {
                ssmallest = arr[i];
            }
        }

        System.out.println("The largest element is " + largest);
        System.out.println("The second largest element is " + slargest);
        System.out.println("The smallest element is " + smallest);
        System.out.println("The second smallest element is " + ssmallest);

        sc.close();
    }
}