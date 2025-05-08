package com.leetcode.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class $1161 {

    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int MAX_LEVEL = 1;
        int CURRENT_LEVEL = 1;
        int MAX = Integer.MIN_VALUE;
        while (!queue.isEmpty()) {
            TreeNode[] childNodes = new TreeNode[queue.size() * 2];
            int sum = 0;
            int j = 0;
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) {
                    childNodes[j++] = node.left;
                }
                if (node.right != null) {
                    childNodes[j++] = node.right;
                }
            }
            if (sum > MAX) {
                MAX = sum;
                MAX_LEVEL = CURRENT_LEVEL;
            }
            for (int i = 0; i < j; i++) {
                queue.add(childNodes[i]);
            }
            CURRENT_LEVEL++;
        }
        return MAX_LEVEL;
    }
}
