package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class $526 {

    int[] arr;
    List<Integer> permutations = new ArrayList<>();
    int result = 0;

    public int countArrangement(int n) {
        arr = new int[n];
        permutation();
        return result;
    }

    public void permutation() {
        if (permutations.size() == arr.length) {
            result++;
            return;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 1)
                continue;
            if (!validateConstraint(j + 1, permutations.size() + 1)) {
                continue;
            }
            arr[j] = 1;
            permutations.add(j + 1);
            permutation();
            arr[j] = 0;
            permutations.remove(permutations.size() - 1);
        }
    }

    private boolean validateConstraint(int value, int index) {
        if (value % index == 0 || index % value == 0)
            return true;
        return false;
    }
}
