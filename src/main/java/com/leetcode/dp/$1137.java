package com.leetcode.dp;

public class $1137 {


    public int tribonacci(int n) {
        return calc(n, new int[n]);
    }

    public int calc(int n, int[] cache) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        if (cache[n - 1] != 0) {
            return cache[n - 1];
        }

        cache[n - 1] = calc(n - 1, cache) + calc(n - 2, cache) + calc(n - 3, cache);
        return cache[n - 1];
    }

}
