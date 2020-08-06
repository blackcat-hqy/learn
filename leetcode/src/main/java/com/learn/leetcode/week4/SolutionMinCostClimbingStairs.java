package com.learn.leetcode.week4;

import java.util.Arrays;

/**
 * 数组的每个索引作为一个阶梯，第 i个阶梯对应着一个非负数的体力花费值 cost[i](索引从0开始)。
 *
 * 每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯。
 *
 * 您需要找到达到楼层顶部的最低花费。在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯。
 *  f[n] = min(f[n-2] + cost[n-2],f[n-1]+cost[n-1])
 *  n-1 -> n  cost[n-1]
 *  n-2 ->n cost[n-2]
 */
public class SolutionMinCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int[] f = new int[cost.length+1];
        Arrays.fill(f,-1);
        return doMinCostClimbingStairs(cost,f,cost.length);
    }

    private static int doMinCostClimbingStairs(int[] cost,int[] f,int n){
        if(n == 0 || n == 1)
            return 0;
        if(n<0)
            return Integer.MAX_VALUE;
        if(f[n]>=0)
            return f[n];
        int res = Math.min(doMinCostClimbingStairs(cost,f,n-1)+cost[n-1],
                doMinCostClimbingStairs(cost,f,n-2)+cost[n-2]);
        f[n] = res;
        return f[n];
    }
}
