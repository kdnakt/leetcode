package com.kdnakt.leetcode;

public class Solution {
    public int reverse(int x) {
        if (x < 0) {
            return 0 - reverse(String.valueOf(0 - x));
        }
        return reverse(String.valueOf(x));
    }

    int reverse(String x) {
        try {
            return Integer.valueOf(
                    new StringBuilder(x).reverse().toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
