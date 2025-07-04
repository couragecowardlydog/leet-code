package com.leetcode.dp;

import java.util.Arrays;

public class $213 {

    Integer[] dp;

    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1)
            return nums[0];
        if (n == 2)
            return Math.max(nums[0], nums[1]);

        dp = new Integer[nums.length];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 1)
                dp = new Integer[nums.length];
            max = Math.max(max, loot(i, nums, i == 0 ? n - 1 : n));
        }
        return max;
    }


    public int loot(int index, int[] nums, int n) {
        if (index >= n)
            return 0;
        if (dp[index] != null)
            return dp[index];
        int max = 0;
        for (int i = index + 2; i < n; i++) {
            max = Math.max(max, loot(i, nums, n));
        }
        dp[index] = max + nums[index];
        return dp[index];
    }


}
