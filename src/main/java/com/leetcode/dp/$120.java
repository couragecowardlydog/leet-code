package com.leetcode.dp;

import java.util.Arrays;
import java.util.List;

public class $120 {

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        dp[0][0] = triangle.get(0).get(0);

        for (int i = 1; i < n; i++) {
            dp[i][0] = triangle.get(i).get(0) + dp[i - 1][0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = Math.min(dp[i - 1][j - 1], j == i ? dp[i - 1][j - 1] : dp[i - 1][j]) + triangle.get(i).get(j);
            }
        }
        int min = dp[n - 1][0];
        for (int i = 1; i < n; i++)
            min = Math.min(min, dp[n - 1][i]);
        return min;
    }

    public static void main(String[] args) {
//        List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(2), Arrays.asList(3, 4), Arrays.asList(6, 5, 7), Arrays.asList(4, 1, 8, 3));
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(-10)
        );
        System.out.println(new $120().minimumTotal(nestedList));
    }


}
