package com.learn.leetcode.week2;

import com.learn.leetcode.week2.struct.TreeNode;

public class SolutionIsBalanced {
    /**
     * 给定一个二叉树，判断它是否是高度平衡的二叉树。
     *
     * 本题中，一棵高度平衡二叉树定义为：
     *
     * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
     * @param root
     * @return
     */

    public static boolean isBalanced(TreeNode root) {
        if(null == root)
            return true;
        return (Math.abs(depth(root.left,1) - depth(root.right,1))<=1)
                &&isBalanced(root.left)&&isBalanced(root.right);
    }

    private static int depth(TreeNode root,int lastDepth){
        if(null == root)
            return lastDepth;
        int leftDepth = depth(root.left,lastDepth+1);
        int rightDepth = depth(root.right,lastDepth+1);
        return Math.max(leftDepth,rightDepth);
    }
}
