package com.leetcode.twopointers;

import java.util.Arrays;

public class $283 {

    public int[] moveZeroes(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int j = i;
            if (nums[i] == 0) {
                while (j < nums.length - 1 && nums[j] == 0) {
                    j++;
                }
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
            i++;
        }

        /**
         * 0ms running time from leet
         int i = 0;
         int j = 0;
         while (i < nums.length) {
         if (nums[i] != 0) {
         int temp = nums[i];
         nums[i] = nums[j];
         nums[j] = temp;
         j++;
         }
         i++;
         }

         return nums;
         **/
    }

}
