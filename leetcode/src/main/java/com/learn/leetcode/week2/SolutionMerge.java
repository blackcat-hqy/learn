package com.learn.leetcode.week2;

import java.util.Arrays;

public class SolutionMerge {
    /**
     * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
     *
     *  
     *
     * 说明:
     *
     * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
     * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tmpNums1 = Arrays.copyOf(nums1,m);
        int i = 0;
        int j = 0;
        int k = 0;
        while(k<m+n){
            if(i == m){
                nums1[k] = nums2[j++];
            }else  if(j == n){
                nums1[k] = tmpNums1[i++];
            }else if(tmpNums1[i]>nums2[j]){
                nums1[k] = nums2[j++];
            }else{
                nums1[k] = tmpNums1[i++];
            }
            k++;
        }
    }
}
