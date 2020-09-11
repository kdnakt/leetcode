package com.kdnakt.leetcode;

public class Solution {

    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null ||  needle.length() == 0) return 0;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (needle.equals(haystack.substring(i, i + needle.length()))) {
                return i;
            }
        }
        return -1;
    }

}
