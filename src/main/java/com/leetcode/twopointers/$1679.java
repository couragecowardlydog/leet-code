package com.leetcode.twopointers;

import java.util.Arrays;
import java.util.HashMap;

public class $1679 {


    public int maxOperations(int[] input, int k) {
        if(k < 2)
            return 0;
        int result = 0;
        Arrays.sort(input);
        int i = 0;
        int j = input.length - 1;
        while (i < j) {
            int x = k - input[j];
            int jval = input[j];
            if (input[i] == x) {
                if (input[i] == input[j]) {
                    result += (j - i + 1) / 2;
                    i = j;
                } else {
                    int icount = 0;
                    int jcount = 0;
                    while (input[i] == x && i < j) {
                        icount++;
                        i++;
                    }
                    while (input[j] == jval) {
                        jcount++;
                        j--;
                    }
                    result += Math.min(icount, jcount);
                }
            } else if (input[i] < x) {
                i++;
            } else {
                j--;
            }

        }
        return result;
    }


    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return; // already sorted if length < 2
        }
        mergeSortHelper(arr, 0, arr.length - 1);
    }

    private static void mergeSortHelper(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortHelper(arr, left, mid);
            mergeSortHelper(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;      // Start index for left sub-array
        int j = mid + 1;   // Start index for right sub-array
        int k = 0;         // Index for temp array

        // Merge elements from left and right sub-arrays
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy any remaining elements on the left side
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy any remaining elements on the right side
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Write the merged elements back into the original array
        System.arraycopy(temp, 0, arr, left, temp.length);
    }


    public int bruteForce(int[] nums, int k) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            int num = k - nums[i];
            if (map.containsKey(num) && map.get(num) > 0 && map.get(nums[i]) > 0 && (num == nums[i] ? map.get(num) >= 2 : true)) {
                result++;
                map.replace(num, map.get(num) - 1);
                map.replace(nums[i], map.get(nums[i]) - 1);
            }

        }

        return result;
    }


    // Memory limit exceeded
    public int tradingOffSpace(int[] nums, int k) {
        int result = 0;
        int[] dp = new int[1000000000];
        for (int i = 0; i < nums.length; i++) {
            dp[nums[i] - 1]++;
        }
        int i = 0;
        int j = k - 2;
        while (i < j) {
            result += Math.min(dp[i], dp[j]);
            i++;
            j--;
        }
        if (k % 2 == 0) {
            result += dp[(k - 1) / 2] / 2;
        }
        return result;
    }

}
