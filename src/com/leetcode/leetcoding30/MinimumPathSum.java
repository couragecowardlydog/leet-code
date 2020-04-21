package com.leetcode.leetcoding30;

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

    public static int minPathSum(int[][] grid) {
        return minSum(grid, 0, 0);
    }

    /**
     * :( Time Limit started execeeding from test case 21
     */
    public static int minSum(int[][] grid, int i, int j) {
        if (i > grid.length - 1 || j > grid[0].length - 1)
            return Integer.MAX_VALUE;
        if (i == grid.length - 1 && j == grid[0].length - 1)
            return grid[i][j];
        return grid[i][j] + Math.min(minSum(grid, i + 1, j), minSum(grid, i, j + 1));
    }


    public static void main(String[] args) {
        int[][] mxn = {
                {1, 3, 19},
                {1, 5, 1},
                {14, 2, 1}
        };

        System.out.println(minPathSum(mxn));
    }
}
