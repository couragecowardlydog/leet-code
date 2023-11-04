package com.leetcode.datastructures;

/**
 * @author vivekanandan.sakthiv on Oct 2021
 */


public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j])
                result[k++] = nums1[i++];
            else
                result[k++] = nums2[j++];
        }
        while (i < m) {
            result[k++] = nums1[i++];
        }
        while (j < n) {
            result[k++] = nums2[j++];
        }
        
        nums1 = result;
    }

    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }
}
