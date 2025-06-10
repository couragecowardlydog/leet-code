package com.leetcode.dp;

import java.util.Arrays;

public class $55 {


    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[dp.length - 1] = true;
        for (int i = dp.length - 1; i >= 0; i--) {
            int end = i + nums[i];
            for (int j = i; j <= end; j++) {
                if (dp[j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
//        System.out.println(Arrays.toString(dp));
        return dp[0];
    }

    public static void main(String[] args) {
        System.out.println(new $55().canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(new $55().canJump(new int[]{3, 2, 1, 0, 4}));
        System.out.println(new $55().canJump(new int[]{2, 5, 0, 0}));
        System.out.println(new $55().canJump(new int[]{2, 0, 0}));
        System.out.println(new $55().canJump(new int[]{3, 2, 1, 0, 4}));
        System.out.println(new $55().canJump(new int[]{1, 1, 2, 2, 0, 1, 1}));
    }
}
