package com.misc;

/**
 * Maximum difference of products of two disjoint non-consecutive pairs.
 * <p>
 *  • Array length must be ≥ 9.
 *  • All elements are positive.
 *  • The two indices in each pair must be at least 2 apart,
 *    and the two pairs themselves must also be at least 2 apart.
 *
 *  Time  : O(n)
 *  Memory: O(n)
 */
public final class MaxPairProductDifference {

    public static long maxDifference(int[] a) {
        int n = a.length;
        if (n < 9)
            throw new IllegalArgumentException("Array length must be ≥ 9");

        /* 1. prefix element max / min (single values) */
        long[] preMax = new long[n];
        long[] preMin = new long[n];
        preMax[0] = preMin[0] = a[0];
        for (int i = 1; i < n; i++) {
            preMax[i] = Math.max(preMax[i - 1], a[i]);
            preMin[i] = Math.min(preMin[i - 1], a[i]);
        }

        /* 2. product of a legal pair that ends at position j */
        long[] Pmax = new long[n];          // largest pair product ending at j
        long[] Pmin = new long[n];          // smallest pair product ending at j
        for (int j = 0; j < n; j++) {
            Pmax[j] = Long.MIN_VALUE;
            Pmin[j] = Long.MAX_VALUE;
        }
        for (int j = 2; j < n; j++) {       // earliest legal pair ends at 2
            Pmax[j] = a[j] * preMax[j - 2];
            Pmin[j] = a[j] * preMin[j - 2];
        }

        /* 3. best (max / min) pair product seen so far */
        long[] Mmax = new long[n];          // prefix max of Pmax
        long[] Mmin = new long[n];          // prefix min of Pmin
        Mmax[0] = Pmax[0];
        Mmin[0] = Pmin[0];
        for (int j = 1; j < n; j++) {
            Mmax[j] = Math.max(Mmax[j - 1], Pmax[j]);
            Mmin[j] = Math.min(Mmin[j - 1], Pmin[j]);
        }

        /* 4. combine a “later” pair (ending at ℓ) with the best earlier pair */
        long best = Long.MIN_VALUE;
        for (int ell = 4; ell < n; ell++) {            // later pair must end ≥4
            long candidate1 = Pmax[ell] - Mmin[ell - 4];   // later = big
            long candidate2 = Mmax[ell - 4] - Pmin[ell];   // later = small
            best = Math.max(best, Math.max(candidate1, candidate2));
        }
        return best;
    }

    /* ─────────── simple demo ─────────── */
    public static void main(String[] args) {
        int[] sample = {2, 1, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(maxDifference(sample));  // prints the maximum difference
    }
}
