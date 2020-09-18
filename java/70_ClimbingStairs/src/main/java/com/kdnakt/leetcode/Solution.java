package com.kdnakt.leetcode;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps.
 * In how many distinct ways can you climb to the top?
 * 
 * Constraints:
 * 1 <= n <= 45
 */
public class Solution {
    private int[] dp;
    public int climbStairs(int n) {
        dp = new int[n];
        for (int i = 0; i < n; i++) dp[i] = -1;
        return dfs(n);
    }

    int dfs(int pos) {
        if (pos < 0) return 0;
        if (pos == 0) return 1;// start
        if (dp[pos-1] != -1) return dp[pos-1];
        return dp[pos-1] = dfs(pos-1) + dfs(pos-2);
    }

}
