package com.leetcode.dp;

/**
 * @author vivekanandan.sakthiv on Apr 2021
 * <p>
 * Given two strings s and t, check if s is a subsequence of t.
 * <p>
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 100
 * 0 <= t.length <= 104
 * s and t consist only of lowercase English letters.
 */


public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        return find(s, t, 0, 0);
    }

    private static boolean find(String s, String t, int i, int j) {
        if (i == s.length())
            return true;
        if (j == t.length())
            return false;
        if (s.charAt(i) != t.charAt(j))
            return find(s, t, i, ++j);
        return find(s, t, ++i, ++j);
    }

    public static void main(String[] args) {
        String s = "abe";
        String t = "abcde";
        System.out.println(isSubsequence(s, t));
    }
}
