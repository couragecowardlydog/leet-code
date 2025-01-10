package com.leetcode.arrays;

import java.util.Arrays;


public class $443 {

    public int compress(char[] chars) {
        int i = 0;
        int pointer = 0;
        while (i < chars.length) {
            char curr = chars[i++];
            int count = 1;
            while (i < chars.length && chars[i] == curr) {
                i++;
                count++;
            }
            chars[pointer++] = curr;
            char[] arr = Integer.valueOf(count).toString().toCharArray();
            for (int j = 0; j < arr.length && count > 1; j++) {
                chars[pointer++] = arr[j];
            }

        }
        return pointer;
    }


}
