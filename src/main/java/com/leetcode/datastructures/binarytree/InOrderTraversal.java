package com.leetcode.datastructures.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
public class InOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode node) {
        if (node == null)
            return new ArrayList<>();
        List<Integer> left = inorderTraversal(node.left);
        left.add(node.val);
        List<Integer> right = inorderTraversal(node.right);
        left.addAll(right);
        return left;
    }
}
