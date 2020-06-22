package com.learn.leetcode.week2;

import com.learn.leetcode.Tool;
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
}
