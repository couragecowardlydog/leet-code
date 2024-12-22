package com.leetcode.dp;

public class ClimbingStep {

    public static final int $1_STEP = 1;
    public static final int $2_STEP = 2;

    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(new ClimbingStep().climbStairs(5));
        System.out.println(new ClimbingStep().climbStairs(34));
    }
}
