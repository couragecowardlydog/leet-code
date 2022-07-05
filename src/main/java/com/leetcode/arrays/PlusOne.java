package com.leetcode.arrays;

import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int size = digits.length + 1;
        int[] out = new int[size];
        int carry = 1;
        int i;
        for (i = 0; i < digits.length; i++) {
            int sum = carry + digits[digits.length - i - 1];
            carry = sum / 10;
            out[out.length - i - 1] = sum % 10;
        }
        if (carry > 0)
            out[out.length - i - 1] = carry;

        return out[0] == 0 ? Arrays.copyOfRange(out, 1, out.length) : out;
    }
}
