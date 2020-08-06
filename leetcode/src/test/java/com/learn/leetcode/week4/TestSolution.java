package com.learn.leetcode.week4;

import com.learn.leetcode.week2.struct.TreeNode;
import org.junit.Test;

public class TestSolution {
    @Test
    public void testCountPrimes(){
        System.out.println(SolutionCountPrimes.countPrimes(20));
    }

    @Test
    public void testIsIsomorphic(){
        System.out.println(SolutionIsIsomorphic.isIsomorphic("ab","aa"));
    }

    @Test
    public void testMyStack(){
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.top());
    }

    @Test
    public void testInvertTree(){
        TreeNode root = new TreeNode(1,new TreeNode(2),new TreeNode(3));
        TreeNode node = SolutionInvertTree.invertTree(root);
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);
    }

    @Test
    public void testMyQueue(){
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
    }

    @Test
    public void testMinCostClimbingStairs(){
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(SolutionMinCostClimbingStairs.minCostClimbingStairs(cost));
    }
}
