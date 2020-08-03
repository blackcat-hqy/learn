package com.learn.leetcode.week4;

/**
 * 统计所有小于非负整数 n 的质数的数量。
 */
public class SolutionCountPrimes {
    public static int countPrimes(int n) {
        if(n<=2)
            return 0;
        int[] array = new int[n];
        for (int i = 2; i < n; i++) {
            array[i]=i;
        }
        for (int i = 2; i < Math.sqrt(n)+1; i++) {
            int m = i;
            if(array[i] ==0)
                continue;
            while(i*m<n){
                array[i*m] = 0;
                m++;
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if(array[i]>0)
                count++;
        }
        return count;
    }
}
