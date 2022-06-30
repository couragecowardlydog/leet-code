package com.leetcode.arrays;

public class RemoveDuplicates {


    public int removeDuplicates(int[] input) {
        short slow = 0;
        short fast = 0;
        while (fast < input.length) {
            if (input[slow] != input[fast]) {
                input[++slow]= input[fast];
            }
            fast++;

        }
        return slow + 1;
    }
}
