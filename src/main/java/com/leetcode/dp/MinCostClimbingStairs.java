package com.leetcode.dp;

import java.util.Arrays;

/**
 * @author vivekanandan.sakthiv on Apr 2021
 * <p>
 * You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost,
 * you can either climb one or two steps.
 * <p>
 * You can either start from the step with index 0, or the step with index 1.
 * <p>
 * Return the minimum cost to reach the top of the floor.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: cost = [10,15,20]
 * Output: 15
 * Explanation: Cheapest is: start on cost[1], pay that cost, and go to the top.
 * Example 2:
 * <p>
 * Input: cost = [1,100,1,1,1,100,1,1,100,1]
 * Output: 6
 * Explanation: Cheapest is: start on cost[0], and only step on 1s, skipping cost[3].
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 2 <= cost.length <= 1000
 * 0 <= cost[i] <= 999
 */


public class MinCostClimbingStairs {

    public static int[] dp;

    public static void main(String[] args) {
        int[] T1 = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(T1));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int position = cost.length;
        // position + 1 , avoid OutOfBoundException
        dp = new int[position+ 1];
        Arrays.fill(dp, -1);
        return compute(cost, position);
    }

    public static int compute(int[] cost, int position) {
        if (position < 0)
            return Integer.MAX_VALUE;
        if (position == 0)
            return cost[0];
        if (position == 1)
            return cost[1];
        if (dp[position] != -1)
            return dp[position];
        int curCost = 0;
        // Inital call 'll be for cost.length skip to keep the cost zero
        if (position != cost.length) {
            curCost = cost[position];
        }
        dp[position] = curCost + Math.min(compute(cost, position - 1), compute(cost, position - 2));
        return dp[position];
    }

}
