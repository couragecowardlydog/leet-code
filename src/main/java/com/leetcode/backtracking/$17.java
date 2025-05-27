package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class $17 {

    static HashMap<Integer, char[]> map = new HashMap<>();

    static {
        map.put(2, new char[]{'a', 'b', 'c'});
        map.put(3, new char[]{'d', 'e', 'f'});
        map.put(4, new char[]{'g', 'h', 'i'});
        map.put(5, new char[]{'j', 'k', 'l'});
        map.put(6, new char[]{'m', 'n', 'o'});
        map.put(7, new char[]{'p', 'q', 'r', 's'});
        map.put(8, new char[]{'t', 'u', 'v'});
        map.put(9, new char[]{'w', 'x', 'y', 'z'});
    }

    String sourceStr;
    StringBuilder path = new StringBuilder();
    List<String> result;

    public List<String> letterCombinations(String digits) {
        sourceStr = digits;

        result = new ArrayList<>();
        if (digits.length() > 0)
            traverse(0);
        return result;
    }

    public void traverse(int index) {
        if (path.length() == sourceStr.length()) {
            result.add(path.toString());
            return;
        }
        char[] arr = map.get(Character.getNumericValue(sourceStr.charAt(index)));
        for (int i = 0; i < arr.length; i++) {
            path.append(arr[i]);
            traverse(index + 1);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
