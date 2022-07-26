package com.leetcode.datastructures.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class IsSymmetricTest {

    private IsSymmetric code;

    @BeforeAll
    public void init(){
        this.code = new IsSymmetric();
    }

    @Test
    public void testCase1(){
        TreeNode $N1 = new TreeNode(1);
        TreeNode $N2_L = new TreeNode(2);
        TreeNode $N2_R = new TreeNode(2);
        $N1.right = $N2_R;
        $N1.left = $N2_L;
        Assertions.assertTrue(code.isSymmetric($N1));
    }
}