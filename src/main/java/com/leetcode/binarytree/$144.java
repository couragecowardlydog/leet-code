package com.leetcode.binarytree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class $144 {

    List<Integer> path = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        traverse(root);
        return path;
    }

    public void traverse(TreeNode node) {
        if (node == null)
            return;
        path.add(node.val);
        traverse(node.left);
        traverse(node.right);
    }

}
