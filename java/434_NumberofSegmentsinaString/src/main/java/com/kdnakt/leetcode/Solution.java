package com.kdnakt.leetcode;

/**
 * You are given a string s, return the number of segments
 * in the string. 
 * 
 * A segment is defined to be a contiguous sequence of
 * non-space characters.
 * 
 * Constraints:
 * 0 <= s.length <= 300
 * s consists of lower-case and upper-case English letters,
 * digits or one of the following characters
 * "!@#$%^&*()_+-=',.:".
 * The only space character in s is ' '.
 */
public class Solution {

    public int countSegments(String s) {
        int count = 0;
        if (s == null || s.isEmpty()) return count;
        boolean lastCharSpace = true;
        for (int i = 0; i < s.length(); i++) {
            boolean isSpace = s.charAt(i) == ' ';
            if (lastCharSpace && !isSpace) {
                count++;
            }
            lastCharSpace = isSpace;
        }
        return count;
    }

}
