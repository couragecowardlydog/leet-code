package com.leetcode.arrays;


public class $334 {

    public boolean increasingTriplet(int[] nums) {

        if (nums.length < 3) return false;

        int i = 0;
        int j = 1;
        int k = 2;

        if (nums[i] < nums[j] && nums[j] < nums[k]) {
            return true;
        }

        while (k <= nums.length - 1 && j < nums.length - 2 && i < nums.length - 3) {
            if (!(nums[j] < nums[k])) {
                int temp = k;
                int maxIndex = k;
                while (temp < nums.length - 1) {
                    temp++;
                    maxIndex = nums[temp] > nums[maxIndex] ? temp : maxIndex;
                }
                k = nums[maxIndex] > nums[temp] ? maxIndex : temp;

            }

            if (!((nums[i] < nums[j]) && (nums[j] < nums[k]))) {
                int temp = j;
                if (k - j == 1) k++;
                while (temp < k - 1) {
                    if (nums[temp] < nums[k]) {
                        break;
                    }
                    temp++;
                }
                j = temp;
            }

            if (!(nums[i] < nums[j])) {
                if (j - i == 1) {
                    j++;
                }
                int temp = i + 1;
                while (temp < j - 1 && nums[temp] > nums[j]) {
                    temp++;
                }
                i = temp;
            }

            if (nums[i] < nums[j] && nums[j] < nums[k]) {
                return true;
            }
        }
        return false;
    }


}
