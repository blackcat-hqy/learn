package com.learn.leetcode.week2;

import com.learn.leetcode.Tool;
import com.learn.leetcode.week1.SolutionListCombine;
import com.learn.leetcode.week1.struct.ListNode;
import org.junit.Test;

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
}
