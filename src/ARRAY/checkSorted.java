import java.util.*;

public class checkSorted
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Taking the size of the array from the user.
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Taking array elements as input.
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        // Assume that the array is sorted initially.
        boolean isSorted = true;

        /*
         * Compare every element with its previous element.
         *
         * For a sorted array in ascending order:
         * arr[i - 1] <= arr[i]
         *
         * If arr[i - 1] > arr[i], the array is not sorted.
         */
        for(int i = 1; i < n; i++)
        {
            if(arr[i - 1] > arr[i])
            {
                isSorted = false;
                break;
            }
        }

        // Display the result.
        System.out.println("Is the array sorted? " + isSorted);

        sc.close();
    }
}