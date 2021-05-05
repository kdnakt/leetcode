package com.kdnakt.leetcode;

/**
 * Given a string s, check if it can be constructed
 * by taking a substring of it
 * and appending multiple copies of the substring together.
 * 
 * Constraints:
 * 1 <= s.length <= 10^4
 * s consists of lowercase English letters.
 */
public class Solution {

    public boolean repeatedSubstringPattern(String s) {
        if (s.length() == 1) return false;
        char[] org = s.toCharArray();
        for (int i = 1; i <= s.length() / 2; i++) {
            boolean temp = true;
            for (int j = i; j < s.length(); j += i) {
                int end = j + i;
                if (s.length() < end) {
                    temp = false;
                    break;
                }
                for (int k = 0; k < i; k++) {
                    if (org[k] != org[j + k]) {
                        temp = false;
                        break;
                    }
                }
                if (!temp) break;
            }
            if (temp) return true;
        }
        return false;
    }

}
