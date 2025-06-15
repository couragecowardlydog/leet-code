package com.leetcode.dp;

import com.leetcode.binarytree.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class $95 {

    int[] visited;
    Map<String, TreeNode> result = new HashMap<>();

    public List<TreeNode> generateTrees(int n) {
        traverse(0, n, new LinkedList<>());
        return result.values().stream().collect(Collectors.toUnmodifiableList());
    }


    public void traverse(int i, int n, List<Integer> treeList) {
        if (null == visited)
            visited = new int[n];
        if (i == n) {
            System.out.println(treeList);
            addToResult(treeList);
            return;
        }
        for (int j = 0; j < n; j++) {
            if (visited[j] == 1)
                continue;
            visited[j] = 1;
            treeList.add(j + 1);
            traverse(i + 1, n, treeList);
            treeList.remove(treeList.size() - 1);
            visited[j] = 0;
        }
    }

    private void addToResult(List<Integer> treeList) {
        TreeNode root = new TreeNode(treeList.get(0));
        for (int i = 1; i < treeList.size(); i++) {
            insert(root, treeList.get(i));
        }
        StringBuilder x = new StringBuilder();
        nodeTraversal(root, x);
        result.put(x.toString(), root);

    }

    private void nodeTraversal(TreeNode root, StringBuilder stringBuilder) {
        if (root == null)
            return;
        stringBuilder.append(root.val);
        nodeTraversal(root.left, stringBuilder);
        nodeTraversal(root.right, stringBuilder);
    }

    public void insert(TreeNode root, int val) {
        if (root == null) return;
        if (val < root.val) {
            if (root.left == null)
                root.left = new TreeNode(val);
            else
                insert(root.left, val);
        } else {
            if (root.right == null)
                root.right = new TreeNode(val);
            else
                insert(root.right, val);
        }
    }

}
