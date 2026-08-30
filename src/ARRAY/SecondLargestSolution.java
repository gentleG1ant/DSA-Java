/*
 * Program: Find Second Largest Element in an Array
 *
 * Description:
 * Finds the second largest DISTINCT element in the array
 * using a single traversal.
 *
 * Example:
 * Input:  {2, 9, 1, 3, 3, 4}
 * Output: 4
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solutions1
{
 int secondLargest(int arr[], int n)
 {
  /*
   * Initialize both values to the smallest possible integer.
   *
   * max       -> stores the largest element
   * secondMax -> stores the second largest element
   */
  int max = Integer.MIN_VALUE;
  int secondMax = Integer.MIN_VALUE;

  // Traverse the array once.
  for(int i = 0; i < n; i++)
  {
   /*
    * If the current element is greater than max,
    * the previous max becomes the second largest.
    */
   if(arr[i] > max)
   {
    secondMax = max;
    max = arr[i];
   }

   /*
    * If the current element is smaller than max
    * but greater than secondMax, update secondMax.
    *
    * arr[i] != max prevents duplicate largest elements
    * from being considered as the second largest.
    */
   else if(arr[i] > secondMax && arr[i] != max)
   {
    secondMax = arr[i];
   }
  }

  return secondMax;
 }
}

public class SecondLargestSolution
{
 public static void main(String[] args)
 {
  int arr[] = {2, 9, 1, 3, 3, 4};

  int n = arr.length;

  Solutions1 s = new Solutions1();

  int result = s.secondLargest(arr, n);

  if(result == Integer.MIN_VALUE)
   System.out.println("Second largest element does not exist");
  else
   System.out.println("Second largest = " + result);
 }
}