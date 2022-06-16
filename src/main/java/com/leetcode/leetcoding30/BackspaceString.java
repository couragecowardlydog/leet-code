package com.leetcode.leetcoding30;

/**
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
 * <p>
 * Example 1:
 * <p>
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 * Example 2:
 * <p>
 * Input: S = "ab##", T = "c#d#"
 * Output: true
 * Explanation: Both S and T become "".
 * Example 3:
 * <p>
 * Input: S = "a##c", T = "#a#c"
 * Output: true
 * Explanation: Both S and T become "c".
 * Example 4:
 * <p>
 * Input: S = "a#c", T = "b"
 * Output: false
 * Explanation: S becomes "c" while T becomes "b".
 * Note:
 * <p>
 * 1 <= S.length <= 200
 * 1 <= T.length <= 200
 * S and T only contain lowercase letters and '#' characters.
 * Follow up:
 * <p>
 * Can you solve it in O(N) time and O(1) space?
 */
public class BackspaceString {

    public static boolean backspaceCompare(String S, String T) {

        int i, j;
        i = nextIndex(S, S.length() - 1);
        j = nextIndex(T, T.length() - 1);

        while (i >= 0 && j >= 0) {
            if (S.charAt(i) != T.charAt(j))
                return false;
            i = nextIndex(S, i - 1);
            j = nextIndex(T, j - 1);
        }

        return i == -1 && j == -1;
    }


    public static int nextIndex(String str, int index) {
        int backSpaces = 0;
        while (index >= 0 && (backSpaces > 0 || str.charAt(index) == '#')) {
            if (str.charAt(index) == '#') {
                backSpaces++;
            } else {
                backSpaces--;
            }
            index--;
        }
        return index;
    }

    public static void main(String[] args) {
        /*System.out.println(backspaceCompare("ab#c", "ad#c"));
//
        System.out.println(backspaceCompare("a#c", "b"));
        System.out.println(backspaceCompare("ac", "bc"));
        System.out.println(backspaceCompare("ac##", "bc##"));
        System.out.println(backspaceCompare("a#b#", "a#b#"));
        System.out.println(backspaceCompare("a#b#c", "a#b#c"));*/
//        System.out.println(backspaceCompare("ab##", "c#d#"));


//        System.out.println(backspaceCompare("atw", "bxo#j##tw"));
        System.out.println(backspaceCompare("ab##", "c#d#"));
    }
}
