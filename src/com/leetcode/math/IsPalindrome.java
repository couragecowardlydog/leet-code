package com.leetcode.math;

public class IsPalindrome {

    public static boolean isPalindrome(int x) {
        if ((x < 0) || (x > 2147447412))
            return false;
        int reverse = 0;
        int copy = x;
        while (x > 0) {
            reverse = (reverse * 10) + (x % 10);
            x /= 10;
        }
        return copy == reverse;
    }

    public static boolean isPalindrome(int x, boolean isSolution) {
        if ((x < 0))
            return false;
        int reverse = 0;
        while (x > reverse) {
            reverse = (reverse * 10) + (x % 10);
            x /= 10;
        }
        return x == reverse || reverse / 10 == x;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(2000000002, true));
        System.out.println(isPalindrome(515, true));
    }
}
