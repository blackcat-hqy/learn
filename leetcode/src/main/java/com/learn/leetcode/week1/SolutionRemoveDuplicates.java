package com.learn.leetcode.week1;

public class SolutionRemoveDuplicates {
    /**
     * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums){
        if (nums.length ==0)
            return 0;
        int index = -1;
        int len = 0;
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(last!=nums[i]){
                nums[++index] = last;
                len++;
            }
            last = nums[i];
        }
        nums[++index] = nums[nums.length-1];
        len++;
        return len;
    }
}
