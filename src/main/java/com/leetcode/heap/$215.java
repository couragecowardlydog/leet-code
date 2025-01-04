package com.leetcode.heap;

import java.util.Arrays;

public class $215 {

    public int findKthLargest(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]++;
            System.out.println(nums[i]++);
        }
        System.out.println(Arrays.toString(nums));
        return nums[nums.length - k];
    }

    public int findKthLargest2(int[] nums, int k) {
        int[] arr = new int[20001];
        for (int num : nums) arr[num + 10000]++;
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > 0)
                k = k - arr[i];
            if (k <= 0)
                return i - 10000;
        }
        return -1;
    }


}
