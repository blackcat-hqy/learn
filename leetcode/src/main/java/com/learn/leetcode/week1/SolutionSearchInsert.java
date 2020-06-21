package com.learn.leetcode.week1;

public class SolutionSearchInsert {
    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，
     * 并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = -1;
        while(start<=end){
            mid = (start + end)>>1;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]>target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
