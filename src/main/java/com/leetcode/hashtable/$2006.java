package com.leetcode.hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class $2006 {

    public int countKDifference(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        Integer[] key = map.keySet().toArray(new Integer[0]);
        for (int i = 0; i < key.length; i++) {
            for (int j = i + 1; j < key.length; j++)
                if (key[i] - key[j] == k)
                    count += Math.abs(map.get(key[i]) - map.get(key[j]));
        }
        return count;
    }

}
