package com.kdnakt.leetcode;

public class Solution {

    private static final int A = 2147483647;

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        if (n == -1) return 32;
        if (n == -2 || n == -3) return 31;
        if (n < -3) {
            int r = n % 2;
            int w = hammingWeight(n + A + r);
            if (w == 32) return 1;
            return 31 - w;
        }
        int res = 0;
        int base = 2;
        while (n > 0) {
            if (n % base != 0) res++;
            n -= n % base;
            base *= 2;
        }
        return res;
    }
}
