import java.util.Scanner;

/**
 * Demonstrates the use of an IF-ELSE-IF ladder
 * to determine a grade based on marks.
 *
 * Grading criteria:
 * 90 and above  -> Grade A
 * 70 to 89      -> Grade B
 * 50 to 69      -> Grade C
 * 35 to 49      -> Grade D
 * Below 35      -> Fail
 */
public class MARKS_If_Else_If {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks you obtained: ");
        double marks = sc.nextDouble();

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else if (marks >= 35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}