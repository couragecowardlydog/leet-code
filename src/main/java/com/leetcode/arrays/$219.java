package com.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class $219 {

    /**
     * Find if there is a number in index that is seperated by distance 1 <= k
     *
     * @param nums
     * @param k
     * @return
     */

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
                continue;
            }
            if ((i - map.get(nums[i])) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;

    }

    public static void main(String[] args) {
        $219 obj = new $219();
//        System.out.println(obj.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        System.out.println(obj.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }
}
