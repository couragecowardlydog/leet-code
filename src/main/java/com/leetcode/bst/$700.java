package com.leetcode.bst;

public class $700 {

    public TreeNode searchBST(TreeNode root, int val) {
        if(null == root)
            return null;
        if(val == root.val)
            return root;
        TreeNode x = searchBST(root.left, val);
        if(null == x)
            x = searchBST(root.right, val);
        return x;
    }

}
