package com.learn.leetcode.week3;

import java.util.Arrays;

public class SolutionRotateArray {
    /**
     * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
     * 最简单方法，直接复制一个出来
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        int[] oldNums = Arrays.copyOf(nums,nums.length);
        for (int i = 0; i < nums.length; i++) {
            nums[(i+k)%nums.length] = oldNums[i];
        }
    }

    public static void rotate1(int[] nums,int k) {
        swap(nums, 0, nums.length - 1);
        k = k % nums.length;
        swap(nums,0,k-1);
        swap(nums,k,nums.length-1);
    }

    private static void swap(int[] nums,int start,int end){
        int i = start;
        int j = end;
        while(i<j){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }
}
