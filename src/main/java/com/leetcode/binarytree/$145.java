package com.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

public class $145 {

    List<Integer> path = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        traverse(root);
        return path;
    }

    public void traverse(TreeNode node) {
        if (node == null)
            return;
        traverse(node.left);
        traverse(node.right);
        path.add(node.val);
    }
}
