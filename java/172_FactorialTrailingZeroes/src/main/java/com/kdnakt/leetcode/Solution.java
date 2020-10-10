package com.kdnakt.leetcode;

/**
 * Given an integer n, return the number of trailing zeroes in n!.
 * Follow up: Could you write a solution
 * that works in logarithmic time complexity?
 * 
 * Constraints:
 * 1 <= n <= 10^4
 */
public class Solution {

    public int trailingZeroes(int n) {
        int zeroes = 0;
        int p = 5;
        do {
            zeroes += n / p;
            p *= 5;
        } while (p <= n);
        return zeroes;
    }

}
