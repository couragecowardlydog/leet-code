package com.leetcode.dp;

import java.util.Arrays;

public class $72 {


    // Ref :  https://web.stanford.edu/class/cs124/lec/med.pdf
    public int minDistance(String source, String target) {
        int m = source.length();
        int n = target.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++)
            dp[0][j] = j;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int path1 = dp[i - 1][j];
                int path2 = dp[i][j - 1];
                int path3 = dp[i - 1][j - 1];
                if (source.charAt(i - 1) == target.charAt(j - 1)) {
                    dp[i][j] = path3;
                } else {
                    dp[i][j] = 1 + Math.min(path3, Math.min(path1, path2));
                }
            }
        }

        for (int i = 0; i <= m; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        $72 dp = new $72();
//        dp.minDistance("algorithm", "altruistic");
        dp.minDistance("intention", "extension");
    }
}
