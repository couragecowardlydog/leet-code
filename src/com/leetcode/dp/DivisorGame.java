package com.leetcode.dp;

/**
 * @author vivekanandan.sakthiv on Apr 2021
 * <p>
 * Alice and Bob take turns playing a game, with Alice starting first.
 * <p>
 * Initially, there is a number n on the chalkboard. On each player's turn, that player makes a move consisting of:
 * <p>
 * Choosing any x with 0 < x < n and n % x == 0.
 * Replacing the number n on the chalkboard with n - x.
 * Also, if a player cannot make a move, they lose the game.
 * <p>
 * Return true if and only if Alice wins the game, assuming both players play optimally.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 2
 * Output: true
 * Explanation: Alice chooses 1, and Bob has no more moves.
 * Example 2:
 * <p>
 * Input: n = 3
 * Output: false
 * Explanation: Alice chooses 1, Bob chooses 1, and Alice has no more moves.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 1000
 */


public class DivisorGame {

    public static boolean divisorGame(int n) {
        int iteration = 0;
        while (n > 1) {
            int x = getNumber(n);
            n -= x;
            iteration++;
        }
        return iteration % 2 != 0;

    }

    public static int getNumber(int n) {
        int x = 1;
        while (n % x != 0)
            x--;
        return x;

    }


    public static void main(String[] args) {
        System.out.println(divisorGame(999));
    }
}
