package com.learn.leetcode.week3;

public class SolutionTitleToNumber {
    public static int titleToNumber(String s) {
        int base = 1;
        int val = 0;
        for (int i = s.length()-1; i >=0; i--) {
            char c = s.charAt(i);
            val += (c-'A'+1)*base;
            base *= 26;
        }
        return val;
    }
}
