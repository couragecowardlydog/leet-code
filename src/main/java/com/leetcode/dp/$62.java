package com.leetcode.dp;

public class $62 {

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[m - 1][n - 1] = 1;
        return getPath(0, 0, m, n, dp);
    }

    public int getPath(int row, int col, int m, int n, int[][] dp) {
        if (row >= m)
            return 0;
        if (col >= n)
            return 0;
        if (dp[row][col] != 0)
            return dp[row][col];
        dp[row][col] = getPath(row + 1, col, m, n, dp) + getPath(row, col + 1, m, n, dp);
        return dp[row][col];
    }


}
