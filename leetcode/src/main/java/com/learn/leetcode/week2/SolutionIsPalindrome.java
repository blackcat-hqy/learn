package com.learn.leetcode.week2;

public class SolutionIsPalindrome {
    /**
     * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
     *
     * 说明：本题中，我们将空字符串定义为有效的回文串。
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        if(0 == s.length())
            return true;
        int i = 0;
        int j = s.length()-1;
        s = s.toLowerCase();
        while(i<j){
            while(i<s.length()&&!(Character.isAlphabetic(s.charAt(i))||Character.isDigit(s.charAt(i))))
                i++;
            while(j>=0&&!(Character.isAlphabetic(s.charAt(j))||Character.isDigit(s.charAt(j))))
                j--;
            if(i>j)
                return true;
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
