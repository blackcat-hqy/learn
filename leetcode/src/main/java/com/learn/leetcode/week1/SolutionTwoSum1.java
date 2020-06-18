package com.learn.leetcode.week1;

public class SolutionTwoSum1 {
    /*
    相比于上一题，给定的序列是升序排列的，并且序号从1开始
     */
    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int r = target - numbers[i];
            int start = i+1;
            int end = numbers.length-1;
            while(start<=end){
                int mid = (start+end)>>1;
                if(numbers[mid] == r){
                    res[0] = i;
                    res[1] = mid;
                    break;
                }else if(numbers[mid]>r){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }
        return res;
    }
}
