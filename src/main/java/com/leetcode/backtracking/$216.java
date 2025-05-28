package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class $216 {

    List<List<Integer>>  result = new ArrayList<>();
    List<Integer> path = new LinkedList<>();
    int[] arr = new int[9];
    int LIST_SIZE;
    int TARGET;

    public List<List<Integer>> combinationSum3(int k, int n) {
        LIST_SIZE = k;
        TARGET = n;
        traverse(0, 0);
        return result;
    }

    private void traverse(int j, int sum) {
        if (LIST_SIZE == path.size()) {
            if (sum == TARGET) {
                result.add(List.copyOf(path));
            }
            return;
        }
        for (int i = j; i < arr.length; i++) {
            if (arr[i] == 1)
                continue;
            if (sum + i + 1 > TARGET)
                continue;
            arr[i] = 1;
            path.add(i + 1);
            traverse(i + 1, sum + i + 1);
            path.remove(path.size() - 1);
            arr[i] = 0;
        }


    }


}
