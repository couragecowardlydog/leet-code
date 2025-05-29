package com.leetcode.backtracking;

import java.util.Arrays;
import java.util.List;

public class $3376 {

    Integer[] arr;
    int[] visited;
    int K;
    int RESULT = Integer.MAX_VALUE;

    public int findMinimumTime(List<Integer> strength, int k) {
        arr = strength.toArray(new Integer[0]);
        K = k;
        RESULT = Integer.MAX_VALUE;
        visited = new int[arr.length];
        traverse(0, 1, 0);
        return RESULT;
    }

    public void traverse(int count, int x, int times) {
        if (count == arr.length) {
            RESULT = Math.min(RESULT, times);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (visited[i] == 1)
                continue;
            visited[i] = 1;
            int val = arr[i];
            int dash = (val / x) + (val % x == 0 ? 0 : 1);
            traverse(count + 1, x + K, times + dash);
            visited[i] = 0;
        }

    }

}
