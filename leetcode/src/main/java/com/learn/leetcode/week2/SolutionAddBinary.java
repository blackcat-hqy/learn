package com.learn.leetcode.week2;

public class SolutionAddBinary {
    /**
     * 给你两个二进制字符串，返回它们的和（用二进制表示）。
     *
     * 输入为 非空 字符串且只包含数字 1 和 0。
     * @param a
     * @param b
     * @return
     */
    public static String addBinary(String a, String b) {
        String ans = "";
        int i = a.length()-1;
        int j = b.length()-1;
        int c = 0;
        while(i>=0||j>=0){
            int s = c;
            if(i>=0)
                s+=a.charAt(i)-'0';
            if(j>=0)
                s+=b.charAt(j)-'0';
            c = s/2;
            s -= 2*c;
            ans = s + ans;
            i--;
            j--;
        }
        if(c>0)
            ans = c + ans;
        return ans;
    }
}
