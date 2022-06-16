package com.leetcode.leetcoding30;

import java.util.HashMap;
import java.util.Map;

public class CountingElements {

    public static int countElements(int[] arr) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], 0);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i] + 1))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2};
        System.out.println(countElements(arr));

    }
}
