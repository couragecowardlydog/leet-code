package com.leetcode.dp;

import java.util.Arrays;

/**
 * @author vivekanandan.sakthiv on Apr 2021
 */


public class Fibo {

    static int[] dp;

    public static int fibo(int n) {
        if ((n == 1) || (n == 2))
            return 1;
        if (dp[n] != -1)
            return dp[n];
        dp[n] = fibo(n - 1) + fibo(n - 2);
        return dp[n];

    }

    public static void main(String[] args) {
        int n = 6;
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(fibo(n));
    }
}
