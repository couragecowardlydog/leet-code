package com.leetcode.datastructures.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SameTreeTest {

    private SameTree code;

    @BeforeEach
    void setUp() {
        this.code = new SameTree();
    }


    @Test
    void testCase1() {
        TreeNode $P1 = new TreeNode(1);
        TreeNode $P2 = new TreeNode(2);
        TreeNode $P3 = new TreeNode(3);
        $P1.right = $P3;
        $P1.left = $P2;

        TreeNode $Q1 = new TreeNode(1);
        TreeNode $Q2 = new TreeNode(2);
        TreeNode $Q3 = new TreeNode(3);
        $Q1.right = $Q3;
        $Q1.left = $Q2;
        Assertions.assertTrue(code.isSameTree($P1, $Q1));
    }


    @Test
    void testCase2() {
        TreeNode $P1 = new TreeNode(1);
        TreeNode $P2 = new TreeNode(2);
        TreeNode $P3 = new TreeNode(4);
        $P1.right = $P3;
        $P1.left = $P2;

        TreeNode $Q1 = new TreeNode(1);
        TreeNode $Q2 = new TreeNode(2);
        TreeNode $Q3 = new TreeNode(3);
        $Q1.right = $Q3;
        $Q1.left = $Q2;
        Assertions.assertFalse(code.isSameTree($P1, $Q1));
    }

    @Test
    void testCase3() {
        TreeNode $P1 = new TreeNode(1);
        TreeNode $P2 = new TreeNode(2);
        TreeNode $P1_1 = new TreeNode(1);
        $P1.right = $P1_1;
        $P1.left = $P2;

        TreeNode $Q1 = new TreeNode(1);
        TreeNode $Q2 = new TreeNode(2);
        TreeNode $Q1_1 = new TreeNode(1);
        $Q1.right = $Q2;
        $Q1.left = $Q1_1;
        Assertions.assertFalse(code.isSameTree($P1, $Q1));
    }

    @Test
    void testCase4() {
        TreeNode $P1 = new TreeNode(1);
        TreeNode $P2 = new TreeNode(2);
        $P1.left = $P2;

        TreeNode $Q1 = new TreeNode(1);
        TreeNode $Q2 = new TreeNode(2);
        $Q1.right = $Q2;
        Assertions.assertFalse(code.isSameTree($P1, $Q1));
    }
}