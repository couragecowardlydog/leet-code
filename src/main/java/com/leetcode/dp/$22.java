package com.leetcode.dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class $22 {

    Set<String> keys = new HashSet<>();
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        traverse(new StringBuilder("()"), 1, n);
        System.out.println(keys);
        return result;
    }

    private void traverse(StringBuilder path, int currentLevel, int n) {
        if (keys.contains(path.toString())) {
            System.out.println("key contains in hash" + path);
            return;
        }
        keys.add(path.toString());
        if (n == currentLevel) {
            result.add(path.toString());
            return;
        }
        traverse(path.insert(0, '(').insert(path.length(), ')'), currentLevel + 1, n);
        path.deleteCharAt(0).deleteCharAt(path.length() - 1);
        traverse(path.append("()"), currentLevel + 1, n);
        path.delete(path.length() - 2, path.length());
        traverse(path.insert(0, "()"), currentLevel + 1, n);
        path.delete(0, 2);
        if (n % 2 == 0) {
            System.out.println("here" + n);
            path.append(path);
            path.delete(0, path.length() / 2);
        }
    }

    // (())(())
    public static void main(String[] args) {
        $22 obj = new $22();
        System.out.println(obj.generateParenthesis(4));
    }


}
