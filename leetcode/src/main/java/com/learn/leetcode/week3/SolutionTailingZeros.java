package com.learn.leetcode.week3;

public class SolutionTailingZeros {
    /**
     * 给定一个整数 n，返回 n! 结果尾数中零的数量。
     * 数5的个数即可
     * @param n
     * @return
     */
    public static int trailingZeroes(int n) {
        int count = 0;
        while(n/5 != 0){
            count += n/5;
            n /= 5;
        }
        return count;
    }
}
