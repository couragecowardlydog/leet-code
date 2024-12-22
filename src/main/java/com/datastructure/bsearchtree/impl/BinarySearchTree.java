package com.datastructure.bsearchtree.impl;


/**
 *  1. Insert
 *  2. Delete
 *  3. Search
 *  4. Print
 *
 */
public interface BinarySearchTree {

    public void insert(Node node) throws Exception;

    public Node delete(int value);

    public Node search(int value);

    public void print();

}
