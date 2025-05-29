package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class $1980 {


    StringBuilder path = new StringBuilder();
    List<String> candidates = new ArrayList<>();
    int LEN_OF_BINARY_STR;
    String result;
    char ZERO = '0';
    char ONE = '1';

    public String findDifferentBinaryString(String[] nums) {
        candidates = List.of(nums);
        LEN_OF_BINARY_STR = nums.length;
        traverse();
        return result;
    }

    public void traverse() {
        if (null != result)
            return;

        if (LEN_OF_BINARY_STR == path.length()) {
            System.out.println(path);
            if (!candidates.contains(path.toString())) {
                result = path.toString();
                System.out.println(result);
            }
            return;
        }
        path.append(ONE);
        traverse();
        path.deleteCharAt(path.length() - 1);
        path.append(ZERO);
        traverse();
        path.deleteCharAt(path.length() - 1);
    }
}
