package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class $46 {


    List<Integer> path = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();
    int[] arr;
    int[] visited;


    public List<List<Integer>> permute(int[] nums) {
        arr = nums;
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
        }

    }
}
