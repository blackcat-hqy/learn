package com.learn.leetcode.week2;

public class SolutionSqrt {
    /**
     * 实现 int sqrt(int x) 函数。
     *
     * 计算并返回 x 的平方根，其中 x 是非负整数。
     *
     * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
     * @param x
     * @return
     */
    public static int mySqrt(int x) {
        double last = 1;
        last = (last + x/last)/2;
        while(last*last-x>0.1){
            last = (last + x/last)/2;
        }
        return (int)last;
    }
}
