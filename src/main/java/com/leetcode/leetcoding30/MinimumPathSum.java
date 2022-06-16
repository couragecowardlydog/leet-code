package com.leetcode.leetcoding30;

import java.util.Arrays;

/**
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 * <p>
 * Note: You can only move either down or right at any point in time.
 * <p>
 * Example:
 * <p>
 * Input:
 * [
 * [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * Output: 7
 * Explanation: Because the path 1→3→1→1→1 minimizes the sum.
 */
public class MinimumPathSum {


    /**
     * :( Time Limit started execeeeeeeeeeeeding from test case 21
     */
    public static int minSum(int[][] grid, int i, int j) {
        if (i > grid.length - 1 || j > grid[0].length - 1)
            return Integer.MAX_VALUE;
        if (i == grid.length - 1 && j == grid[0].length - 1)
            return grid[i][j];
        return grid[i][j] + Math.min(minSum(grid, i + 1, j), minSum(grid, i, j + 1));
    }


    /**
     * DP Iterative
     * @return
     */
    public static int minPathSum(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        int[][] cost = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                /**
                 * Cost of reaching (i,j) is (i-1,j) or (i,j-1)
                 */
                if ((i - 1 >= 0) && (j - 1 >= 0))
                    cost[i][j] = Math.min(cost[i - 1][j], cost[i][j - 1]) + grid[i][j];
                else if ((i - 1 >= 0) && (j - 1 < 0))
                    cost[i][j] = cost[i - 1][j] + grid[i][j];
                else if ((i - 1 < 0) && (j - 1 >= 0))
                    cost[i][j] = cost[i][j - 1] + grid[i][j];
                else
                    cost[i][j] = grid[i][j];

            }
        }
        return cost[rows - 1][cols - 1];
    }


    public static void main(String[] args) {
        int[][] mxn = {
                {1, 3, 1},
                {1, 5, 1},
                {14, 2, 1}
        };

        minPathSum(mxn);

    }
}
