package com.leetcode.binarysearch;

import java.util.Arrays;

public class $2300 {


    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] result = new int[spells.length];
        int m = potions.length;
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int count = binarySearchIdentifyingLeftMostElement(potions, spells[i], success);
            result[i] = count;
        }
        return result;
    }


    public static int binarySearchIdentifyingLeftMostElement(int[] array, int x, long success) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            double product = array[mid] * x;
            System.out.println(product);
            if (product >= success) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if ((right == array.length - 1)) {
            if (array[right] * x >= success)
                return 1;
            return 0;
        }
        if (right == 0) {
            if (array[right] * x >= success)
                return array.length;
            return right;
        }
        return array.length - right;

    }

}
