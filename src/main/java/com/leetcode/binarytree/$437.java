package com.leetcode.binarytree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class $437 {

    int count = 0;
    Set<String> set = new HashSet<>();
    public int pathSum(TreeNode root, int targetSum) {
        doPathSum(root, targetSum, 0);
        return count;
    }

    private void doPathSum(TreeNode root, int targetSum, int sumSoFar) {
        if (root == null) {
            return;
        }
        if(set.contains(root.val+""+targetSum+""+sumSoFar))
            return;
        set.add(root.val+""+targetSum+""+sumSoFar);
        sumSoFar += root.val;
        if (sumSoFar == targetSum) {
            count++;
        }
        doPathSum(root.left, targetSum, sumSoFar);
        doPathSum(root.right, targetSum, sumSoFar);
        doPathSum(root.left, targetSum, 0);
        doPathSum(root.right, targetSum, 0);


    }
}
