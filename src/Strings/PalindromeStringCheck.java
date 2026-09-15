package Strings;

// Brute Approach
/*
import java.util.*;

class reverseCheck {

    String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        // Extract each word from the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                word.append(s.charAt(i));
            }
            else if (word.length() > 0) {
                words.add(word.toString());
                word.setLength(0);
            }
        }

        // Add the last word if present
        if (word.length() > 0)
            words.add(word.toString());

        // Reverse the order of words
        Collections.reverse(words);

        return String.join(" ", words);
    }
}

public class PalindromeStringCheck {

    public static void main(String[] args) {
        String s = " Welcome to the jungle";
        reverseCheck rc = new reverseCheck();

        System.out.println(rc.reverseWords(s));
    }
}
*/

// Optimal Approach
import java.util.*;

class reverseCheck {

    String reverseWords(String s) {
        StringBuilder words = new StringBuilder();

        int end = 0;
        int i = s.length() - 1;

        // Traverse the string from right to left
        while (i >= 0) {

            // Skip extra spaces
            while (i >= 0 && s.charAt(i) == ' ')
                i--;

            if (i < 0)
                break;

            // Mark the end of the current word
            end = i;

            // Move left until the beginning of the word
            while (i > 0 && s.charAt(i) != ' ')
                i--;

            // Extract the current word
            String word = s.substring(i + 1, end + 1);

            // Add a space between words
            if (words.length() > 0)
                words.append(" ");

            words.append(word);
        }

        return words.toString();
    }
}

public class PalindromeStringCheck {

    public static void main(String[] args) {
        String s = " Welcome to the jungle";

        reverseCheck rc = new reverseCheck();

        System.out.println(rc.reverseWords(s));
    }
}