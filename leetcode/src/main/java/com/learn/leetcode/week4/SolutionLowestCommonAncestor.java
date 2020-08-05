package com.learn.leetcode.week4;

import com.learn.leetcode.week2.struct.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 *
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，
 * 满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 *
 */
public class SolutionLowestCommonAncestor {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pathTop = new ArrayList<>();
        findPath(root,p,pathTop);
        if(pathTop.contains(q))
            return q;
        List<TreeNode> pathToq = new ArrayList<>();
        findPath(root,q,pathToq);
        if(pathToq.contains(p))
            return p;
        TreeNode last = null;
        int size = Math.min(pathTop.size(),pathToq.size());
        for (int i = 0; i < size; i++) {
            if(!pathTop.get(i).equals(pathToq.get(i)))
                break;
            else
                last = pathTop.get(i);
        }
        return last;
    }

    private static void findPath(TreeNode root,TreeNode target,List<TreeNode> path){
        if(root.equals(target)||root == null)
            return;
        path.add(root);
        if(root.val>target.val)
            findPath(root.left,target,path);
        else
            findPath(root.right,target,path);
    }
}
