package com.leetcode.dp;

public class $63 {


    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        int[][] dp = new int[rows][cols];
        dp[rows - 1][cols - 1] = 1;
        return getPath(0, 0, obstacleGrid, dp, rows, cols);
    }

    public int getPath(int row, int col, int[][] obstacleGrid, int[][] dp, int rows, int cols) {

        if (row == rows || col == cols)
            return 0;
        if (obstacleGrid[row][col] == 1) {
            dp[row][col] = -1;
            return 0;
        }
        if (dp[row][col] != 0)
            return dp[row][col] > 0 ? dp[row][col] : 0;
        dp[row][col] = getPath(row + 1, col, obstacleGrid, dp, rows, cols) + getPath(row, col + 1, obstacleGrid, dp, rows, cols);
        return dp[row][col];

    }

}
