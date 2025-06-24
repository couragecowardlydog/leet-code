package com.leetcode.dp;

import java.util.Arrays;

public class $221 {


    int m;
    int n;
    char[][] matrix;
    int[][] dp;

    public int maximalSquare(char[][] matrix) {
        m = matrix.length;
        n = matrix[0].length;
        dp = new int[m][n];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        this.matrix = matrix;
        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') {
                    int val = traverse(i, j);
                    result = Math.max(val , result);
                }
            }
        }
        return result;
    }

    public int traverse(int i, int j) {
        if (i >= m || j >= n)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        if (matrix[i][j] == '1') {
            int xi = 1 + traverse(i + 1, j);
            int xj = 1 + traverse(i, j + 1);
            int xk = 1 + traverse(i + 1, j + 1);
            dp[i][j] = Math.min(xi, Math.min(xj, xk));
        } else {
            dp[i][j] = 0;
        }
        return dp[i][j];
    }

}
