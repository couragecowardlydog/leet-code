package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class $526 {

    int[] arr;
    int[] visited;
    List<Integer> permutations = new ArrayList<>();
    int result = 0;

    public int countArrangement(int n) {
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        permutation();
        return result;
    }

    public void permutation() {
        if (permutations.size() == visited.length) {
            result++;
            return;
        }
        for (int j = 0; j < arr.length; j++) {
            if (visited[j] == 1)
                continue;
            if (!validateConstraint(arr[j], permutations.size() + 1)) {
                continue;
            }
            visited[j] = 1;
            permutations.add(arr[j]);
            permutation();
            visited[j] = 0;
            permutations.remove(permutations.size() - 1);
        }
    }

    private boolean validateConstraint(int value, int index) {
        if (value % index == 0 || index % value == 0)
            return true;
        return false;
    }
}
