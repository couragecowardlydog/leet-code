package com.leetcode.datastructures.binarytree;

/**
 *  <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/">...</a>
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }

    int maxDepth(TreeNode root, int depth) {
        if(null == root)
            return depth;
        return Math.max(maxDepth(root.right, depth + 1), maxDepth(root.left, depth + 1));
    }
}
