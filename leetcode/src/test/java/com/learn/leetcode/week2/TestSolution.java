package com.learn.leetcode.week2;

import com.learn.leetcode.Tool;
import com.learn.leetcode.week1.SolutionListCombine;
import com.learn.leetcode.week1.struct.ListNode;
import com.learn.leetcode.week2.struct.TreeNode;
import org.junit.Test;
import sun.reflect.generics.tree.Tree;

public class TestSolution {
    @Test
    public void testMaxSubArray(){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(SolutionMaxSubArray.maxSubArray(nums));
    }

    @Test
    public void testLengthOfLastWord(){
        System.out.println(SolutionLengthOfLastWord.lengthOfLastWord("hello word  "));
    }

    @Test
    public void testPlusOne(){
        int[] nums = {1,9,9};
        Tool.printArray(SolutionPlusOne.plusOne(nums));
    }

    @Test
    public void testAddBinary(){
        System.out.println(SolutionAddBinary.addBinary("1010","1011"));
    }

    @Test
    public void testSqrt(){
        System.out.println(SolutionSqrt.mySqrt(4));
    }

    @Test
    public void testClimbStiars(){
        System.out.println(SolutionClimbStairs.climbStairs(5));
    }

    @Test
    public void testDeleteDuplicates(){
        ListNode head = new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(2))));
        SolutionListCombine.printList(SolutionDeleteDuplicates.deleteDuplicates(head));
    }

    @Test
    public void testMerge(){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        SolutionMerge.merge(nums1,3,nums2,nums2.length);
        Tool.printArray(nums1);
    }

    @Test
    public void testIsSameTree(){
        TreeNode t1 = new TreeNode(1,new TreeNode(2),new TreeNode(3));
        TreeNode t2 = new TreeNode(1,new TreeNode(2),new TreeNode(3));
        System.out.println(SolutionIsSameTree.isSameTree(t1,t2));
    }

    @Test
    public void testIsSymmetricTree(){
        TreeNode t1 = new TreeNode(1,new TreeNode(2,new TreeNode(3),new TreeNode(4)),
                new TreeNode(2,new TreeNode(4),new TreeNode(3)));
        System.out.println(SolutionIsSymmetricTree.isSymmetric(t1));
    }

    @Test
    public void testMaxDepth(){
        TreeNode t1 = new TreeNode(1,new TreeNode(2,new TreeNode(3),new TreeNode(4)),
                new TreeNode(2,new TreeNode(4),new TreeNode(3)));
        System.out.println(SolutionMaxDepth.maxDepth(t1));
    }

    @Test
    public void testLevelOrderBottom(){
        TreeNode t1 = new TreeNode(1,new TreeNode(2,new TreeNode(3),new TreeNode(4)),
                new TreeNode(2,new TreeNode(4),new TreeNode(3)));
        System.out.println(SolutionLevelOrderBottom.levelOrderBottom(t1));
    }

    @Test
    public void testSortedArrayToBST(){
        int[] arr = {-10,-3,0,5,9};
    }
    // [1,2,2,3,null,null,3,4,null,null,4]
    @Test
    public void testIsBalanced(){
        TreeNode t1 = new TreeNode(1,new TreeNode(2,new TreeNode(3),new TreeNode(4)),
                new TreeNode(3,new TreeNode(4),new TreeNode(3)));
        System.out.println(SolutionIsBalanced.isBalanced(t1));
    }

    @Test
    public void testMinDepth(){

    }

    @Test
    public void testTriangleGenerate(){
        System.out.println(SolutionTriangleGenerate.generate(5));
    }

    @Test
    public void testTriangleGetRow(){
        System.out.println(SolutionTriangleGetRow.getRow(3));
    }

    @Test
    public void testMaxProfit(){
        int[] prices = {7,6,4,3,1};
        System.out.println(SolutionMaxProfit.maxProfit(prices));
        int[] prices1 = {1,2,3,4,5};
        System.out.println(SolutionMaxProfit.maxProfit1(prices1));
    }

    @Test
    public void testPalindrome(){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(SolutionIsPalindrome.isPalindrome(s));
        System.out.println(SolutionIsPalindrome.isPalindrome("./"));
    }

    @Test
    public void testSingleNumber(){
        int[] nums = {4,1,2,1,2};
        System.out.println(SolutionSingleNumber.singleNumber(nums));
    }

    @Test
    public void testHasCycle(){

    }

    @Test
    public void testMinStack(){

    }
}
