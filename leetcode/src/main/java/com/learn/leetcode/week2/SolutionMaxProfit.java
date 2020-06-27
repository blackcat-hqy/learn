package com.learn.leetcode.week2;

public class SolutionMaxProfit {
    /**
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     *
     * 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
     *
     * 注意：你不能在买入股票前卖出股票。
     *  max(f[i]-f[j]) i>j
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        if(0 == prices.length || 1 == prices.length)
            return 0;
        int maxNum = 0;
        int f = Integer.MIN_VALUE;
        int minVal = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>prices[i-1]){
               f = prices[i]-minVal;
            }
            if(f>maxNum){
                maxNum = f;
            }
            if(prices[i]<minVal){
                minVal = prices[i];
            }
        }
        return maxNum;
    }

    /**
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     *
     * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
     *
     * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
     *
     * @param prices
     * @return
     */
    public static int maxProfit1(int[] prices) {
        if( 0 == prices.length || 1 == prices.length)
            return 0;
        int maxNum = 0;
        int minVal = prices[0];
        boolean rise = false;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>prices[i-1]){
                rise = true;
            }else{
                if(rise){
                    maxNum += prices[i-1] - minVal;
                    minVal = prices[i-1];
                }
                rise = false;
            }
            if(prices[i]<minVal){
                minVal = prices[i];
            }
        }
        if(rise){
            maxNum += prices[prices.length - 1]-minVal;
        }
        return maxNum;
    }
}
