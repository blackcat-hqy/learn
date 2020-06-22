package com.learn.leetcode.week2;

public class SolutionLengthOfLastWord {
    /**
     * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。
     * 如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
     *
     * 如果不存在最后一个单词，请返回 0 。
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {
        if(s.equals("")){
            return 0;
        }
        int length = 0;
        int index = s.length()-1;
        if(s.endsWith(" ")){
            while(index>=0&&s.charAt(index)==' ')
                --index;
        }
        for (int i = index; i>=0; i--) {
            if (s.charAt(i)!=' '){
                length++;
            }else{
                break;
            }
        }
        return length;
    }
}
