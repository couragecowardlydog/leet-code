package com.leetcode.prefixsum;

import java.util.Arrays;

public class $724 {

    public int pivotIndex(int[] nums) {
        int[] lSum = new int[nums.length];
        int[] rSum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            lSum[i] = sum;
        }
        sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];
            rSum[i] = sum;
        }
        for (int i = 0; i < nums.length; i++) {
            if(lSum[i] == rSum[i]) {
                return i;
            }
        }
        return -1;
    }
}
