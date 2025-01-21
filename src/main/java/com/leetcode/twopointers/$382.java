package com.leetcode.twopointers;

public class $382 {

    public boolean isSubsequence(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        if (sChar.length == 0)
            return true;
        int i = 0, j = 0;
        while (i < sChar.length && j < tChar.length) {
            if (sChar[i] == tChar[j]) {
                i++;
            }
            if (i == sChar.length) {
                return true;
            }
            j++;

        }
        return false;
    }

}
