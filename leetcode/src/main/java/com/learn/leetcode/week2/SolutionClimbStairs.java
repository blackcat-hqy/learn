package com.learn.leetcode.week2;

public class SolutionClimbStairs {
    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     *
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        int[] f = new int[2];
        f[0] = 1;
        f[1] = 1;
        for (int i = 0; i < n-1; i++) {
            int tmp = f[1];
            f[1] = f[1] + f[0];
            f[0] = tmp;
        }
        return f[1];
    }
}
