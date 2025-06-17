package com.leetcode.dp;

import java.util.Arrays;

public class $91 {

    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);
        return traverse(0, s, dp);
    }

    public int traverse(int i, String s, int[] dp) {
        if (i == s.length())
            return 1;
        if (s.charAt(i) == '0')
            return 0;
        if (dp[i] != -1)
            return dp[i];
        int sum = traverse(i + 1, s, dp);
        if (i + 2 <= s.length()) {
            int num = (s.charAt(i) -'0') +(s.charAt(i + 1) - '0');
            if (num < 27)
                sum += traverse(i + 2, s, dp);
        }
        dp[i] = sum;
        return dp[i];
    }

    public static void main(String[] args) {
        $91 obj = new $91();
        System.out.println("Result:" + obj.numDecodings("111111111111111111111111111111111111111111111"));
    }
}
