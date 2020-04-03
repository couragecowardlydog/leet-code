package com.leetcode.leetcoding30;

/**
 * Write an algorithm to determine if a number is "happy".
 * <p>
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 * <p>
 * Example:
 * <p>
 * Input: 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
public class HappyNumber {

    public static boolean isHappy(int n) {

        System.out.println(n);
        if (n < 10 && (n == 1 || n == 7))
            return true;
        else if (n < 10)
            return false;

        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10,2);
            n /= 10;
        }

        return isHappy(sum);
    }

    public static void main(String[] args) {
        System.out.println(isHappy(13));
    }
}
