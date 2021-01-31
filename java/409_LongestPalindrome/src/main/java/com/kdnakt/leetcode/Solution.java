package com.kdnakt.leetcode;

/**
 * Given a string s which consists of lowercase
 * or uppercase letters,
 * return the length of the longest palindrome
 * that can be built with those letters.
 * 
 * Letters are case sensitive, for example,
 * "Aa" is not considered a palindrome here.
 * 
 * Constraints:
 * 1 <= s.length <= 2000
 * s consists of lowercase and/or uppercase English letters only.
 */
public class Solution {

    public int longestPalindrome(String s) {
        int[] lowerUpper = new int[52];
        int res = 0;
        for (char c : s.toCharArray()) {
            int index = 'a' <= c && c <= 'z' ?
                    c - 97 : c - 65 + 26;
            if (lowerUpper[index] == 0) {
                lowerUpper[index] = 1;
            } else {
                lowerUpper[index] = 0;
                res += 2;
            }
        }
        for (int i : lowerUpper) {
            if (i == 1) {
                res += 1;
                break;
            }
        }
        return res;
    }

}
