package com.kdnakt.leetcode;

/**
 * Say you have an array prices for which the ith element
 * is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit.
 * You may complete as many transactions as you like
 * (i.e., buy one and sell one share of the stock multiple times).
 * Note: You may not engage in multiple transactions at the same time
 * (i.e., you must sell the stock before you buy again).
 * Constraints:
 * 1 <= prices.length <= 3 * 10 ^ 4
 * 0 <= prices[i] <= 10 ^ 4
 */
public class Solution {

    int[] dp;
    public int maxProfit(int[] prices) {
        boolean hasProfit = false;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                hasProfit = true;
                break;
            }
        }
        if (!hasProfit) return 0;
        dp = new int[prices.length];
        for (int i = 0; i < prices.length; i++) dp[i] = -1;
        return solve(prices, 0);
    }

    int solve(int[] prices, int key) {
        if (prices.length <= key) return 0;
        if (dp[key] != -1) return dp[key];
        int max = 0;
        for (int i = key; i < prices.length - 1; i++) {
            int start = prices[i];
            if (start == 10000) continue;
            for (int j = i + 1; j < prices.length; j++) {
                int curr = prices[j] - start;
                if (curr <= 0) continue;
                if (j + 1 < prices.length) curr += solve(
                        prices,
                        j + 1);
                max = Math.max(max, curr);
            }
        }
        return dp[key] = max;
    }

}
