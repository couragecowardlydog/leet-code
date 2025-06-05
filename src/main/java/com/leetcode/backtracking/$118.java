package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $118 {


    public static void main(String[] args) {
        $118 sol = new $118();
        System.out.println(sol.generate(5));
    }

    public List<List<Integer>> generate(int input) {
        List<List<Integer>> result = new ArrayList<>();
        Integer[] M1 = new Integer[]{1};
        Integer[] M2 = new Integer[]{1, 1};
        if (input >= 1) {
            result.add(Arrays.asList(M1));
        }
        if (input >= 2) {
            result.add(Arrays.asList(M2));
        }
        for (int i = 2; i < input; i++) {
            // input 3
            List<Integer> list = new ArrayList<>();
            List<Integer> prev = result.get(i - 1);
            list.add(1);
            System.out.println(i - 1);
            for (int j = 1; j < i; j++) {
                list.add(prev.get(j) + prev.get(j - 1));
            }
            list.add(1);
            result.add(list);

        }

        return result;

    }
}
