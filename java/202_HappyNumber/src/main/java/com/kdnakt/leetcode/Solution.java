package com.kdnakt.leetcode;

/**
 * Write an algorithm to determine if a number n is "happy".
 * A happy number is a number defined by the following process:
 * Starting with any positive integer, replace the number
 * by the sum of the squares of its digits,
 * and repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy numbers.
 * 
 * Return True if n is a happy number, and False if not.
 */
public class Solution {

    public boolean isHappy(int n) {
        if (n == 1 || n == 7) return true;
        if (n < 10) return false;
        int sumOfSquares = 0;
        while (n > 0) {
            int digit = n % 10;
            sumOfSquares += digit * digit;
            n /= 10;
        }
        if (sumOfSquares == 1) return true;
        return isHappy(sumOfSquares);
    }

}
