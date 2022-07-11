package com.leetcode.math;


public class Sqrt {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        while (low <= high) {
            long mid = (high + low) / 2;
            if (mid * mid > x)
                high = (int) mid - 1;
            else
                low = (int) mid + 1;
        }
        return high;
    }
}
