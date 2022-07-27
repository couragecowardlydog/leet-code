package com.leetcode.datastructures.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MaximumDepthOfBinaryTreeTest {

    private MaximumDepthOfBinaryTree code;

    @BeforeEach
    void init() {
        this.code = new MaximumDepthOfBinaryTree();
    }

    @Test
    void testCase1() {
        TreeNode $N1 = new TreeNode(1);
        TreeNode $N2 = new TreeNode(2);
        TreeNode $N3 = new TreeNode(3);
        TreeNode $N4 = new TreeNode(4);
        $N1.right = $N2;
        $N1.left = $N3;
        $N2.right = $N4;
        Assertions.assertEquals(3, code.maxDepth($N1));
    }
}