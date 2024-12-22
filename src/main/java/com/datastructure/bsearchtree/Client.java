package com.datastructure.bsearchtree;

import com.datastructure.bsearchtree.impl.BinarySearchTree;
import com.datastructure.bsearchtree.impl.IBinarySearchTree;
import com.datastructure.bsearchtree.impl.Node;

import java.util.Map;
import java.util.Random;

public class Client {

    public static void main(String[] args) {

        Random random = new Random();
        Node $root = new Node(random.nextInt(100));
        System.out.println("root "+ $root);
        BinarySearchTree bst = new IBinarySearchTree($root);
        for (int i = 0; i < 10; i++) {
            try {
                Node node = new Node( random.nextInt(100));
                System.out.println("inserting " + node);
                bst.insert(node);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        bst.print();
    }
}
