package com.learn.leetcode.week4;

/**
 * 判断一个数是否2的幂
 */
public class SolutionIsPowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        if(n<0)
            return false;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += (n>>i)&1;
            if(count>1)
                return false;
        }
        return count == 1;
    }
}
