// Brute-Force Approach

/*
class SolutionBuy_Sel_Stock
{
    // Finds the maximum profit by checking
    // every possible buying and selling combination.
    //
    // Time Complexity: O(n²)
    // Space Complexity: O(1)
    int findProfit(int arr[])
    {
        int max = 0;
        int profit;

        // Select the buying day.
        for(int i = 0; i < arr.length; i++)
        {
            // Select the selling day after the buying day.
            for(int j = i + 1; j < arr.length; j++)
            {
                // Calculate the profit.
                profit = arr[j] - arr[i];

                // Keep track of the maximum profit.
                max = Math.max(profit, max);
            }
        }

        return max;
    }
}

public class Buy_Sel_Stock
{
    public static void main(String[] args)
    {
        int arr[] = {7, 1, 5, 3, 6, 4};

        SolutionBuy_Sel_Stock sbs = new SolutionBuy_Sel_Stock();

        System.out.println("Maximum Profit = " + sbs.findProfit(arr));
    }
}
*/


// ============================================================
// Optimal Approach
// ============================================================

class SolutionBuy_Sel_Stock
{
    /*
     * The goal is to find the maximum profit that can be made
     * by buying on one day and selling on a later day.
     *
     * We keep track of:
     *
     * 1. Minimum price seen so far.
     * 2. Maximum profit possible by selling at the current price.
     *
     * Example:
     * Array: 7 1 5 3 6 4
     *
     * Minimum buying price = 1
     * Best selling price   = 6
     * Maximum profit       = 6 - 1 = 5
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    int findProfit(int arr[])
    {
        // Stores the minimum stock price seen so far.
        int min = Integer.MAX_VALUE;

        // Stores the maximum profit found so far.
        int max = 0;

        // Traverse the array once.
        for(int i : arr)
        {
            // Update the minimum buying price.
            if(i < min)
            {
                min = i;
            }

            // Calculate the profit if the stock is sold today.
            // Update maximum profit if this profit is better.
            max = Math.max(max, i - min);
        }

        return max;
    }
}

public class Buy_Sel_Stock
{
    public static void main(String[] args)
    {
        int arr[] = {7, 1, 5, 3, 6, 4};

        SolutionBuy_Sel_Stock sbs = new SolutionBuy_Sel_Stock();

        System.out.println("Maximum Profit = " + sbs.findProfit(arr));
    }
}