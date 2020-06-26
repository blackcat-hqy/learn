package com.learn.leetcode.week2;

import com.learn.leetcode.week2.struct.TreeNode;

public class SolutionHasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(null == root)
            return false;
        int res = sum - root.val;
        if(null == root.left && null == root.right && 0 == res)
            return true;
        return hasPathSum(root.left,res)||hasPathSum(root.right,res);
    }
}
