package com.leetcode.problems;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
//time - O(n), space - O(1)
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int buy = 0, sell = 1, profit = 0;

        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(profit, prices[sell] - prices[buy]);

            if (prices[sell] < prices[buy]) {
                buy = sell;
            }
            sell++;
        }
        return profit;
    }
}
