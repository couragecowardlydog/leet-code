package com.leetcode.bst;

public class $450 {


    public TreeNode deleteNode(TreeNode root, int key) {

        // If root is null or value not found in tree
        if (root == null) {
            return null;
        }

        // Traverse right subtree and return rearranged node
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
            return root;
        }

        // Traverse left subtree and return rearranged node
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
            return root;
        }
        // Case 1: No child nodes , append null to its parent node
        if (root.left == null && root.right == null) {
            return null;
        }
        // Case 2a: One child node , append child node to its parent node
        if (root.left == null) {
            return root.right;
        }
        // Case 2b: One child node , append child node to its parent node
        if (root.right == null) {
            return root.left;
        }

        // Case 3: Node has two child nodes
        // Either replace it with the largest node in its left subtree or smallest node on right sub tree
        TreeNode successor = root.left;
        while (successor.right != null) {
            successor = successor.right;
        }
        // Replace the value of the node to be deleted with the value of the successor
        successor.right = root.right;
        root = root.left;
        return root;


    }

}
