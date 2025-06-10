package com.leetcode.dp;

import java.util.Arrays;

public class $45 {


    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        for (int i = nums.length - 2; i >= 0; i--) {
            int required = nums.length - i - 1;
            if (nums[i] >= required) {
                dp[i] = 1;
            } else {
                // find min
                int jumps = Integer.MAX_VALUE;
                int end = i + nums[i];
                for (int j = i + 1; j <= end; j++) {
                    jumps = Math.min(dp[j], jumps);
                }
                dp[i] = jumps + 1;
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[0];

    }


}
