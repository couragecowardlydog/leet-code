package com.leetcode.leetcoding30;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * Example:
 * <p>
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 * <p>
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class MaximumSubarray {


    // Kandane's Algorithm
    public int maxSubArray(int[] nums) {

        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;

        for (int i = 0; i < nums.length; i++) {
            max_ending_here = Math.max(nums[i], max_ending_here + nums[i]);
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
        }

        return max_so_far;

    }

    public static void main(String[] args) {
        int[] TEST_CASE = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

    }
}
