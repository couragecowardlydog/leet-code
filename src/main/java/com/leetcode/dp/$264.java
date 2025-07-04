package com.leetcode.dp;

import java.util.*;

public class $264 {


    public int nthUglyNumber(int n) {
        Set<Integer> set = new TreeSet<>();

        List<Integer> list2 = new ArrayList<>(List.of(1));
        List<Integer> list3 = new ArrayList<>(List.of(1));
        List<Integer> list5 = new ArrayList<>(List.of(1));

        while (set.size() <= n) {


            set.addAll(list2);
            set.addAll(list3);
            set.addAll(list5);
        }

        return 1;
    }

    public static void main(String[] args) {
        $264 obj = new $264();
        System.out.println(obj.nthUglyNumber(10));
    }
}
