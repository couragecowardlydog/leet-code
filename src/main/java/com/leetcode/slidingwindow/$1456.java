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
        System.out.println("REsoolt +" + result);
        for (i = k; i < chars.length; i++) {
            count = count + isVowel(chars[i]) - isVowel(chars[i - k]);
            result = Math.max(result, count);
        }
        return result;
    }

    private int isVowel(char c) {
        return ('a' == c || 'e' == c || 'i' == c || 'o' == c || 'u' == c) ? 1 : 0;
    }
}
