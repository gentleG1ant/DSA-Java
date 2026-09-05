// Array should contain only positive elements.

// Brute Solution
/*
class SolutionSum
{
    int FindSubArrayBrute(int arr[], int k)
    {
        int max = 0;

        for(int i = 0; i < arr.length; i++)
        {
            int count = 0;
            int sum = 0;

            // Select the starting index.
            for(int j = i; j < arr.length; j++)
            {
                sum += arr[j];
                count++;

                if(sum == k)
                    max = Math.max(max, count);
            }
        }

        return max;
    }
}
*/


// Optimal Solution
// Sliding Window / Two Pointer Approach

class SolutionSum
{
    int FindSubArrayOptimal(int arr[], int k)
    {
        int l = 0;
        int r = 0;

        int sum = 0;
        int max = 0;
        int n = arr.length;

        while(r < n)
        {
            // Expand the window from the right.
            sum += arr[r];

            // Shrink the window from the left
            // if the sum becomes greater than k.
            while(l <= r && sum > k)
            {
                sum -= arr[l];
                l++;
            }

            // Check whether the current window has sum k.
            if(sum == k)
            {
                max = Math.max(max, r - l + 1);
            }

            r++;
        }

        return max;
    }
}

public class SubArraySumPositive
{
    public static void main(String args[])
    {
        int arr[] = {10, 5, 2, 7, 1, 9};

        int k = 15;

        SolutionSum ss = new SolutionSum();

        System.out.println(
                "Maximum count of elements of sub array = "
                        + ss.FindSubArrayOptimal(arr, k)
        );
    }
}