package com.learn.leetcode.week2;

public class SolutionMaxSubArray {
    /**
     * 给定一个整数数组 nums ，
     * 找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        if(nums.length == 0)
            return Integer.MIN_VALUE;
        int sum = nums[0];
        int f = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(f<0){
                f = nums[i];
            }else{
                f += nums[i];
            }
            if(f>sum){
                sum = f;
            }
        }
        return sum;
    }
}
