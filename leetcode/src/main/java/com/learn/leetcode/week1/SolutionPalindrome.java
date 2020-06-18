package com.learn.leetcode.week1;

public class SolutionPalindrome {
    /**
     * 回文数判断
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int i = -1;
        int j = s.length();
        boolean ans = true;
        while(++i<--j){
            if(s.charAt(i) != s.charAt(j)){
                ans = false;
                break;
            }
        }
        return ans;
    }

    public static  boolean isPolindrome1(int x){
        if(x<0){
            return false;
        } else{
            int x_ = x;
            long y = 0;
            while(x_!=0){
                y = y*10 + x_%10;
                x_ /= 10;
            }
            return (int)y == x;
        }
    }
}
