package Strings;

/*
Brute Force Approach

class Rotate {

    boolean rotated(String s, String goal) {

        // Try every possible rotation
        for (int i = 0; i < s.length(); i++) {

            String rotated = s.substring(i) + s.substring(0, i);

            if (rotated.equals(goal))
                return true;
        }

        return false;
    }
}

public class RotateString {

    public static void main(String[] args) {

        Rotate ros = new Rotate();

        String s = "rotation";
        String goal = "tionrota";

        System.out.println(ros.rotated(s, goal));
    }
}
*/

// Optimal Approach
class Rotate {

    boolean rotated(String s, String goal) {

        // Rotated string must have the same length
        if (s.length() != goal.length())
            return false;

        // Every rotation of s will appear inside s + s
        String rotated = s + s;

        return rotated.contains(goal);
    }
}

public class RotateString {

    public static void main(String[] args) {

        Rotate ros = new Rotate();

        String s = "rotation";
        String goal = "tionrota";

        System.out.println(ros.rotated(s, goal));
    }
}