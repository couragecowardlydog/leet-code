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
            Queue<TreeNode> xqueue = new LinkedList<>();
            int sum = 0;
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) {
                    xqueue.add(node.left);
                }
                if (node.right != null) {
                    xqueue.add(node.right);
                }
            }
            if (sum > MAX) {
                MAX = sum;
                MAX_LEVEL = CURRENT_LEVEL;
            }
            queue.addAll(xqueue);
            CURRENT_LEVEL++;
        }
        return MAX_LEVEL;
    }
}
