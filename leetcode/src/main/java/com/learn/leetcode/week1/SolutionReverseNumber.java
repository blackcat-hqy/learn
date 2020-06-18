package com.learn.leetcode.week1;

public class SolutionReverseNumber {
    /**
     * 数字逆转
     * @param x
     * @return 翻转后的数字
     */
    public static int reverse1(int x) {
        StringBuilder s = new StringBuilder(String.valueOf(x));

        int start = 0;
        int end = s.length()-1;
        if(s.charAt(0) == '-')
            start = 1;
        while(start<end){
            char tmp = s.charAt(start);
            s.setCharAt(start,s.charAt(end));
            s.setCharAt(end,tmp);

            start++;
            end--;
        }
        Long res = Long.valueOf(s.toString());
        if(res<Integer.MIN_VALUE||res>Integer.MAX_VALUE)
            return 0;
        return res.intValue();
    }

    public static int reverse(int x){
        long n = 0;
        while(x!=0){
            n = n*10 + x%10;
            x /=10;
        }
        return (int)n==n?(int)n:0;
    }
}
