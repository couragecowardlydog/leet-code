package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $40 {

    int TARGET;
    int[] ARR;
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        TARGET = target;
        ARR = candidates;
        Arrays.sort(ARR);
        traverse(0, 0);
        return result;
    }

    public void traverse(int index, int sum) {
//        System.out.println(path);
        if (TARGET == sum) {
            result.add(new ArrayList<>(path));
            return;
        }

        if (sum > TARGET)
            return;

        for (int i = index; i < ARR.length; i++) {
            path.add(ARR[i]);
            traverse(i + 1, sum + ARR[i]);
            path.remove(path.size() - 1);
            // move to next candidate
            while (i < ARR.length - 1 && ARR[i] == ARR[i + 1]) {
                i++;
            }
            System.out.println(Arrays.toString(path.toArray()));
        }
    }
}
