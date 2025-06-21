package com.leetcode.dp;

import java.util.Arrays;

public class $152 {

    public int maxProduct(int[] nums) {
        int MAX = Integer.MIN_VALUE;
        int dp[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = nums[i];
            MAX = Math.max(MAX, nums[i]);
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = i; j < dp.length; j++) {
                dp[j] = dp[j] * nums[j - i];
                MAX = Math.max(MAX, dp[j]);
            }
        }

        return MAX;

    }

    public static void main(String[] args) {
        $152 obj = new $152();
        System.out.println(obj.maxProduct(new int[]{2, 3, -2, 4}));
        System.out.println(obj.maxProduct(new int[]{-2, 0, -1}));
        System.out.println(obj.maxProduct(new int[]{-2, 0, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4}));
        System.out.println(obj.maxProduct(new int[]{2, 3, 4, 6, 0, 1, 2}));
    }
}
