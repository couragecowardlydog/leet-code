package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $47 {

    List<List<Integer>> result = new ArrayList<>();
    int[] arr;
    int[] visited;
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        arr = nums;
        Arrays.sort(arr);
        visited = new int[arr.length];
        traverse();
        return result;
    }

    public void traverse() {
        if (path.size() == arr.length) {
            result.add(new ArrayList<>(path));
        }

        for (int i = 0; i < arr.length; i++) {
            if (visited[i] == 1)
                continue;
            path.add(arr[i]);
            visited[i] = 1;
            traverse();
            visited[i] = 0;
            path.remove(path.size() - 1);
            while (i < arr.length - 1 && arr[i] == arr[i + 1])
                i++;
        }

    }
}
