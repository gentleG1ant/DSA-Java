package Strings;

class RemoveParenthesisSolution {

    String removeParentheses(String s) {

        // StringBuilder allows efficient continuous modification
        StringBuilder result = new StringBuilder();

        int depth = 0;

        // Traverse every character in the string
        for (char ch : s.toCharArray()) {

            if (ch == '(') {

                // Append only if this is NOT the outermost opening bracket
                if (depth > 0)
                    result.append(ch);

                // A new parenthesis layer is opened
                depth++;
            }

            else if (ch == ')') {

                // Close the current parenthesis layer
                depth--;

                // Append only if this is NOT the outermost closing bracket
                if (depth > 0)
                    result.append(ch);
            }
        }

        return result.toString();
    }
}

public class RemoveOuterParenthesis {

    public static void main(String[] args) {

        String s = "(()())(())";

        RemoveParenthesisSolution rs = new RemoveParenthesisSolution();

        System.out.println(rs.removeParentheses(s));
    }
}