package com.leetcode.backtracking;

import java.util.*;

public class $400 {

    public static Map<Integer, Set> bits = new HashMap<>();
    int[] maxBits = new int[6];

    public static void main(String[] args) {
        $400 obj = new $400();
        List<String> result = obj.readBinaryWatch(10);
        System.out.println(result);
    }

    public List<String> readBinaryWatch(int input) {
        if (bits.isEmpty()) {
            for (int i = 0; i <= 10; i++) {
                Set<Integer> visited = new HashSet<>();
                traverse(maxBits, i, 0, 0, visited);
                bits.put(i, visited);
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < input + 1; i++) {
            getTime(i, input - i, result);
        }
        return result;
    }

    private static void getTime(int i, int j, List<String> result) {
        Set<Integer> hours = bits.get(i);
        Set<Integer> minutes = bits.get(j);
        for (Integer hour : hours) {
            for (Integer min : minutes) {
                if (hour < 12 && min < 60) {
                    result.add(String.format("%01d", hour) + ":" + String.format("%02d", min));
                }
            }
        }
    }

    public static void traverse(int[] arr, int n, int count, int sum, Set<Integer> visited) {
        if (count == n) {
            visited.add(sum);
            return;
        }
        if (count > n)
            return;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                continue;
            }
            arr[i] = 1;
            traverse(arr, n, count + 1, (int) (sum + Math.pow(2, i)), visited);
            arr[i] = 0;
        }
    }
}
