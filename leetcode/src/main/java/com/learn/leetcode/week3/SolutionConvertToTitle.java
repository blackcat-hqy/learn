package com.learn.leetcode.week3;

public class SolutionConvertToTitle {
    /**
     * 26进制
     * @param n
     * @return
     */
    public static String convertToTitle(int n) {
        String ans = "";
        while(0!=n){
            ans = (char)('A'+(n-1)%26) + ans;
            n = (n-1)/26;
        }
        return ans;
    }
}
