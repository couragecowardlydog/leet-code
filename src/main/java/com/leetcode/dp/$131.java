package com.leetcode.dp;

import java.util.ArrayList;
import java.util.List;

public class $131 {

    String[][] dp;
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> partition(String s) {
        dp = new String[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                dp[i][j] = getString(s, i, j);
            }
        }
        traverse(0, 0, new ArrayList<>());
        return result;
    }

    private String getString(String s, int i, int j) {
        String substring = s.substring(i, j + 1);
        int left = 0, right = substring.length() - 1;
        while (left < right) {
            if (substring.charAt(left) != substring.charAt(right)) {
                return null;
            }
            left++;
            right--;
        }
        return substring;
    }


    private void traverse(int row, int col, List<String> path) {

        if (row == dp.length && col == dp[0].length) {
            result.add(new ArrayList<>(path));
        }
        for (int i = col; i < dp.length; i++) {
            if (dp[row][i] == null)
                continue;
            path.add(dp[row][i]);
            traverse(row + dp[row][i].length(), i + 1, path);
            path.remove(path.size() - 1);
        }

    }


    public static void main(String[] args) {
        $131 test = new $131();
        System.out.println(test.partition("bb"));
    }
}
