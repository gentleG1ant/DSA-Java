package Strings;

import java.util.Arrays;

class Prefix {

    String subString(String[] s) {

        StringBuilder ans = new StringBuilder();

        // Sort the strings lexicographically
        Arrays.sort(s);

        // After sorting, only the first and last strings
        // are needed to find the common prefix
        String first = s[0];
        String last = s[s.length - 1];

        // Compare characters of the first and last strings
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {

            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }

            ans.append(first.charAt(i));
        }

        return ans.toString();
    }
}

public class LongestPrefixSubString {

    public static void main(String[] args) {

        String[] arr = {
                "interview",
                "internet",
                "internal",
                "interval",
                "interview",
                "internet",
                "internal",
                "interval"
        };

        Prefix pps = new Prefix();

        System.out.println(pps.subString(arr));
    }
}