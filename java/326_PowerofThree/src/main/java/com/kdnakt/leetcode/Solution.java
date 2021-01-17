package com.kdnakt.leetcode;

/**
 * Given an integer n,
 * return true if it is a power of three.
 * Otherwise, return false.
 * 
 * An integer n is a power of three,
 * if there exists an integer x such that n == 3^x.
 * 
 * Constraints:
 * -2^31 <= n <= 2^31 - 1
 */
public class Solution {

    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 3 == 0) return isPowerOfThree(n / 3);
        return false;
    }
}
