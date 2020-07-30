package com.learn.leetcode.week3;

public class SolutionHammingWeight {
    /**
     * 编写一个函数，输入是一个无符号整数，
     * 返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
     * @param n
     * @return
     */
    public static int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += (n>>i)&1;
        }
        return count;
    }
}
