package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class $39 {


    int TARGET;
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new LinkedList<>();
    int[] ARR;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ARR = candidates;
        TARGET = target;
        traverse(0, 0);
        return result;
    }

    public void traverse(int index, int sum) {

        if (sum == TARGET) {
            result.add(new ArrayList<>(path));
            return;
        }
        if (index >= ARR.length)
            return;
        if (sum > TARGET)
            return;
        System.out.println(sum);
        path.add(ARR[index]);
        traverse(index, sum + ARR[index]);
        path.remove(path.size() - 1);
        traverse(index + 1, sum);

    }

}
