package com.leetcode.leetcoding30;

/**
 *
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 *
 * Note: You can only move either down or right at any point in time.
 *
 * Example:
 *
 * Input:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * Output: 7
 * Explanation: Because the path 1→3→1→1→1 minimizes the sum.
 * 
 *
 */
public class MinimumPathSum {

    public static int minPathSum(int[][] grid) {
        return minSum(grid, 0, 0);
    }

    /**
     *
     * :( Time Limit started execeeding from test case 21
     */
    public static int minSum(int[][] grid, int i, int j) {
        if (i > grid.length - 1)
            return Integer.MAX_VALUE - grid[i - 1][j];
        if (j > grid[0].length - 1)
            return Integer.MAX_VALUE - grid[i][j - 1];
        if (i == grid.length - 1 && j == grid[0].length - 1)
            return grid[i][j];
        return Math.min(grid[i][j] + minSum(grid, i + 1, j), grid[i][j] + minSum(grid, i, j + 1));
    }


    public static void main(String[] args) {
        int[][] mxn = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        System.out.println(minPathSum(mxn));
    }
}
