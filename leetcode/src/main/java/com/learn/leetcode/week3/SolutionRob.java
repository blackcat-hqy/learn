package com.learn.leetcode.week3;

import java.util.Arrays;

public class SolutionRob {
    /**
     * 你是一个专业的小偷，计划偷窃沿街的房屋。
     * 每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
     * <p>
     * 给定一个代表每个房屋存放金额的非负整数数组，
     * 计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
     * f(n) = max(f(n-2) + A[n],f(n-1))
     * F(n) = Max(f(n))
     * @param nums
     * @return
     */
    public static int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return doRob(nums,dp,nums.length-1);
    }

    private static int doRob(int[] nums,int[] dp,int n){
        int rval = 0;
        if(n<0)
            return Integer.MIN_VALUE;
        else if(n == 0)
            rval = nums[0];
        else if(n == 1)
            rval = Math.max(nums[0],nums[1]);
        else if(dp[n]>=0){
            rval = dp[n];
        }else{
            rval = Math.max(doRob(nums,dp,n-2) +nums[n],doRob(nums,dp,n-1));
        }
        dp[n] = rval;
        return rval;
    }
}
