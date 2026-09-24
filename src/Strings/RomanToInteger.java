package Strings;

import java.util.HashMap;
import java.util.Scanner;

class Roman {
    int integer(String s) {
        int sum = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {

            if (i + 1 < s.length()
                    && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {

                sum += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                i++;

            } else {
                sum += map.get(s.charAt(i));
            }
        }

        return sum;
    }
}

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Roman string:");
        String s = sc.nextLine();

        Roman ro = new Roman();

        System.out.println(ro.integer(s));

        sc.close();
    }
}