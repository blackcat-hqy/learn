package com.learn.leetcode.week2;

import java.util.Arrays;

public class SolutionPlusOne {
    /**
     * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
     *
     * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
     *
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        if(digits.length==0)
            return null;
        int i = digits.length-1;
        int c = 1;
        while(c>0&&i>=0){
            digits[i] = digits[i]+c;
            c = digits[i]/10;
            digits[i] -= 10*c;
            i--;
        }

        int[] ans = digits;
        if(c>0&&i<0){
            ans = new int[digits.length+1];
            ans[0] = 1;
            for (int j = 1; j < ans.length; j++) {
                ans[j] = digits[j-1];
            }
        }
        return  ans;
    }
}
