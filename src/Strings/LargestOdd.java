package Strings;

class SubString {

    String substring(String s) {

        int ind = -1;

        // Find the rightmost odd digit
        for (int i = s.length() - 1; i >= 0; i--) {

            if ((s.charAt(i) - '0') % 2 == 1) {
                ind = i;
                break;
            }
        }

        // No odd digit found
        if (ind == -1) {
            System.out.println("No odd number found");
            return "";
        }

        // Remove leading zeroes
        int i = 0;

        while (i <= ind && s.charAt(i) == '0')
            i++;

        // Return the largest odd substring
        return s.substring(i, ind + 1);
    }
}

public class LargestOdd {

    public static void main(String[] args) {

        String s = "02345608709";

        SubString ss = new SubString();

        System.out.println(ss.substring(s));
    }
}