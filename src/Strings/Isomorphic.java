package Strings;

class IsoString {

    boolean isIso(String s, String t) {

        // 256 positions cover the standard ASCII character range
        int[] m1 = new int[256];
        int[] m2 = new int[256];

        for (int i = 0; i < s.length(); i++) {

            // Both characters must have the same previous occurrence pattern
            if (m1[s.charAt(i)] != m2[t.charAt(i)])
                return false;

            // Store i + 1 because 0 represents "not seen yet"
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }

        return true;
    }
}

public class Isomorphic {

    public static void main(String[] args) {

        IsoString iso = new IsoString();

        String s = "paper";
        String t = "title";

        if (iso.isIso(s, t))
            System.out.println("Yes, Isomorphic");
        else
            System.out.println("Not Isomorphic");
    }
}