import java.util.*;

public class LARGEST
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Taking the size of the array.
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Taking array elements as input.
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        // Assume the first element is the largest.
        int largest = arr[0];

        // Compare every element with the current largest.
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
        }

        // Display the largest element.
        System.out.println("Largest Value is " + largest);

        sc.close();
    }
}