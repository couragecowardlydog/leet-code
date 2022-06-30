package com.leetcode.arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {
            if (nums[slow] == val) {
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
            }
            if (nums[slow] != val) {
                slow++;
            }
            ++fast;
        }
        if (slow == 0) {
            nums = new int[]{};
        }
        return slow;
    }
}
