package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class $39 {


    int TARGET;
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new LinkedList<>();
    int[] ARR;
    int[] visited;
    List<int[]> visitedListed = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        TARGET = target;
        ARR = candidates;
        result.clear();
        visited = new int[candidates.length];
        traverse(0);
        return result;
    }

    public void traverse(int sum) {

        if (TARGET == sum) {
            boolean bool = true;
            for (int[] arr : visitedListed) {
                if (Arrays.equals(arr, visited)) {
                    bool = false;
                    break;
                }
            }

            if (bool) {
                result.add(List.copyOf(path));
                visitedListed.add(Arrays.copyOfRange(visited, 0, visited.length));
            }
            return;
        }

        if (TARGET < sum)
            return;

        for (int i = 0; i < ARR.length; i++) {
            path.add(ARR[i]);
            visited[i]++;
            traverse(sum + ARR[i]);
            visited[i]--;
            path.remove(path.size() - 1);
        }

    }
}
