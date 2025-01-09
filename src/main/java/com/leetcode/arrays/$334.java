package com.leetcode.arrays;

import java.util.Map;

public class $334 {

    public boolean increasingTriplet(int[] nums) {

        if (nums.length < 3)
            return false;

        int i = 0;
        int j = 1;
        int k = 2;

        if (nums[i] < nums[j] && nums[j] < nums[k]) {
            return true;
        }

        k++;

        while (k < nums.length && j < nums.length - 1 && i < nums.length - 2) {

            if (nums[i] < nums[j] && nums[j] < nums[k]) {
                return true;
            }

            if (nums[j] >= nums[k]) {
                if (k - j > 1)
                    j++;
                else {
                    int temp = k;
                    while (k < nums.length && nums[temp] <= nums[k]) {
                        temp++;
                    }
                    k = temp;
                }

                System.out.println("1 nd loop");
//                continue;
            } else if (nums[i] >= nums[j]) {
                if (j - i > 1)
                    i++;
                else if (k - j > 1)
                    j++;
                else
                    k++;
                System.out.println("2 nd loop");
//                continue;
            }

//            if(nums[i] > nums[k]){
//                k++;
//            }


            System.out.println("i " + i + " j " + j + " k " + k);

        }


        return false;
    }


}
