package com.kdnakt.leetcode;

public class Solution {

    public int titleToNumber(String s) {
        int res = 0;
        int p = 1;
        for (int i = 0; i < s.length(); i++) {
            int index = s.length() - 1 - i;
            char c = s.charAt(index);
            res += (c - 64) * p;
            p *= 26;
        }
        return res;
    }

}
