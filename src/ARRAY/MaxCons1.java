/*
 * Program: Maximum Consecutive Ones
 *
 * Description:
 * Finds the maximum number of consecutive 1s present
 * in a binary array.
 *
 * Example:
 * Input:  {1, 1, 0, 1, 1, 1}
 * Output: 3
 *
 * Approach:
 * Traverse the array once.
 *
 * - If the current element is 1, increase the current count.
 * - If the current element is 0, reset the count to 0.
 * - Keep updating max with the highest count found.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solutions
{
    int maxFreq(int arr[])
    {
        int count = 0;
        int max = 0;

        // Traverse through every element of the array.
        for(int i = 0; i < arr.length; i++)
        {
            // Continue the current consecutive sequence.
            if(arr[i] == 1)
            {
                count++;
            }

            // Sequence is broken by 0.
            else
            {
                count = 0;
            }

            // Store the maximum consecutive count found so far.
            max = Math.max(count, max);
        }

        return max;
    }
}

public class MaxCons1
{
    public static void main(String[] args)
    {
        int arr[] = {1, 1, 0, 1, 1, 1};

        Solutions sc = new Solutions();

        System.out.println(
                "Maximum consecutive 1s = " + sc.maxFreq(arr)
        );
    }
}