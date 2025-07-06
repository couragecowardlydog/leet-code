package com.leetcode.binarytree;

public class $222 {

    boolean LAST_LEAF_ON_RIGHT = false;
    int MISSING_NODES = 0;

    public int countNodes(TreeNode root) {
        if(null == root)
            return 0;
        int depth = findDepth(root);
        int MAX_NODES = (int) Math.pow(2, depth) - 1;
        missingNodes(root, 1, depth);
        return MAX_NODES - MISSING_NODES;
    }

    private int findDepth(TreeNode node) {
        if (null == node)
            return 0;
        return 1 + findDepth(node.left);
    }


    private void missingNodes(TreeNode node, int current, int target) {
        if (LAST_LEAF_ON_RIGHT)
            return;
        if (current == target) {
            if (node == null)
                MISSING_NODES++;
            else
                LAST_LEAF_ON_RIGHT = true;
            return;
        }
        missingNodes(node.right, current + 1, target);
        missingNodes(node.left, current + 1, target);
    }


}
