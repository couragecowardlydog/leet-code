package com.leetcode.datastructures;

/**
 * @author vivekanandan.sakthiv on Oct 2021
 */


public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int max_ending_here = nums[0];
        int max_so_far = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max_ending_here = Math.max(nums[i], nums[i] + max_ending_here);
            max_so_far = Math.max(max_ending_here, max_so_far);
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
