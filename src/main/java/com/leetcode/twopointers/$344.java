package com.leetcode.twopointers;

public class $344 {

    public void reverseString(char[] s) {

        int i = 0, j = s.length - 2;
        while (i < j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
