package com.leetcode.slidingwindow;

public class $1004 {


    // brute force
    public int bruteforce(int[] nums, int k) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int flipped = 0;
            int current = 0;
            int j = i;
            while (flipped < k && j < nums.length) {
                if (nums[j] == 0) {
                    flipped++;
                }
                current++;
                j++;
            }
            while (j < nums.length && nums[j] == 1) {
                current++;
                j++;
            }
            max = Math.max(max, current);
            System.out.println("iteration " + i);
            System.out.println("max " + max);
            if (j == nums.length) {
                break;
            }
        }
        return max;
    }

    public int longestOnes(int[] nums, int k) {
        int max_streak = 0;
        int flipped = 0;
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[j] == 1) {
                j++;
            } else {
                if (flipped == k) {
                    while (flipped == k) {
                        if (nums[i] == 0)
                            flipped--;
                        i++;
                    }
                } else {
                    flipped++;
                    j++;
                }
            }
            max_streak = Math.max(max_streak, j - i);
        }
        return max_streak;
    }
}
