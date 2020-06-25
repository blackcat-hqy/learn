package com.learn.leetcode.week2;

import com.learn.leetcode.week2.struct.TreeNode;

public class SolutionMaxDepth {
    /**
     * 给定一个二叉树，找出其最大深度。
     *
     * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
     *
     * 说明: 叶子节点是指没有子节点的节点。
     * @param root
     * @return
     */
    public static int maxDepth(TreeNode root) {
        return maxDepth(root,0);
    }

    private static int maxDepth(TreeNode root,int depth){
        if(null == root)
            return  depth;
        int max = Math.max(maxDepth(root.right,depth+1),maxDepth(root.left,depth+1));
        return max;
    }
}
