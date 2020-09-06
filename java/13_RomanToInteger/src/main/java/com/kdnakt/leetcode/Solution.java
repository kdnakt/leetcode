package com.kdnakt.leetcode;

/**
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 */
public class Solution {

    public int romanToInt(String s) {
        int res = 0;
        int prev = 0;
        int curr = 0;
        for (char c : s.toCharArray()) {
            res += curr = toInt(c);
            if (prev < curr) {
                res -= prev * 2;
            }
            prev = curr;
        }
        return res;
    }

    int toInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new RuntimeException("undefined:" + c);
        }
    }
}
