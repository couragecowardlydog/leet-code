package com.leetcode.dp;

import java.util.Arrays;

public class $5 {

    boolean[][] dp;
    char[] arr;

    public String longestPalindrome(String s) {
        dp = new boolean[s.length()][s.length()];
        arr = s.toCharArray();
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            dp[i][i] = true;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                dp[i][i + 1] = true;
                start = i;
                end = i + 1;
            }
        }

        for (int diff = 2; diff < s.length(); diff++) {
            for (int i = 0; i < s.length() - diff; i++) {
                int j = i + diff;
                if ((arr[i] == arr[j]) && (dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    start = i;
                    end = j;

                }
            }
        }

        return s.substring(start, end + 1);

    }


}
