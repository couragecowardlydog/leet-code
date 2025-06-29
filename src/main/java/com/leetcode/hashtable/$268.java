package com.leetcode.hashtable;

public class $268 {


    public int missingNumber(int[] nums) {
        int n = nums.length;
        int req = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return req - sum;

    }
}
