package com.leetcode.datastructures.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class InOrderTraversalTest {

    private InOrderTraversal code;

    @BeforeAll
    public void init() {
        this.code = new InOrderTraversal();
    }


    @Test
    void testCase1() {
        TreeNode node = null;
        var result = code.inorderTraversal(node);
        Assertions.assertArrayEquals(new Integer[]{}, result.toArray());

    }

    @Test
    void testCase2() {
        TreeNode $1 = new TreeNode(1);
        TreeNode $2 = new TreeNode(2);
        TreeNode $3 = new TreeNode(3);
        $1.right = $2;
        $2.left = $3;
        var result = code.inorderTraversal($1);
        Assertions.assertArrayEquals(new Integer[]{1, 3, 2}, result.toArray());

    }

}