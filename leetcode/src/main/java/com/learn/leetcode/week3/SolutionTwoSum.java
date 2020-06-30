package com.learn.leetcode.week3;

import java.util.HashMap;

public class SolutionTwoSum {
    /**
     * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
     *
     * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
     *
     * 说明:
     *
     * 返回的下标值（index1 和 index2）不是从零开始的。
     * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            if(!map.containsKey(numbers[i])){
                map.put(numbers[i],i);
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            Integer r = target - numbers[i];
            if(map.containsKey(r)){
                ans[0] = i;
                ans[1] = map.get(r);
                break;
            }
        }
        if(ans[0]==ans[1])
            ans[1]+=1;
        ans[0]+=1;
        ans[1]+=1;
        return ans;
    }
}
