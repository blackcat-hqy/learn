package com.learn.leetcode.week3;

import com.learn.leetcode.Tool;
import com.learn.leetcode.week1.SolutionRemoveElement;
import com.learn.leetcode.week1.struct.ListNode;
import org.junit.Test;

public class TestSolution {
    @Test
    public void testGetIntersectionNode(){

    }

    @Test
    public void testTwoSum(){

    }

    @Test
    public void testConvertToTitle(){
        System.out.println(SolutionConvertToTitle.convertToTitle(28));
    }

    @Test
    public void testMajorElement(){
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(SolutionMajorityElement.majorityElement(nums));
    }

    @Test
    public void testTitleToNumber(){
        System.out.println(SolutionTitleToNumber.titleToNumber("AA"));
    }

    @Test
    public void testTailingZeros(){
        System.out.println(SolutionTailingZeros.trailingZeroes(10));
    }

    @Test
    public void testRotateArray(){
        int[] nums = {1,2,3,4,5,6,7,8};
        SolutionRotateArray.rotate1(nums,3);
        Tool.printArray(nums);
    }

    @Test
    public void testReverseBits(){
        System.out.println(SolutionReverseBits.reverseBits(43261596));
    }

    @Test
    public void testHammingWeight(){
        System.out.println(SolutionHammingWeight.hammingWeight(3));
    }

    @Test
    public void testRob(){
        int[] nums = {2,7,9,3,1};
        System.out.println(SolutionRob.rob(nums));
    }

    @Test
    public void testHappy(){
        System.out.println(SolutionHappy.isHappy(19));
    }

    @Test
    public void testRemoveElement(){
        ListNode head = new ListNode(1,new ListNode(1));
        ListNode node = SolutionRemoveElements.removeElements(head,1);

    }
}
