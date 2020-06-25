package com.learn.leetcode.week2;

import com.learn.leetcode.week2.struct.TreeNode;

public class SolutionIsSymmetricTree {
    /**
     * 给定一个二叉树，检查它是否是镜像对称的。
     * @param root
     * @return
     */
    public static boolean isSymmetric(TreeNode root) {
        if(null==root)
            return true;
        else
            return isSymmetric(root.left,root.right);
    }

    private static boolean isSymmetric(TreeNode t1,TreeNode t2){
        if(null == t1 && null == t2)
            return true;
        if(null == t1 || null == t2)
            return false;
        return t1.val == t2.val && isSymmetric(t1.left,t2.right) && isSymmetric(t1.right,t2.left);
    }
}
