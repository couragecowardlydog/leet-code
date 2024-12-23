package com.leetcode.stack;

public class $2390 {

    public static final Character ASTERIKS = '*';

    public String removeStars(String s) {
        char[] stack = new char[s.length()];
        char[] input = s.toCharArray();
        int pointer = 0;
        for (char c : input) {
            stack[pointer] = c;
            while (pointer >= 0 && ASTERIKS == stack[pointer]) {
                pointer = pointer - 2;
            }
            pointer++;
        }
        char[] result = new char[pointer];
        int i = 0;
        while (i < pointer) {
            result[i] = stack[i];
            i++;
        }
        return new String(result);
    }


}
