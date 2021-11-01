package com.leetcode.datastructures;

/**
 * @author vivekanandan.sakthiv on Nov 2021
 * <p>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * Example 2:
 * <p>
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= prices.length <= 105
 * 0 <= prices[i] <= 104
 */


public class BestTimetoBuyandSellStock {

    public static int maxProfit(int[] prices) {
        int res[] = new int[prices.length];
        for (int i = 0; i < prices.length - 1; i++) {
            res[i] = prices[i + 1] - prices[i];
        }
        int max_so_far = res[0];
        int max_ending_here = res[0];
        for (int i = 1; i < res.length; i++) {
            max_ending_here = Math.max(res[i], max_ending_here + res[i]);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }

    public static int maxProfits(int[] p) {
        int[] m = new int[p.length];
        int t = p[p.length - 1];
        for (int i = p.length - 1; i >= 0; i--) {
            m[i] = Math.max(t, p[i]);
            t = m[i];
        }
        int x = 0;
        for (int i = 0; i < p.length; i++) {
            x = Math.max(x, m[i] - p[i]);

        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(maxProfits(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfits(new int[]{1, 2}));
    }
}
