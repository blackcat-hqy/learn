package com.learn.leetcode.week3;

public class SolutionMajorityElement {
    /**
     * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
     *
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     *
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        if(0 == nums.length)
            return -1;
        int major = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if(major!=nums[i]){
                count--;
            }else{
                count++;
            }
            if(0 > count){
                major = nums[i];
                count = 1;
            }
        }
        return major;
    }
}
