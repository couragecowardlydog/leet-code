package com.leetcode.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class $199 {

    public static class Node {
        public TreeNode treeNode;
        public int level;
        Node(TreeNode node, int level) {
            this.treeNode = node;
            this.level = level;
        }
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(null == root)
            return result;
        Queue<Node> queue = new LinkedList<>();
        Node preLevel = new Node(root, 0);
        queue.add(preLevel);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.treeNode.left != null)
                queue.add(new Node(node.treeNode.left, node.level + 1));
            if (node.treeNode.right != null)
                queue.add(new Node(node.treeNode.right, node.level + 1));
            if(preLevel.level != node.level){
                result.add(preLevel.treeNode.val);
            }
            preLevel = node;
        }
        result.add(preLevel.treeNode.val);
        return result;

    }

    public static TreeNode createComplexTree() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(6);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(20);

        root.left.left.left = new TreeNode(1);
        root.left.left.right = new TreeNode(4);
        root.right.left.left = new TreeNode(11);
        root.right.left.left.right = new TreeNode(13);
        root.right.right.left = new TreeNode(17);
        root.right.right.right = new TreeNode(25);

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = createComplexTree();
        rightSideView(root);
    }
}
