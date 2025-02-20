package com.leetcode.binarytree;

public class $104 {

    public int maxDepth(TreeNode root) {
        if(null == root)
            return 0;
        return findMaxDepth(root, 0);
    }


    private int findMaxDepth(TreeNode root, int maxDepth) {
        int left = 0;
        int right = 0;
        if (null != root.left)
            left = findMaxDepth(root.left, maxDepth + 1);
        if (null != root.right)
            right = findMaxDepth(root.right, maxDepth + 1);
        return Math.max(left, right) + 1;
    }
}
