package com.learn.leetcode.week1;

public class SolutionLongestCommonPrefix {
    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     * 如果不存在公共前缀，返回空字符串 ""。
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if(strs.length == 0)
            return prefix;
        if(strs.length == 1)
            return strs[0];

        boolean stop = false;
        int i = 0;
        while(!stop){
            if(i>=strs[0].length())
                break;
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if(i>=strs[j].length()||c!=strs[j].charAt(i)){
                    stop = true;
                    break;
                }
            }
            if(!stop)
                prefix += c;
            i++;
        }
        return prefix;
    }
}
