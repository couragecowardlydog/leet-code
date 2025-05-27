package com.leetcode.backtracking;

import java.util.*;

public class $22 {

    StringBuilder path;
    List<String> result;
    int MAX;
    char[] chars = new char[]{'(', ')'};
    int[] visited = new int[2];
    public List<String> generateParenthesis(int n) {
        MAX = n;
        path = new StringBuilder();
        result = new LinkedList<>();
        traverse();
        return result;
    }

    public void traverse() {
        if (path.length() == MAX * 2) {
            String s = path.toString();
            if (validateConstraint(s)) {
                result.add(s);
            }
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (!path.isEmpty() && path.charAt(0) == ')') {
                continue;
            }
            if (visited[i] == MAX)
                continue;
            visited[i]++;
            path.append(chars[i]);
            traverse();
            path.deleteCharAt(path.length() - 1);
            visited[i]--;
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




}
