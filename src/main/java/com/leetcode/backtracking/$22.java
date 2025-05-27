package com.leetcode.backtracking;

import java.util.*;

public class $22 {

    int[] visited;
    char[] arr;
    StringBuilder path;
    Set<String> result;

    public List<String> generateParenthesis(int n) {
        arr = new char[2 * n];
        visited = new int[2 * n];
        path = new StringBuilder();
        result = new HashSet<>();
        generate(arr);
        traverse();
        return result.stream().toList();
    }

    public void traverse() {
        if (path.length() == arr.length) {
            String s = path.toString();
            if (validateConstraint(s)) {
                result.add(s);
            }
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (visited[i] == 1)
                continue;
            visited[i] = 1;
            path.append(arr[i]);
            traverse();
            visited[i] = 0;
            path.deleteCharAt(path.length() - 1);
        }

    }

    private boolean validateConstraint(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty())
                    return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }


    public void generate(char[] arr) {
        int i;
        for (i = 0; i < arr.length / 2; i++) {
            arr[i] = '(';
        }
        for (; i < arr.length; i++) {
            arr[i] = ')';
        }
        System.out.println(Arrays.toString(arr));
    }


}
