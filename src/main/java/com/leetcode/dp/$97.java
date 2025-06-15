package com.leetcode.dp;

import java.util.Arrays;

public class $97 {

    private Boolean[][] memo;

    public boolean isInterleave(String a, String b, String c) {
        this.memo = new Boolean[a.length() + 1][b.length() + 1];
        if (a.length() + b.length() != c.length()) return false;
        return traverse(0, 0, a, b, c);
    }


    public boolean traverse(int row, int column, String a, String b, String c) {
        if (row == a.length() && column == b.length())
            return true;
        if (memo[row][column] != null)
            return memo[row][column];
        boolean result = false;
        int k = row + column;
        char targetChar = c.charAt(k);
        if (row < a.length() && a.charAt(row) == targetChar) {
            result = traverse(row + 1, column, a, b, c);
        }
        if (!result && column < b.length() && b.charAt(column) == targetChar) {
            result = traverse(row, column + 1, a, b, c);
        }
        return memo[row][column] = result;
    }


    public static void main(String[] args) {
        $97 obj = new $97();
        System.out.println(obj.isInterleave(
                "aabcc",
                "dbbca",
                "aadbbcbcac"
        ));
    }
}
