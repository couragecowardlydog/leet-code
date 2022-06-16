package com.leetcode.string;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] input) {
        StringBuilder max_current = new StringBuilder();
        int cursor = 0;
        int max_cursor = Integer.MAX_VALUE;
        for (int i = 0; i < input.length; i++) {
            max_cursor = Integer.min(max_cursor, input[i].length());
        }
        boolean isMatch = true;
        while (true) {
            if (cursor >= max_cursor ) {
                break;
            }
            char previous = input[0].charAt(cursor);
            for (int i = 1; i < input.length; i++) {
                char current = input[i].charAt(cursor);
                if (previous == current) {
                    previous = current;
                    isMatch = true;
                } else {
                    isMatch = false;
                    break;
                }
            }
            if (!isMatch) {
                break;
            }
            max_current = max_current.append(previous);
            cursor++;

        }
        return max_current.toString();
    }


}
