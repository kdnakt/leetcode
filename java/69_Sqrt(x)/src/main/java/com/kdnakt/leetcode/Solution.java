package com.kdnakt.leetcode;

/**
 * Compute and return the square root of x,
 * where x is guaranteed to be a non-negative integer.
 * Since the return type is an integer,
 * the decimal digits are truncated
 * and only the integer part of the result is returned.
 */
public class Solution {

    public int mySqrt(int x) {
        return solve(23170, 46340, x);
    }
    
    int solve(int mid, int org, int x) {
        if (mid == org) return mid;
        int s1 = mid * mid;
        int s2 = (mid+1) * (mid+1);
        if (s1 <= x && x < s2) return mid;
        if (s2 == x) return mid+1;
        if (x < s1) return solve(mid/2, mid, x);
        return solve((org+mid+1)/2, org, x);
    }

}
