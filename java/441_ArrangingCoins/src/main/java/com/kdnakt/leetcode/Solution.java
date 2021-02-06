package com.kdnakt.leetcode;

/**
 * You have a total of n coins that you want to form
 * in a staircase shape, where every k-th row must have
 * exactly k coins.
 * 
 * Given n, find the total number of full staircase rows
 * that can be formed.
 * 
 * n is a non-negative integer and fits within the range
 * of a 32-bit signed integer.
 */
public class Solution {

    public int arrangeCoins(int n) {
        if (n == 0) return 0;
        long result = (int) Math.sqrt(n);
        for (long i = result; i < n; i++) {
            long max = i * (i + 1) / 2;
            if (n < max) {
                break;
            }
            result = i;
        }
        return (int) result;
    }

}
