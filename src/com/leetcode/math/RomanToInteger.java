package com.leetcode.math;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {
        int sum = 0;
        Map map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            char n = s.charAt(i + 1);
            if ((int) map.get(c) < (int) map.get(n)) {
                sum -= (int) map.get(c);
                continue;
            }
            sum = sum + (int) map.get(c);
        }
        return sum + (int) map.get(s.charAt(s.length() - 1));
    }


    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
