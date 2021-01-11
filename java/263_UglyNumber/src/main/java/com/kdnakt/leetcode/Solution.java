package com.kdnakt.leetcode;

/**
 * Write a program to check whether a given number is
 * an ugly number.
 * 
 * Ugly numbers are positive numbers
 * whose prime factors only include 2, 3, 5.
 * 
 * Note:
 * 1 is typically treated as an ugly number.
 * Input is within the 32-bit signed integer range:
 * [−2^31, 2^31 − 1].
 */
public class Solution {

    public boolean isUgly(int num) {
        if (num == 0) return false;
        if (num == 1) return true;
        if (num % 2 == 0) return isUgly(num / 2);
        if (num % 3 == 0) return isUgly(num / 3);
        if (num % 5 == 0) return isUgly(num / 5);
        return false;
    }
}
