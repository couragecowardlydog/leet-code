package com.leetcode.dp;

import java.util.Arrays;

/**
 * @author vivekanandan.sakthiv on Apr 2021
 * <p>
 * Given an integer n, return the number of strings of length n that consist only of vowels (a, e, i, o, u) and are lexicographically sorted.
 * <p>
 * A string s is lexicographically sorted if for all valid i, s[i] is the same as or comes before s[i+1] in the alphabet.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 1
 * Output: 5
 * Explanation: The 5 sorted strings that consist of vowels only are ["a","e","i","o","u"].
 * Example 2:
 * <p>
 * Input: n = 2
 * Output: 15
 * Explanation: The 15 sorted strings that consist of vowels only are
 * ["aa","ae","ai","ao","au","ee","ei","eo","eu","ii","io","iu","oo","ou","uu"].
 * Note that "ea" is not a valid string since 'e' comes after 'a' in the alphabet.
 * Example 3:
 * <p>
 * Input: n = 33
 * Output: 66045
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 50
 */


public class CountSortedVowelStrings {

    public static int countVowelStrings(int n) {
        if (n == 1)
            return 5;
        int size = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int[][] dp = new int[n + 1][vowels.length + 1];
        //base case
        for (int i = 1, j = 1; j < dp[0].length; j++) {
            dp[i][j] = j;
        }
        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j <= vowels.length; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }
        return dp[n][5];
    }

    public static void main(String[] args) {
        System.out.println(countVowelStrings(33));
    }
}
