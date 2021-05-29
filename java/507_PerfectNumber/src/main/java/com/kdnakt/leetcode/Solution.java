package com.kdnakt.leetcode;

/**
 * A perfect number is a positive integer
 * that is equal to the sum of its positive divisors,
 * excluding the number itself.
 * A divisor of an integer x is an integer
 * that can divide x evenly.
 * 
 * Given an integer n, return true if n is a perfect number,
 * otherwise return false.
 * 
 * Constraints:
 * 1 <= num <= 10^8
 */
public class Solution {

    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
            if (sum > num) return false;
        }
        return num == sum;
    }

}
