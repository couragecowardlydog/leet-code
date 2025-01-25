package com.leetcode.slidingwindow;

public class $1493 {

    public int longestSubarray(int[] nums) {
        int i = 0;
        int j = 0;
        int max_streak = 0;
        int deleted = 0;
        int zero_index = -1;
        int k = 1;
        while (j < nums.length) {
            if (nums[j] == 1) {
                j++;
            } else {
                if (deleted == k) {
                    i = zero_index + 1;
                    deleted--;
                } else {
                    deleted++;
                    zero_index = j;
                    j++;
                }
            }
            max_streak = Math.max(max_streak, j - i - deleted);
        }

        return zero_index == -1 ? max_streak - 1 : max_streak;

    }
}
