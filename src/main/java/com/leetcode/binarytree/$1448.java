package com.leetcode.binarytree;

public class $1448 {

    int goodNodes = 0;

    public int goodNodes(TreeNode root) {
        goodNodes = 0;
        findGoodNodes(root.left, root.val);
        findGoodNodes(root.right, root.val);
        return goodNodes + 1;
    }

    private void findGoodNodes(TreeNode node, int max) {
        if (null == node)
            return;
        if (node.val >= max)
            goodNodes++;
        max = Math.max(node.val, max);
        findGoodNodes(node.left, max);
        findGoodNodes(node.right, max);
    }

}
