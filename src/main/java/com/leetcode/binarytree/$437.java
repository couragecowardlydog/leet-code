package com.leetcode.binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class $437 {


    int COUNT = 0;
    public int pathSum(TreeNode root, int targetSum) {
        dfs(root, new ArrayList<>(), targetSum);
        return COUNT;
    }


    public void dfs(TreeNode root, ArrayList<Long> list, int targetSum) {
        if (root == null)
            return;
        list = list.stream().map(y -> y + root.val).collect(Collectors.toCollection(ArrayList::new));
        list.add((long) root.val);
        COUNT += list.stream().filter(i -> i == targetSum).count();
        dfs(root.left, list, targetSum);
        dfs(root.right, list, targetSum);
    }



}
