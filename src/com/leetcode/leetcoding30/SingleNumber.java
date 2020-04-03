package com.leetcode.leetcoding30;

public class SingleNumber {
    // XOR Gate, worked 
    // Hehe, it just came out of nowhere and striked
    public static int singleNumber(int[] nums) {
        int singleNumber = 0;
        for (int i = 0; i < nums.length ; i++)
          singleNumber = singleNumber ^ nums[i];
        return singleNumber;
    }


    public static void main(String[] args) {
        int[] TEST_CASE_01 = new int[]{2, 2, 1};
        int[] TEST_CASE_02 = new int[]{4,1,2,1,2};
        System.out.println(singleNumber(TEST_CASE_01));

    }

}
