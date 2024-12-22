package com.leetcode.dp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

public class PascalTriangle {

    public static long[] fact = new long[31];

    public List<List<Integer>> generate(int input) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < input; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                row.add(coefficient(i, j));
            }
            result.add(row);
        }
        return result;
    }

    public static int coefficient(int n, int k) {
        long s = factorial(n) / factorial(n - k);
        s = s / factorial(k);
        return (int) s;

    }

    public static long factorial(int n) {
        if (fact[n] != 0)
            return fact[n];
        fact[n] = LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);
        return fact[n];
    }
}
