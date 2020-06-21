package com.learn.leetcode.week1;

public class SolutionStrStr {
    public static int strStr(String haystack, String needle) {
        if("".equals(needle))
            return 0;
        int index = -1;
        for (int i = 0; i <= haystack.length()-needle.length(); i++) {
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                index = i;
                break;
            }
        }
        return index;
    }
}
