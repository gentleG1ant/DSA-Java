package Strings;

class Anagram {

    boolean checkAnagram(String s1, String s2) {

        // Convert both strings to uppercase
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();

        // Anagrams must have the same length
        if (s1.length() != s2.length()) {
            return false;
        }

        // Frequency array for 26 English alphabets
        int[] freq = new int[26];

        // Increase frequency for characters in first string
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'A']++;
        }

        // Decrease frequency for characters in second string
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i) - 'A']--;
        }

        // Every frequency must return to zero
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}

public class AnagramString {

    public static void main(String[] args) {

        Anagram ans = new Anagram();

        String s1 = "INTEGER";
        String s2 = "TINGERe";

        if (ans.checkAnagram(s1, s2)) {
            System.out.println("It is an Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
    }
}