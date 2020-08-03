package com.learn.leetcode.week4;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 */
public class SolutionContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(s.contains(nums[i]))
                return false;
            s.add(nums[i]);
        }
        return true;
    }
}
