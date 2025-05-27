package com.leetcode.backtracking;

import com.leetcode.binarytree.TreeNode;

import java.util.Arrays;

public class $988 {

    public StringBuilder path;
    public String result;

    public String smallestFromLeaf(TreeNode root) {
        path = new StringBuilder();
        result = null;
        traverse(root);
        return result;
    }

    public void traverse(TreeNode root) {
        if (null == root)
            return;
        if (null == root.left && null == root.right) {
            path.append('a' + root.val);
            path.reverse();
            String str = path.toString();
            if (null == result || result.compareTo(str) > 0) {
                result = str;
            }
            path.reverse();
            path.deleteCharAt(path.length() - 1);
            return;
        }
        path.append((char) ('a' + root.val));
        traverse(root.left);
        traverse(root.right);
        path.deleteCharAt(path.length() - 1);
    }

}
