package com.leetcode.arrays;

import java.util.Arrays;

public class $238 {

    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i] * prefix[i - 1];
        }
        suffix[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = nums[i] * suffix[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            int x = (i - 1) < 0 ? 1 : prefix[i - 1];
            int y = (i + 1) > nums.length - 1 ? 1 : suffix[i + 1];
            nums[i] = x * y;
        }

        return nums;
    }
}
