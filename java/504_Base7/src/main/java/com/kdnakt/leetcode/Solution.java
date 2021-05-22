package com.kdnakt.leetcode;

/**
 * Given an integer num,
 * return a string of its base 7 representation.
 * 
 * Constraints:
 * -10^7 <= num <= 10^7
 */
public class Solution {

    public String convertToBase7(int num) {
        if (num == 0) return "0";
        int n = num;
        if (num < 0) {
            n *= -1;
        }
        StringBuilder ans = new StringBuilder();
        while (n > 0) {
            int val = n % 7;
            ans.insert(0, val);
            n -= val;
            n /= 7;
        }
        if (num < 0) {
            ans.insert(0, "-");
        }
        return ans.toString();
    }

}
