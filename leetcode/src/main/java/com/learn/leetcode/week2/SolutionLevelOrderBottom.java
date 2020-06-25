package com.learn.leetcode.week2;

import com.learn.leetcode.week2.struct.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SolutionLevelOrderBottom {
    /**
     *给定一个二叉树，返回其节点值自底向上的层次遍历。
     * （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (null == root)
            return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<TreeNode> queue = new ArrayList<>();
        List<Integer> level = new ArrayList<>();
        queue.add(root);
        int lastCount = 1;
        int curCount = 0;
        while(!queue.isEmpty()){
            TreeNode cur = queue.remove(0);
            lastCount--;
            level.add(cur.val);
            if(null!=cur.left){
                queue.add(cur.left);
                curCount++;
            }
            if(null!=cur.right){
                queue.add(cur.right);
                curCount++;
            }
            if(0==lastCount){
                ans.add(0,level);
                level = new ArrayList<>();
                lastCount = curCount;
                curCount = 0;
            }
        }
        return ans;
    }
}
