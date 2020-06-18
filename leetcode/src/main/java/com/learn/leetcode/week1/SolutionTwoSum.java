package com.learn.leetcode.week1;

import java.util.HashMap;
import java.util.Map;

public class SolutionTwoSum {
    /**
     * 给定一个整数数组 nums 和一个目标值 target，
     * 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。假设只有一个答案
     * @param nums 整数数组
     * @param target 目标值
     * @return 两个整数的下标
     */

    // 蛮力法 直接一个一个试
    public static int[] twoSum1(int[] nums, int target) {
        int[] res = new int[2];
        int i = -1;
        boolean find = false;
        while (++i<nums.length&&!find){
            int r = target - nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (r == nums[j]){
                    res[0] = i;
                    res[1] = j;
                    find = true;
                    break;
                }
            }
        }
        return res;
    }

    // 直接使用字典做，速度最快
    public static int[] twoSum2(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        // 初始化字典
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int r = target-nums[i];
            if(map.containsKey(r)){
                res[0] = i;
                res[1] = map.get(r);
                // 易错点，不能使用一个元素两次
                if(res[1]!=i)
                    break;
            }
        }
        return res;
    }
}
