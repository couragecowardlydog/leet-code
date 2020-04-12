package com.leetcode.leetcoding30;

/**
 * Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 *
 * Example:
 * Given a binary tree
 *           1
 *          / \
 *         2   3
 *        / \
 *       4   5
 * Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
 *
 * Note: The length of path between two nodes is represented by the number of edges between them.
 */
public class DiameterofBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public int diameterOfBinaryTree(TreeNode root) {
        /*
        if(null == root)
            return 0;
        return lenghtOfTree(root.right) +  lenghtOfTree(root.left);
        */

        // One of the edge case
        if (null == root)
            return 0;

        // Distance can be any two nodes, need not to be the root's right and left
        int fromRoot = lenghtOfTree(root.right) + lenghtOfTree(root.left);
        int itsRight = diameterOfBinaryTree(root.left);
        int itsLeft = diameterOfBinaryTree(root.right);

        if((fromRoot >= itsLeft) && (fromRoot >= itsRight))
            return  fromRoot;
        if((itsLeft >= fromRoot) && (itsLeft >= itsRight))
            return itsLeft;
        return itsRight;
    }


    public int lenghtOfTree(TreeNode root) {
        if (null == root)
            return 0;

        int left = 1 + lenghtOfTree(root.left);
        int right = 1 + lenghtOfTree(root.right);

        return left > right ? left : right;

    }
}
