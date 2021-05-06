package com.kdnakt.leetcode;

/**
 * The Hamming distance between two integers
 * is the number of positions
 * at which the corresponding bits are different.
 * 
 * Given two integers x and y,
 * return the Hamming distance between them.
 * 
 * Constraints:
 * 0 <= x, y <= 23^1 - 1
 */
public class Solution {

    public int hammingDistance(int x, int y) {
        if (x == 0 && y == 0) return 0;
        int res = 0;
        int mx = x % 2;
        int my = y % 2;
        if (mx != my) {
            res++;
        }

        return res + hammingDistance((x - mx) / 2, (y - my) / 2);
    }

}
