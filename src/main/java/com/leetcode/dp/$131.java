package com.leetcode.dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class $131 {

    List[][] arr;

    public List<List<String>> partition(String s) {
        arr = new List[s.length() + 1][s.length() + 1];
        List result = traverse(0, s);
        return result;
    }

    private List<List<String>> traverse(int i, String source) {
        if (i == source.length() - 1) {
            return List.of(List.of(source.substring(i, i + 1)));
        }
        List<List<String>> temp = new ArrayList<>();
        for (int j = i; j < source.length(); j++) {
            String sub = source.substring(i, j + 1);


            if (arr[i][j] != null) {
                System.out.println("Using cache");
                var values = arr[i][j];
                if (null != values)
                    temp.addAll(values);
                continue;
            }

            if (!isPalindrome(sub)) {
                continue;
            }
            List<List<String>> intermediate;
            if ((j + 1) < source.length()) {
                intermediate = new ArrayList<>();
                traverse(j + 1, source).stream().forEach(list -> {
                    List l = new ArrayList(list);
                    l.add(0, sub);
                    intermediate.add(l);
                });

            } else {
                intermediate = new ArrayList<>(List.of(new ArrayList<>(List.of(sub))));
            }
            temp.addAll(intermediate);
            arr[i][j] = intermediate;


        }
        return temp;
    }

    private boolean isPalindrome(String s) {
        if (s == null) return false;
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        $131 test = new $131();
        System.out.println(test.partition("abbba"));
    }
}
