package com.leetcode.arrays;

public class $1913 {

    public int maxProductDifference(int[] nums) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE + 1;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE - 1;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return (max2 * max1) - (min1 * min2);
    }

    public static void main(String[] args) {
        $1913 obj = new $1913();
        int[] nums = {4, 2, 5, 9, 7, 4, 8};
        System.out.println(obj.maxProductDifference(nums)); // Output: 34
    }
}
