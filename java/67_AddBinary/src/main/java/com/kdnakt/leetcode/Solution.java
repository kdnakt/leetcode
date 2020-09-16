package com.kdnakt.leetcode;

/**
 * Given two binary strings, return their sum (also a binary string).
 * The input strings are both non-empty and contains only characters 1 or 0.
 * 
 * Constraints:
 * Each string consists only of '0' or '1' characters.
 * 1 <= a.length, b.length <= 10^4
 * Each string is either "0" or doesn't contain any leading zero.
 */
public class Solution {

    public String addBinary(String a, String b) {
        if ("0".equals(a)) return b;
        if ("0".equals(b)) return a;
        StringBuilder sb = new StringBuilder();
        char x = '0';
        char y = '0';
        int idx_a = a.length() - 1;
        int idx_b = b.length() - 1;
        boolean moveUp = false;
        while (idx_a >= 0 || idx_b >= 0) {
            if (idx_a < 0) {
                x = '0';
            } else {
                x = a.charAt(idx_a);
            }
            if (idx_b < 0) {
                y = '0';
            } else {
                y = b.charAt(idx_b);
            }
            if (x == '1' && y == '1') {
                sb.insert(0, moveUp ? '1' : '0');
                moveUp = true;
            } else if (x == '1' || y == '1') {
                sb.insert(0, moveUp ? '0' : '1');
                moveUp = moveUp;
            } else {
                sb.insert(0, moveUp ? '1' : '0');
                moveUp = false;
            }
            idx_a--;
            idx_b--;
        }
        if (moveUp) sb.insert(0, '1');
        return sb.toString();
    }

}
