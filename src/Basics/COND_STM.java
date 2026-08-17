import java.util.Scanner;

/*
 * Demonstration of different conditional statements in Java:
 *
 * 1. IF statement
 * 2. IF-ELSE statement
 * 3. Multiple IF statements
 * 4. IF-ELSE-IF ladder
 * 5. SWITCH-CASE statement
 *
 * A single Scanner object is passed to all classes so that
 * the same System.in input stream is shared throughout the program.
 */

class IF {

    // Demonstrates the basic IF statement.
    static void CHECK(Scanner sc) {
        System.out.println("\n--- IF Statement ---");
        System.out.print("Enter a positive number to check: ");

        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("It is a positive number.");
        }
    }
}

class IF_ELSE {

    // Demonstrates the IF-ELSE statement.
    static void CHECK(Scanner sc) {
        System.out.println("\n--- IF-ELSE Statement ---");
        System.out.print("Enter an integer to check whether it is positive: ");

        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positive number.");
        } else {
            System.out.println("It is not a positive number.");
        }
    }
}

class Lader_if {

    // Demonstrates multiple independent IF statements.
    static void CHECK(Scanner sc) {
        System.out.println("\n--- Multiple IF Statements ---");
        System.out.print("Enter an integer to check whether it is positive, negative, or zero: ");

        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("It is a positive number.");
        }

        if (n < 0) {
            System.out.println("It is a negative number.");
        }

        if (n == 0) {
            System.out.println("It is zero.");
        }
    }
}

class If_Else_If {

    // Demonstrates the IF-ELSE-IF ladder.
    static void CHECK(Scanner sc) {
        System.out.println("\n--- IF-ELSE-IF Ladder ---");
        System.out.print("Enter an integer to determine whether it is positive, negative, or zero: ");

        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positive number.");
        } else if (n < 0) {
            System.out.println("Negative number.");
        } else {
            System.out.println("Zero.");
        }
    }
}

class SWITCH_CASE {

    // Demonstrates the SWITCH-CASE statement.
    static void CHECK(Scanner sc) {
        System.out.println("\n--- SWITCH-CASE Statement ---");
        System.out.print("Enter an integer to determine whether it is positive, negative, or zero: ");

        int n = sc.nextInt();
        int ch;

        /*
         * switch checks for exact values rather than conditions.
         * Therefore, the input is converted into:
         *
         *  1  -> positive
         * -1  -> negative
         *  0  -> zero
         */

        if (n > 0) {
            ch = 1;
        } else if (n < 0) {
            ch = -1;
        } else {
            ch = 0;
        }

        switch (ch) {
            case 1:
                System.out.println("Positive number.");
                break;

            case -1:
                System.out.println("Negative number.");
                break;

            case 0:
                System.out.println("Zero.");
                break;

            default:
                System.out.println("Invalid input.");
        }
    }
}

public class COND_STM {

    public static void main(String[] args) {

        // One Scanner is shared by all conditional-statement examples.
        Scanner sc = new Scanner(System.in);

        IF.CHECK(sc);
        IF_ELSE.CHECK(sc);
        Lader_if.CHECK(sc);
        If_Else_If.CHECK(sc);
        SWITCH_CASE.CHECK(sc);

        sc.close();
    }
}