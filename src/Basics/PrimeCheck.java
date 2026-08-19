/*
 * Program: Prime Number Check
 *
 * Description:
 * This program determines whether a given number is prime.
 * It demonstrates two approaches for checking primality:
 *
 * 1. Generic Approach:
 *    Checks whether the number is divisible by any integer from
 *    2 to n - 1.
 *
 * 2. Square Root Approach:
 *    Checks divisibility only up to the square root of the number,
 *    reducing the number of iterations required.
 */

import java.util.Scanner;

public class PrimeCheck
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any no to be checked for prime or not prime");
        int n = sc.nextInt();

        boolean isPrime = true;

/*
        // Generic Method
        //
        // Check whether n is divisible by any number
        // between 2 and n - 1.
        if(n <= 1)
            isPrime = false;
        else
        {
            for(int i = 2; i <= n - 1; i++)
            {
                if(n % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime == true)
            System.out.println(n + " is a prime no");
        else
            System.out.println(n + " is not a prime no");
*/


        // Square Root Method
        //
        // A number only needs to be checked for divisibility
        // up to its square root.
        if(n <= 1)
            isPrime = false;
        else
        {
            // Math.sqrt() returns a double, so it is type-cast to int.
            int sqr = (int) Math.sqrt(n);

            // Check divisibility from 2 up to the square root of n.
            for(int i = 2; i <= sqr; i++)
            {
                if(n % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display the result.
        if(isPrime == true)
            System.out.println(n + " is a prime no");
        else
            System.out.println(n + " is not a prime no");
    }
}