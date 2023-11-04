package com.leetcode.math;

/***
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * Input: -123
 * Output: -321
 * Example 3:
 *
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class ReverseInteger {

    public static int reverse(int x) {
        boolean isNegative = x <= 0;
        int reverse = 0;
        x = Math.abs(x);
        int overflowIndicator = (Integer.MAX_VALUE / 10);
        while (x > 0) {

            /**
             * Added to pass edge cases that caused Integer overflow,
             * Size of 32 bit Integer is 2 pow 31 >> 2147483647
             * Last loop may cause overflow of integer, where rev >  214748364
             *
             * Case 1:
             *   rev = 214748364, then rev * 10 = 2147483640 and if x%10>7, overflow happens
             *
             * Case 2:
             *   rev > 214748364, then rev * 10 + x %10 overflows integer and takes to negative number
             *   2147483647 + 1 = -2147483648 , adding one flips all bits & 31 bit is on which represent -2147483648 (2's compliment)
             *
             */
            int mod = x % 10;
            if (((reverse == overflowIndicator) && (mod > 7)) || (reverse > overflowIndicator))
                return 0;
            reverse = reverse * 10 + mod;
            x /= 10;
        }
        return isNegative ? reverse * -1 : reverse;
    }

    public static void main(String[] args) {
//        System.out.println(2147483647 + 1);
        System.out.println(reverse(1534236469));
    }
}
