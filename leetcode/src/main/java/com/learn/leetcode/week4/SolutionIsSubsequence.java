package com.learn.leetcode.week4;

public class SolutionIsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        for (; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean find = false;
            for (; j < t.length(); j++) {
                if(c == t.charAt(j)){
                    find = true;
                    j++;
                    break;
                }
            }
            if(!find)
                return false;
        }
        return i == s.length();
    }


}
