package com.leetcode.leetcoding30;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        int[] output = new int[nums.length];

        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            output[i] = product;
            product *= nums[i];
        }
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= product;
            product *= nums[i];

        }

        return output;


    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
