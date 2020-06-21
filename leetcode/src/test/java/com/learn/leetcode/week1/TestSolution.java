package com.learn.leetcode.week1;

import com.learn.leetcode.Tool;
import com.learn.leetcode.week1.struct.ListNode;
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

    @Test
    public void testLongestCommonPrefix(){
        String[] s1 = {"flower","flow","flight"};
        String[] s2 = {"dog","racecar","car"};
        System.out.println(SolutionLongestCommonPrefix.longestCommonPrefix(s1));
        System.out.println(SolutionLongestCommonPrefix.longestCommonPrefix(s2));
    }

    @Test
    public void testIsBracketValid(){
        String s1 = "{[]}";
        String s2 = "([)]";
        System.out.println(SolutionIsBracketValid.isValid(s1));
        System.out.println(SolutionIsBracketValid.isValid(s2));
    }

    @Test
    public void testListCombine(){
        ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode l2 = new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode head = SolutionListCombine.mergeTwoLists(l1,l2);
        SolutionListCombine.printList(head);
    }

    @Test
    public void testRemoveDuplicates(){
        int[] nums = {0,0,1,1,1,2,2,3,3,4,4};
        System.out.println(SolutionRemoveDuplicates.removeDuplicates(nums));
        Tool.printArray(nums);
    }

    @Test
    public void testRemoveElement(){
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(SolutionRemoveElement.removeElement(nums,2));
        Tool.printArray(nums);
    }

    @Test
    public void testStrStr(){
        System.out.println(SolutionStrStr.strStr("hello","ll"));
        System.out.println(SolutionStrStr.strStr("aaaaa","bba"));
    }

    @Test
    public void testSearchInsert(){
        int[] nums1 = {1,3,5,6};
        int[] nums2 = {1,3,5,6};
        System.out.println(SolutionSearchInsert.searchInsert(nums1,0));
        System.out.println(SolutionSearchInsert.searchInsert(nums2,2));
    }

    @Test
    public void testCountAndSay(){
        System.out.println(SolutionCountAndSay.countAndSay(5));
    }
}
