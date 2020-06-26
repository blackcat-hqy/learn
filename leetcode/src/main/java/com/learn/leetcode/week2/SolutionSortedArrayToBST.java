package com.learn.leetcode.week2;

import com.learn.leetcode.week2.struct.TreeNode;

public class SolutionSortedArrayToBST {
    /**
     * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
     *
     * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
     * @param nums
     * @return
     */
    public static TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums,0,nums.length-1);
    }

    private static TreeNode sortedArrayToBST(int[] nums,int start,int end){
        if(start > end)
            return null;
        int mid = (start+end)>>1;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums,start,mid-1);
        root.right = sortedArrayToBST(nums,mid+1,end);
        return root;
    }
}
