package com.leetcode.datastructures;

import java.util.*;

/**
 * @author vivekanandan.sakthiv on Oct 2021
 * <p>
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 * <p>
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Explanation: [9,4] is also accepted.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 */


public class IntersectionofTwoArrays {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            int x = hashMap.containsKey(nums1[i]) ? hashMap.get(nums1[i]) : 0;
            hashMap.put(nums1[i], x + 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (hashMap.containsKey(nums2[i]) && hashMap.get(nums2[i]) != 0) {
                int x = hashMap.get(nums2[i]);
                arrList.add(nums2[i]);
                hashMap.put(nums2[i], x - 1);
            }
        }
        return arrList.stream().mapToInt(i -> i).toArray();
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
}
