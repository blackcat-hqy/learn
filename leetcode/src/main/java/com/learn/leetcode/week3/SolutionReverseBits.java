package com.learn.leetcode.week3;

public class SolutionReverseBits {
    /**
     * 颠倒给定的 32 位无符号整数的二进制位。
     * @param n
     * @return
     */
    public static int reverseBits(int n) {
        int val = 0;
        for (int i = 0; i < 32; i++) {
            val += ((n>>i)&1)<<(31-i);
        }
        return val;
    }
}
