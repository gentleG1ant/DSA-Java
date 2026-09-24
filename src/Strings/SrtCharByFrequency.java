package Strings;

import java.util.*;

class Pair {
    int freq;
    char ch;

    Pair(int freq, char ch) {
        this.freq = freq;
        this.ch = ch;
    }
}

class Sort {
    List<Character> frequencySort(String s) {
        Pair[] freq = new Pair[26];

        // Initialize each character with frequency 0
        for (int i = 0; i < 26; i++) {
            freq[i] = new Pair(0, (char) (i + 'a'));
        }

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch - 'a'].freq++;
        }

        // Sort by frequency descending, then character ascending
        Arrays.sort(freq, (p1, p2) -> {
            if (p1.freq != p2.freq) {
                return p2.freq - p1.freq;
            }
            return p1.ch - p2.ch;
        });

        // Collect characters with non-zero frequency
        List<Character> res = new ArrayList<>();

        for (Pair p : freq) {
            if (p.freq > 0) {
                res.add(p.ch);
            }
        }

        return res;
    }
}

public class SrtCharByFrequency {
    public static void main(String[] args) {
        Sort st = new Sort();

        String s = "tree";

        System.out.println(st.frequencySort(s));
    }
}