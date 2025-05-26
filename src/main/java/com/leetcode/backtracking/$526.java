package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class $526 {


    public static void main(String[] args) {
        $526 solution = new $526();
        int n = 3; // Example input
        int result = solution.countArrangement(n);
    }

    int[] arr;

    public int countArrangement(int n) {
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        permutation(0, n, new ArrayList<>(n));
        return 0;
    }

    public void permutation(int i, int n, List<Integer> list) {
        if (list.size() == n) {
            return;
        }
        list.add(arr[i]);
        for (int j = 0; j < n; j++) {
            if(j == i)
                continue;
            System.out.println(list);
            permutation(j , n, list);
            list.remove(list.size() - 1);
        }


    }
}
