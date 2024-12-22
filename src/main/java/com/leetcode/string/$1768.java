package com.leetcode.string;

public class $1768 {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        int index = 0;
        for (; index < word1.length() && index < word2.length(); index++) {
            s.append(word1.charAt(index));
            s.append(word2.charAt(index));
        }
        for (; index < word1.length(); index++) {
            s.append(word1.charAt(index));
        }
        for (; index < word2.length(); index++) {
            s.append(word2.charAt(index));
        }
        return s.toString();
    }

}
