package com.datastructure.bsearchtree.impl;


import java.util.Objects;

public class IBinarySearchTree implements BinarySearchTree {

    Node root;

    public IBinarySearchTree(Node root) {
        this.root = root;
    }


    public void insert(Node node) throws Exception {
        insert(root, node);
    }

    private void insert(Node root, Node node) {
        if (node.getValue() < root.getValue()) {
            if (null != root.getLeft()) {
                insert(root.getLeft(), node);
            } else {
                root.setLeft(node);
            }
        } else if (node.getValue() > root.getValue()) {
            if (null != root.getRight()) {
                insert(root.getRight(), node);
            } else {
                root.setRight(node);
            }
        }

    }

    public Node delete(int value) {
        return null;
    }

    public Node search(int value) {
        return null;
    }

    private void print(Node root) {
        if (Objects.isNull(root))
            return;
        System.out.println(root);
        print(root.getLeft());
        print(root.getRight());
    }

    public void print() {
        print(root);
    }

}
