package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class $2002 {

    List<String> result = new ArrayList<>();
    List<String> covered = new ArrayList<>();
    StringBuilder path;

    public static void main(String[] args) {
        $2002 instance = new $2002();
        System.out.println(instance.maxProduct("accbcaxxcxx"));
    }

    public int maxProduct(String s) {
        path = new StringBuilder(s);
        generate();
        System.out.println(result);
        int product = 0;
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.size(); j++) {
                if (i == j)
                    continue;
                if (hasChar(result.get(i), result.get(j)))
                    product = Math.max(product, result.get(i).length() * result.get(j).length());

            }

        }
        return product;
    }

    private static boolean hasChar(String source, String target) {
        char[] arr = source.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (target.indexOf(arr[i]) >= 0)
                return false;
        }
        return true;
    }


    private void generate() {

//        if(covered.contains(path.toString()))
//            return;
        covered.add(path.toString());
        if (isPalindrome(path.toString()) && !result.contains(path.toString())) {
            result.add(path.toString());
        }

        if (path.length() == 1)
            return;
        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            path.deleteCharAt(i);
            generate();
            path.insert(i, c);
        }
    }

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }
}
