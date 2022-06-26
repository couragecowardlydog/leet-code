package com.leetcode.math;

public class XPowerN {

    public int find(int x, int n) {
        if (n == 0)
            return 1;
        // x pow(n/2) * x pow(n/2)
        if (n % 2 == 0)
            return find(x, n / 2) * find(x, n / 2);
        // x * x pow(n-1/2) * x pow(n-1/2)
        return x * find(x, (n - 1) / 2) * find(x, (n - 1 )/ 2);
    }
}
