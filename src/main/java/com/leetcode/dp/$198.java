package com.leetcode.dp;

import java.util.Arrays;

public class $198 {

    int[] dp;

    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return Math.max(loot(0, nums), loot(1, nums));
    }


    public int loot(int index, int[] nums) {
        if (index >= nums.length)
            return 0;
        if (dp[index] != -1)
            return dp[index];
        int max = 0;
        for (int i = index + 2; i < nums.length; i++) {
            max = Math.max(max, loot(i, nums));
        }
        dp[index] = max + nums[index];
        return dp[index];
    }

    public static void main(String[] args) {
        $198 obj = new $198();
        System.out.println("Result:" + obj.rob(new int[]{2, 1, 1, 2}));
        System.out.println("Result:" + obj.rob(new int[]{2, 7, 9, 3, 1}));
        System.out.println("Result:" + obj.rob(new int[]{1, 2, 3, 1}));
    }

}
