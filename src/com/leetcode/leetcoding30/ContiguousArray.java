package com.leetcode.leetcoding30;


import java.util.HashMap;
import java.util.Map;

/**
 * Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
 * <p>
 * Example 1:
 * Input: [0,1]
 * Output: 2
 * Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
 * Example 2:
 * Input: [0,1,0]
 * Output: 2
 * Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
 * Note: The length of the given binary array will not exceed 50,000.
 */
public class ContiguousArray {


    /*public static int findMaxLength(int[] nums) {
        int sum = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if ((sum == ((i + 1) / 2)) && ((i + 1) % 2 == 0))
                result = i + 1;
        }
        return result;
    }*/

    /**
     *  Before cleaning code
     *  555 / 555 test cases passed.
     *  Status: Accepted
     *  Runtime: 20 ms
     *  Memory Usage: 49 MB
     *
     */

    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
        int count = 0;
        int max = 0;
        map.put(0, 0);

        for (int i = 0; i < nums.length; i++) {
            count += nums[i] == 0 ? -1 : 1;
            if (map.containsKey(count))
                max = Math.max((i + 1) - map.get(count), max);
            else
                map.put(count, i + 1);
        }
        return max;

    }

    public static void main(String[] args) {
        // 14
        int[] num = {0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0};
        // 10
        num = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1};
        // 2
//        num = new int[]{0, 1};
        // 0
//        num = new int[]{0};

        // 6 ==> TEST CASE 345
//        num = new int[]{0, 0, 1, 0, 0, 0, 1, 1};

        // 4 ==> TEST CASE 445
//        num = new int[]{0, 1, 1, 0, 1, 1, 1, 0};

        System.out.println(findMaxLength(num));
    }
}
