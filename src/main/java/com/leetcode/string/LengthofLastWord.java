package com.leetcode.string;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        int previous = 0;
        int counter = 0;
        if(s.length() == 0)
            return 0;
        if (s.charAt(previous) != ' ')
            counter++;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(previous) == ' ' && s.charAt(i) != ' ') {
                counter = 0;
            }
            if (s.charAt(i) != ' ')
                counter++;
            previous = i;

        }
        return counter;
    }
}
