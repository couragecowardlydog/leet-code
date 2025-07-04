package com.leetcode.binarysearch;

import com.leetcode.binarytree.TreeNode;
import com.sun.source.tree.Tree;

public class $404 {

    int sum = 0;
    public int sumOfLeftLeaves(TreeNode node) {
        traverse(node, false);
        return sum;
    }

    private void traverse(TreeNode node, boolean isLeft) {

        if (null == node)
            return;
        if (null == node.left && null == node.right) {
            sum += node.val;
        }
        traverse(node.right, false);
        traverse(node.left, true);
    }


}
