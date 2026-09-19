package Strings;

class Depth {

    int findDepth(String s) {

        int depth = 0;
        int maxDepth = 0;

        // Traverse through the string
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                depth++;
            }
            else if (s.charAt(i) == ')') {
                depth--;
            }

            // Store the maximum depth reached
            maxDepth = Math.max(maxDepth, depth);
        }

        return maxDepth;
    }
}

public class MaximumDepthParenthesis {

    public static void main(String[] args) {

        Depth dp = new Depth();

        String s = "(1+(2*3)+((8)/4))+1";

        System.out.println(dp.findDepth(s));
    }
}