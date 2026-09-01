/*
 * Program: Find the Number Appearing Only Once
 *
 * Description:
 * Given an array where every element appears twice except one element,
 * find the element that appears only once.
 *
 * Two approaches are included:
 *
 * 1. Brute-Force Approach
 *    For every element, count how many times it appears in the array.
 *
 *    Time Complexity: O(n^2)
 *    Space Complexity: O(1)
 *
 * 2. Optimal Approach
 *    Uses XOR.
 *
 *    Important XOR properties:
 *    a ^ a = 0
 *    a ^ 0 = a
 *
 *    Therefore, all duplicate elements cancel each other,
 *    leaving only the element that appears once.
 *
 *    Time Complexity: O(n)
 *    Space Complexity: O(1)
 */


// ============================================================
// Brute-Force Approach
// ============================================================

/*
class Appearance
{
    int ApearCalculationBrute(int arr[])
    {
        // Picks each element one by one.
        for(int i = 0; i < arr.length; i++)
        {
            int count = 0;

            // Store the current element.
            int num = arr[i];

            // Count how many times the current element occurs.
            for(int j = 0; j < arr.length; j++)
            {
                if(num == arr[j])
                    count++;
            }

            // If the element occurs only once,
            // it is our required answer.
            if(count == 1)
            {
                return num;
            }
        }

        // No unique element found.
        return -1;
    }
}

public class NumberAppearance
{
    public static void main(String[] args)
    {
        int arr[] = {4, 1, 2, 1, 2};

        Appearance ac = new Appearance();

        System.out.println(
                "The required answer is "
                + ac.ApearCalculationBrute(arr)
        );
    }
}
*/


// ============================================================
// Optimal Approach
// ============================================================

class Appearance
{
    // Uses XOR to find the element appearing only once.
    //
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    int ApearCalculationOptimal(int arr[])
    {
        int xor = 0;

        for(int i = 0; i < arr.length; i++)
        {
            // Duplicate elements cancel each other.
            xor = xor ^ arr[i];
        }

        // Only the element appearing once remains.
        return xor;
    }
}

public class NumberAppearance
{
    public static void main(String[] args)
    {
        int arr[] = {4, 1, 2, 1, 2};

        Appearance ac = new Appearance();

        System.out.println(
                "The required answer is "
                        + ac.ApearCalculationOptimal(arr)
        );
    }
}