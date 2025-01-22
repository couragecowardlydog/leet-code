package com.leetcode.slidingwindow;

public class $1456 {

    public int maxVowels(String s, int k) {
        int result = 0;
        int count = 0;
        int i;
        char[] chars = s.toCharArray();
        for (i = 0; i < k; i++) {
            count += isVowel(chars[i]);
        }
        result = Math.max(result, count);
        for (i = k; i < chars.length - k; i++) {
            result = Math.max(result, count + isVowel(chars[i]) - isVowel(chars[i - k]));
        }
        return result;
    }

    private int isVowel(char c) {
        return ('a' == c || 'e' == c || 'i' == c || 'o' == c || 'u' == c) ? 1 : 0;
    }
}
