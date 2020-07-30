package com.learn.leetcode.week3;

import java.util.HashSet;
import java.util.Set;

/**
 * 编写一个算法来判断一个数 n 是不是快乐数。
 *
 * 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * 如果 可以变为  1，那么这个数就是快乐数。
 *
 */
public class SolutionHappy {
    public static boolean isHappy(int n) {
        boolean ans = true;
        Set<Integer> s = new HashSet<>();
        while(n!=1){
            n = compute(n);
            if(s.contains(n)) {
                ans = false;
                break;
            }
            s.add(n);
        }
        return ans;
    }

    public static int compute(int n){
        int ans = 0;
        do{
            int b = n%10;
            ans += b*b;
            n /=10;
        }while(n!=0);
        return ans;
    }
}
