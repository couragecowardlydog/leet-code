package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class $70 {

    List<Integer> path = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        traverse(0, n, k);
        return result;
    }

    public void traverse(int index, int n, int k) {
        if (k == path.size()) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < n; i++) {
            path.add(i + 1);
            traverse(i + 1, n, k);
            path.remove(path.size() - 1);
        }
    }

}
