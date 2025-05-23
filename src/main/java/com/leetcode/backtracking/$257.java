package com.leetcode.backtracking;

import com.leetcode.datastructures.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class $257 {

    List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        treeTraversal(root, new String());
        return result;
    }

    public void treeTraversal(TreeNode root, String value) {
        if (root != null) {
            value = value.concat(String.valueOf(root.val));
        }
        if (root.left == null && root.right == null) {
            result.add(value);
        }
        value = value.concat("->");
        treeTraversal(root.left, value);
        treeTraversal(root.right, value);
    }


}
