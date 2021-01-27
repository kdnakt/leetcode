package com.kdnakt.leetcode;

/**
 * Given a string, find the first non-repeating character
 * in it and return its index.
 * If it doesn't exist, return -1.
 * 
 * Note: You may assume the string contains
 * only lowercase English letters.
 */
public class Solution {

    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) return -1;
        if (s.length() == 1) return 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return i;
            }
        }
        return -1;
    }

}
