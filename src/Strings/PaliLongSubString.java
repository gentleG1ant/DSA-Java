package Strings;
import java.util.*;

class subString {
    String longestSubString(String s) {
        if (s.length() < 2)
            return s;

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(i, i, s); // center for odd length
            int len2 = expand(i, i + 1, s); // center for even length
            int len = Math.max(len1, len2);

            if (len > end - start + 1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    int expand(int left, int right, String s) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}

public class PaliLongSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string ");
        String s = sc.nextLine();
        subString sb = new subString();
        System.out.println(sb.longestSubString(s));
    }
}

    
