package com.leetcode.string;


public class $151 {

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strs = s.split(" ");
        for (int i = strs.length - 1; i >= 0; i--) {
            if (!strs[i].isEmpty()) {
                sb.append(strs[i]);
                if (i != 0) sb.append(" ");
            }

        }
        return sb.toString().trim();

    }

    public static final char SPACE = ' ';
    public String optimize(String s) {
        char[] input = s.toCharArray();
        char[] output = new char[input.length];
        int counter = output.length;
        for (int i = 0; i < input.length; i++) {
            while (i < input.length && input[i] == SPACE ) {
                i++;
            }
            int x = i;
            if (i < input.length) {
                while (i < input.length && input[i] != SPACE) {
                    i++;
                }
                int y = i - 1;
                if (counter != input.length) {
                    output[--counter] = SPACE;
                }
                while (y >= x) {
                    output[--counter] = input[y--];
                }
            }


        }
        return String.valueOf(output).trim();
    }
}
