package com.leetcode.arrays;

public class $219 {

    /**
     * Find if there is a number in index that is seperated by distance 1 <= k
     *
     * @param nums
     * @param k
     * @return
     */

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int distance = 1;
        while (distance <= k) {
            int i = 0;
            int j = i + distance;
            while (j < nums.length) {
                if (nums[i] == nums[j])
                    return true;
                i++;
                j++;
            }
            distance++;
        }
        return false;

    }
}
