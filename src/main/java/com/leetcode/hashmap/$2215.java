package com.leetcode.hashmap;

import java.util.ArrayList;
import java.util.List;

public class $2215 {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int[] arr1 = new int[2001];
        int[] arr2 = new int[2001];
        int i;
        for (i = 0; i < nums1.length; i++) {
            arr1[nums1[i] + 1000] = 1;
        }
        for (i = 0; i < nums2.length; i++) {
            arr2[nums2[i] + 1000] = 1;
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (i = 0; i < 2001; i++) {
            if ((arr1[i] + arr2[i]) == 1) {
                if (arr1[i] == 1) {
                    list1.add(i - 1000);
                    continue;
                }
                if (arr2[i] == 1) {
                    list2.add(i - 1000);
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);
        return result;

    }
}
