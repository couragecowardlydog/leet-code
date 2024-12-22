package com.leetcode.code;


import java.util.Arrays;

public class $189 {

    public int[] rotate(int[] actual, int k) {
        int n = actual.length;
        k = k % n;
        if (k == 0)
            return actual;
        int temp = actual[0];
        int times = 0;
        int i = 0;
        while (times == 0) {
            i = (i + k) % n;
            int x = actual[i];
            actual[i] = temp;
            temp = x;
            if (i == 0)
                times++;
        }
        System.out.println(Arrays.toString(actual));
        return actual;

    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
