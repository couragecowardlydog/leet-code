package com.leetcode.leetcoding30;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 *
 */
public class SingleNumber {


    /**
     *
     * XOR Gate,
     *
     * 1 XOR 1 is always 0
     * Finally we endup having only the single number
     *
     */
    public static int singleNumber(int[] nums) {
        int singleNumber = 0;
        for (int i = 0; i < nums.length ; i++)
          singleNumber = singleNumber ^ nums[i];
        return singleNumber;
    }


    public static void main(String[] args) {
        int[] TEST_CASE_01 = new int[]{2, 2, 1};
        int[] TEST_CASE_02 = new int[]{4,1,2,1,2};
        TEST_CASE_01[]
        System.out.println(singleNumber(TEST_CASE_01));

    }

}
