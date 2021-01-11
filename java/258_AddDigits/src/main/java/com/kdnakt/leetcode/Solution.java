package com.kdnakt.leetcode;

/**
 * Given a non-negative integer num,
 * repeatedly add all its digits
 * until the result has only one digit.
 */
public class Solution {

    public int addDigits(int num) {
        if (num < 10) return num;
        int res = 0;
        while (num > 0) {
            int temp = num % 10;
            res += temp;
            num -= temp;
            num /= 10;
        }
        return addDigits(res);
    }

}
