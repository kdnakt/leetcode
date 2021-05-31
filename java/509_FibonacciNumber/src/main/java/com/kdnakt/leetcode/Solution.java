package com.kdnakt.leetcode;

/**
 * The Fibonacci numbers, commonly denoted F(n)
 * form a sequence, called the Fibonacci sequence,
 * such that each number is the sum of the two preceding ones,
 * starting from 0 and 1. That is,
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 * 
 * Constraints:
 * 0 <= n <= 30
 */
public class Solution {

    int[] cache = new int[32];

    public int fib(int n) {
        if (n < 2) return n;
        if (cache[n] != 0) return cache[n];
        int ans = fib(n - 1) + fib(n - 2);
        cache[n] = ans;
        return ans;
    }

}
