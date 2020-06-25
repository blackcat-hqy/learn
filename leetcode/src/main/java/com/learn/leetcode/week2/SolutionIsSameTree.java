package com.learn.leetcode.week2;

import com.learn.leetcode.week2.struct.TreeNode;

public class SolutionIsSameTree {
    /**
     * 给定两个二叉树，编写一个函数来检验它们是否相同。
     *
     * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
     * @param p
     * @param q
     * @return
     */
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(null == p&& null ==q)
            return true;
        if(null == p || null == q)
            return false;
        return p.val==q.val&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
