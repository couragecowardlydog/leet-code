package com.leetcode.datastructures.binarytree;


/**
 * https://leetcode.com/problems/same-tree/
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q && p == null)
            return true;
        if (p != q && (p == null || q == null))
            return false;
        if (!isSameTree(p.left, q.left))
            return false;
        if (p.val != q.val)
            return false;
        return isSameTree(p.right, q.right);
    }
}
