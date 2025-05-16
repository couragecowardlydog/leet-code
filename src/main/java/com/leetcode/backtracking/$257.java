package com.leetcode.backtracking;

import com.leetcode.datastructures.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class $257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();

        result.add(getPath(root, dfs(root.left, new ArrayList<>())));
        result.add(getPath(root, dfs(root.right, new ArrayList<>())));
        return result;
    }

    public String getPath(TreeNode node, List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(node.val);
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1) {
                sb.append("->");
            }
            sb.append(list.get(i));
        }
        return sb.toString();

    }

    public List<String> dfs(TreeNode root, List<String> result) {
        if (root == null)
            return result;
        result.add(String.valueOf(root.val));
        dfs(root.left, result);
        dfs(root.right, result);
        return result;
    }

}
