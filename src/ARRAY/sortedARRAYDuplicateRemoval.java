import java.util.*;

public class sortedARRAYDuplicateRemoval
{
    public static void main(String[] args)
    {
        // Pre-sorted array.
        int arr[] = {1, 1, 2, 2, 2, 3, 3, 3};

        // i points to the position where the next unique element is placed.
        int i = 1;

        // j traverses the array from the second element.
        for(int j = 1; j < arr.length; j++)
        {
            // If the current element is different,
            // place it at the next unique position.
            if(arr[i - 1] != arr[j])
            {
                arr[i] = arr[j];
                i++;
            }
        }

        // i represents the size of the array containing unique elements.
        System.out.println("Size of array after duplicate elements removed: " + i);

        // Print only the unique elements.
        for(int t = 0; t < i; t++)
            System.out.print(arr[t] + " ");
    }
}