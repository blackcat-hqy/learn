package com.learn.leetcode.week4;

/**
 * 给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
 */
public class NumArray {
    private int[] nums;
    private int[] sumTable;
    public NumArray(int[] nums) {
        this.nums = nums;
        this.sumTable = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            sumTable[i] = sum;
        }
    }

    public int sumRange(int i, int j) {
        return sumTable[j]-sumTable[i]+nums[i];
    }
}
