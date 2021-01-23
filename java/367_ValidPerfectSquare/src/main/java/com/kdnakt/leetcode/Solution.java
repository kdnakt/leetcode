package com.kdnakt.leetcode;

/**
 * Given a positive integer num,
 * write a function which returns True
 * if num is a perfect square else False.
 * 
 * Follow up: Do not use any built-in library function
 * such as sqrt.
 * 
 * Constraints:
 * 1 <= num <= 2^31 - 1
 */
public class Solution {

    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        for (int i = 0; i < num; i++) {
            long s = i * i; 
            if (s == num) return true;
            if (s > num) return false;
        }
        return false;
    }

}
