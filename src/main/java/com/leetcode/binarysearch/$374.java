package com.leetcode.binarysearch;

public class $374 {

    /**
     * Problem is pretty straight forward , all we have to do a binary search
     * reducing the search space by half each time.
     * <p>
     * Initialize start as 1
     * Initialize end as n
     * <p>
     * Computed mid = (start + end) / 2
     * pass guess as mid and pivot
     * <p>
     * 1. If guess returns 0 --> return mid
     * 2. If guess returns -1 --> start remain same , end as mid-1
     * 3. If guess returns 1 --> end remain same , start as mid+1
     */
    public int guess(int x) {
        return 0;
    }

    public int guessNumber(int n) {
        int start = 0;
        int end = n;
        while (true) {
            int mid = start + (end - start) / 2;
            int g = guess(mid);
            if (g == 0) {
                return mid;
            }else if (g == 1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
}
