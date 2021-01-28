package com.kdnakt.leetcode;

/**
 * Given a string s and a string t,
 * check if s is subsequence of t.
 * 
 * A subsequence of a string is a new string
 * which is formed from the original string
 * by deleting some (can be none) of the characters
 * without disturbing the relative positions
 * of the remaining characters.
 * (ie, "ace" is a subsequence of "abcde" while "aec" is not).
 * 
 * Constraints:
 * 0 <= s.length <= 100
 * 0 <= t.length <= 10^4
 * Both strings consists only of lowercase characters.
 */
public class Solution {

    public boolean isSubsequence(String s, String t) {
        if (s.length() <= 1 && t.length() <= 1) return s.equals(t);
        int curr = 0;
        int found = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = curr; j < t.length(); j++) {
                if (c == t.charAt(j)) {
                    curr = j + 1;
                    found++;
                    break;
                }
            }
        }
        return found == s.length();
    }

}
