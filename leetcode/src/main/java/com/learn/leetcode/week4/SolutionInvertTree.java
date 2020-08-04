package com.learn.leetcode.week4;

import com.learn.leetcode.week2.struct.TreeNode;

/**
 * 反转二叉树
 */
public class SolutionInvertTree {
    public static TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }
}
