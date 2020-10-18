package com.kdnakt.leetcode;

/**
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed,
 * the only constraint stopping you from robbing each of them is
 * that adjacent houses have security system connected
 * and it will automatically contact the police
 * if two adjacent houses were broken into on the same night.
 * 
 * Given a list of non-negative integers representing the amount
 * of money of each house, determine the maximum amount of money
 * you can rob tonight without alerting the police.
 * 
 * Constraints:
 * 0 <= nums.length <= 100
 * 0 <= nums[i] <= 400
 */
public class Solution {

    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        for (int i = 0; i < dp.length; i++) dp[i] = -1;
        return Math.max(solve(nums.length - 1, nums, dp),
                solve(nums.length - 2, nums, dp));
    }

    int solve(int index, int[] nums, int[] dp) {
        if (index < 0) return 0;
        if (dp[index] != -1) return dp[index];
        if (index == 0 || index == 1) {
            return dp[index] = nums[index];
        }
        int a = Math.max(
            solve(index - 2, nums, dp),
            solve(index - 3, nums, dp));
        return dp[index] = (a + nums[index]);
    }
}
