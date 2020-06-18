package com.learn.leetcode.week1;

import com.learn.leetcode.Tool;
import org.junit.Test;

public class TestSolution {
    @Test
    public void testTwoSum(){
        int[] nums = {1,2,7,19};
        int target = 9;
        Tool.printArray(SolutionTwoSum.twoSum1(nums,target));
        Tool.printArray(SolutionTwoSum.twoSum2(nums,target));
        Tool.printArray(SolutionTwoSum1.twoSum(nums,target));
    }

    @Test
    public void testReverseNumber(){
        int number = 123;
        System.out.println(SolutionReverseNumber.reverse1(number));
        System.out.println(SolutionReverseNumber.reverse(number));
    }

    @Test
    public void testPalindrome(){
        int a = -123;
        int b = 123;
        int c = 12321;
        System.out.println(SolutionPalindrome.isPalindrome(a));
        System.out.println(SolutionPalindrome.isPalindrome(b));
        System.out.println(SolutionPalindrome.isPalindrome(c));
        System.out.println(SolutionPalindrome.isPolindrome1(a));
        System.out.println(SolutionPalindrome.isPolindrome1(b));
        System.out.println(SolutionPalindrome.isPolindrome1(c));
    }

    @Test
    public void testRomanToInt(){
        System.out.println(SolutionRomanToInt.romanToInt("III"));
        System.out.println(SolutionRomanToInt.romanToInt("IV"));
        System.out.println(SolutionRomanToInt.romanToInt("IX"));
        System.out.println(SolutionRomanToInt.romanToInt("LVIII"));
        System.out.println(SolutionRomanToInt.romanToInt("MCMXCIV"));
    }
}
