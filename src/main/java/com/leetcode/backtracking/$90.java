package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class $90 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new LinkedList<>();
    int[] arr;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        arr = nums;
        Arrays.sort(arr);
        traverse(0);
        return result;
    }

    public void traverse(int index) {
        if (index > arr.length)
            return;
        result.add(new ArrayList<>(path));
        for (int i = index; i < arr.length; i++) {
            path.add(arr[i]);
            traverse(i + 1);
            path.remove(path.size() - 1);
            while (i < arr.length - 1 && arr[i] == arr[i + 1])
                i++;
        }
    }
}