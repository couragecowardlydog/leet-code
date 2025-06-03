package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class $78 {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] arr) {
        traverse(0, arr,  new LinkedList<>());
        return result;
    }

    private void traverse(int index, int[] arr, List<Integer> path) {
        if (path.size() <= arr.length) {
            result.add(new ArrayList<>(path));
        }
        if (arr.length == path.size())
            return;

        for (int i = index; i < arr.length; i++) {
            path.add(arr[i]);
            traverse(i + 1, arr, path);
            path.remove(path.size() - 1);
        }
    }
}
