package com.leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;

public class $1207 {

    public boolean uniqueOccurrences(int[] arr) {
        boolean result = true;
        int[] values = new int[2001];
        for (int i = 0; i < arr.length; i++)
            values[arr[i] + 1000]++;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0)
                continue;
            if (set.contains(values[i])) {
                return false;
            }
            set.add(values[i]);
        }

        return result;
    }
}
