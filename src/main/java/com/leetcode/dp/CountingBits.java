package com.leetcode.dp;

public class CountingBits {

    public static int[] bits = new int[]{0, 1, 1, 2, 1, 2, 2, 3};

    public int[] countBits(int i) {
        int[] ans = new int[i + 1];
        for (int j = 0; j < ans.length; j++) {
            numOfBits(j, ans);
        }
        return ans;
    }

    public int numOfBits(int i, int[] ans) {
        if (i <= 7)
            return bits[i];
        int j =  1 + numOfBits((int) (i - Math.pow(2, log2(i))), ans);
        ans[i] = ans[i] + j;
        return j;

    }

    public int log2(int n) {
        return (int) (Math.log(n) / Math.log(2));
    }
}
