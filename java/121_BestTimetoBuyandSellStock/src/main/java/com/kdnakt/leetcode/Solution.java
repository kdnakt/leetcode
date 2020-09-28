package com.kdnakt.leetcode;

/**
 * Say you have an array for which the ith element is the price
 * of a given stock on day i.
 * If you were only permitted to complete at most one transaction
 * (i.e., buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 * 
 * Note that you cannot sell a stock before you buy one.
 */
public class Solution {

    public int maxProfit(int[] prices) {
        int candidate = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int start = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                candidate = Math.max(prices[j] - start, candidate);
            }
        }
        return candidate;
    }

}
