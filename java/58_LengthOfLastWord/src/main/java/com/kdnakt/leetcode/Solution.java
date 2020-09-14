package com.kdnakt.leetcode;

/**
 * Given a string s consists of upper/lower-case alphabets and
 * empty space characters ' ', return the length of last word
 * (last word means the last appearing word if we loop from left to right)
 * in the string.
 * 
 * If the last word does not exist, return 0.
 */
public class Solution {

    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) return 0;
        int lastIndex = s.lastIndexOf(' ');
        int len = s.length();
        if (len == lastIndex + 1) {
            return lengthOfLastWord(s.substring(0,lastIndex));
        }
        return len - lastIndex - 1;
    }

}
