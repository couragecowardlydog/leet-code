package com.leetcode.binarysearch;

public class $162 {

    public int findPeakElement(int[] nums) {
        return binarySearch(nums);
    }

    public int binarySearch(int[] nums) {
        int left = 0;
        int n = nums.length;
        int right = n - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] > (n == mid ? -1 : nums[mid + 1]) && nums[mid] > (mid == 0 ? -1 : nums[mid - 1])) {
                return mid;
            }

            if (nums[mid + 1] > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return left;

    }
}
