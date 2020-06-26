package com.learn.leetcode.week2;

import com.learn.leetcode.week2.struct.TreeNode;

public class SolutionMinDepth {
    /**
     * 给定一个二叉树，找出其最小深度。
     *
     * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
     * @param root
     * @return
     */
    public static int minDepth(TreeNode root) {
        if(null == root)
            return 0;
        int[] min = {Integer.MAX_VALUE};
        return minDepth(root,0,min);
    }

    private static int minDepth(TreeNode root,int lastDepth,int[] min){
        if(lastDepth+1>=min[0]){
            return min[0];
        }else{
            int leftDepth =
                    root.left == null ? lastDepth+1:minDepth(root.left,lastDepth+1,min);
            int rightDepth =
                    root.right == null ? lastDepth+1:minDepth(root.right,lastDepth+1,min);
            int minD = Math.min(leftDepth,rightDepth);
            if(root.left==null&&root.right==null&&minD<min[0]){
                min[0] = minD;
            }
            return min[0];
        }
    }
}
