package com.leetcode.binarytree;

public class $112 {

    public boolean hasPathSum(TreeNode node, int sum) {
        if (null == node)
            return false;
        if (null == node.left && null == node.right && sum == node.val)
            return true;
        if (null != node.right && hasPathSum(node.right, sum - node.val))
            return true;
        return hasPathSum(node.left, sum - node.val);
    }


}
