package com.kdnakt.leetcode;

/**
 * Follow up:
 * Coud you solve it without converting the integer to a string?
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int org = x;
        int reversed = 0;
        while (x > 0) {
            reversed *= 10;
            reversed += x % 10;
            x /= 10;
        }
        return org == reversed;
    }
}
