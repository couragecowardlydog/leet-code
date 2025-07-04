package com.leetcode.binarytree;

public class $111 {

    public int minDepth(TreeNode root) {
        if (null == root)
            return 0;
        if (null == root.left && null == root.right)
            return 1;
        if (null != root.left && null != root.right)
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        if (null != root.left)
            return 1 + minDepth(root.left);
        return 1 + minDepth(root.right);
    }
}
