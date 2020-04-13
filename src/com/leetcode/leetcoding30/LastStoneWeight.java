package com.leetcode.leetcoding30;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Arrays;

/**
 * We have a collection of stones, each stone has a positive integer weight.
 * <p>
 * Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:
 * <p>
 * If x == y, both stones are totally destroyed;
 * If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
 * At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [2,7,4,1,8,1]
 * Output: 1
 * Explanation:
 * We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
 * we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
 * we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
 * we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of last stone.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= stones.length <= 30
 * 1 <= stones[i] <= 1000
 */
public class LastStoneWeight {

    /**
     * 70 / 70 test cases passed.
     * Status: Accepted
     * Runtime: 0 ms
     * Memory Usage: 36.7 MB
     *
     * Funniest thing that ever happened to me ..
     */
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1)
            return stones[0];
        Arrays.sort(stones);
        if (stones[stones.length - 1] == 0)
            return 0;
        int x = stones[stones.length - 1];
        int y = stones[stones.length - 2];

        if (y == 0)
            return x;

        stones[stones.length - 2] = 0;
        if (x == y) {
            stones[stones.length - 1] = 0;
            return lastStoneWeight(stones);
        }

        stones[stones.length - 1] = x - y;
        return lastStoneWeight(stones);
    }


}
