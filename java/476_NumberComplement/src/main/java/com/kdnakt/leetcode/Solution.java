package com.kdnakt.leetcode;

/**
 * Given a positive integer num,
 * output its complement number.
 * The complement strategy is to flip the bits of
 * its binary representation.
 * 
 * Constraints:
 * The given integer num is guaranteed to fit within the range of
 *   a 32-bit signed integer.
 * num >= 1
 * You could assume no leading zero bit
 *   in the integer’s binary representation.
 * This question is the same as 1009:
 *   https://leetcode.com/problems/complement-of-base-10-integer/
 */
public class Solution {

    public int findComplement(int num) {
        int b = 1;
        while (b - 1 < num) {
            b *= 2;
        }
        return b - num - 1;
    }

}
