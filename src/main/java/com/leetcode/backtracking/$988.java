package com.leetcode.backtracking;

import com.leetcode.binarytree.TreeNode;

import java.util.Arrays;

public class $988 {

    public String smallestFromLeaf(TreeNode root) {
        return new StringBuilder(dfs(root, "")).reverse().toString();
    }

    private String dfs(TreeNode root, String  strSofar) {
        if (root == null) {
            return strSofar;
        }
        if (root.left == null && root.right == null) {
            return strSofar.concat(getChar(root.val));
        }
        var left = dfs(root.left, strSofar.concat(getChar(root.val)));
        var right = dfs(root.right, strSofar.concat(getChar(root.val)));
        if(root.left == null)
            return right;
        if(root.right == null)
            return left;
        return doLexicographicComparison(left, right);
    }

    private String doLexicographicComparison(String left, String right) {
        char[] leftChars = reverse(left.toCharArray());
        char[] rightChars = reverse(right.toCharArray());
        System.out.println("Comparing: " + Arrays.toString(leftChars) + " and " +  Arrays.toString(rightChars));

        int minLength = Math.min(leftChars.length, rightChars.length);
        for (int i = 0; i < minLength; i++) {
            if (leftChars[i] == rightChars[i])
                continue;
            if(leftChars[i] > rightChars[i])
                return right;
            return left;
        }
        if(leftChars.length > rightChars.length)
            return right;
        return left;
    }

    public String getChar(int val) {
        return String.valueOf((char) (val + 'a'));
    }

    public char[] reverse(char[] chars) {
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return chars;
    }
}
