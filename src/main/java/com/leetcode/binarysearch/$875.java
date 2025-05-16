package com.leetcode.binarysearch;

public class $875 {

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = (int) Math.pow(10, 9);
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (findK(piles, mid, h)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean findK(int[] piles, long i, int h) {
        int k = 0;
        for (int pile : piles) {
            k += (pile + i - 1) / i;
            if (k > h)
                return false;
        }
        return true;
    }
}
