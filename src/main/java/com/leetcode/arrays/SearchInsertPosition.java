package com.leetcode.arrays;

public class SearchInsertPosition {


    public int searchInsert(int[] nums, int target) {
        if (target <= nums[0])
            return 0;
        if (target > nums[nums.length - 1])
            return nums.length ;

        int previousMid = Integer.MAX_VALUE;
        int right = 0;
        int left = nums.length;
        int mid = 0;

        while (mid >= 0) {
            mid = (right + left) / 2;
            if (nums[mid] == target)
                return mid;
            if (previousMid - mid == 1) {
                return nums[mid] < target ? previousMid : mid;
            }
            if (nums[mid] > target)
                left = mid;
            if (nums[mid] < target)
                right = mid;
            previousMid = mid;
        }
        return mid;
    }
}
