package com.leetcode.code;

import java.util.HashMap;
import java.util.Map;

public class $169 {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], ((int) map.getOrDefault(nums[i], 0) + 1));
        }
        int max = Integer.MIN_VALUE;
        int k = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                k = (int) entry.getKey();
            }
        }
        return k;
    }
}
