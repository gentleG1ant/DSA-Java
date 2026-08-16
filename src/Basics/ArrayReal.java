import java.util.Scanner;

/*
 * Program: Age Statistics
 *
 * Calculates the average, minimum, and maximum age
 * from five age values entered by the user.
 *
 * Approach:
 * Store the ages in an array and find the sum,
 * minimum, and maximum while reading the values.
 */

class AgeStatistics {

    static int[] ages = new int[5];

    static void input(Scanner sc) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        // Read five ages and calculate statistics.
        for (int i = 0; i < 5; i++) {

            System.out.print("Enter age " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            if (ages[i] > max) {
                max = ages[i];
            }

            if (ages[i] < min) {
                min = ages[i];
            }

            sum += ages[i];
        }

        // Convert sum to double before division for an accurate average.
        double average = (double) sum / 5;

        System.out.println("\nAverage Age = " + average);
        System.out.println("Total Age   = " + sum);
        System.out.println("Minimum Age = " + min);
        System.out.println("Maximum Age = " + max);
    }
}

public class ArrayReal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AgeStatistics.input(sc);

        sc.close();
    }
}