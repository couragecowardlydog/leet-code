package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class $1863 {


    public static int SUM = 0;

    public int subsetXORSum(int[] nums) {
        traverse(nums, 0, new ArrayList<>());
        return SUM;
    }

    public static void main(String[] args) {
        $1863 obj = new $1863();
        int[] nums = {1, 1, 1};
        System.out.println(obj.subsetXORSum(nums));
    }


    public static void traverse(int[] nums, int index, List<Integer> visited) {
        if (index >= nums.length) {
            return;
        }
        for (int i = index; i < nums.length; i++) {
            visited.add(nums[i]);
            SUM += getXOROfSet(visited);
            traverse(nums, i + 1, visited);
            visited.remove(visited.size() - 1);
        }

    }

    public static int getXOROfSet(List<Integer> set) {
        int xor = 0;
        for (int num : set) {
            xor ^= num;
        }
        return xor;
    }
}
