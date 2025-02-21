package com.leetcode.binarytree;

import java.util.Arrays;

public class $872 {

    public static int index = 0;

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        boolean result = true;
        int[] rleaf = new int[128];
        int[] lleaf = new int[128];
        index = 0;
        traverse(root1, rleaf);
        index = 0;
        traverse(root2, lleaf);
        for (int i = 0; i < 128; i++) {
            if (rleaf[i] != lleaf[i]) {
                result = false;
                break;
            }
        }

        return result;
    }


    private void traverse(TreeNode root, int[] leaf) {
        if (root.left == null && root.right == null)
            leaf[index++] = root.val;
        if (null != root.left)
            traverse(root.left, leaf);
        if (null != root.right)
            traverse(root.right, leaf);
    }


}
