package com.kdnakt.leetcode;

/**
 * You are given a license key represented as a string s
 * that consists of only alphanumeric characters and dashes.
 * The string is separated into n + 1 groups by n dashes.
 * You are also given an integer k.
 * 
 * We want to reformat the string s such that
 * each group contains exactly k characters,
 * except for the first group,
 * which could be shorter than k
 * but still must contain at least one character.
 * Furthermore, there must be a dash inserted
 * between two groups, and you should convert
 * all lowercase letters to uppercase.
 * 
 * Return the reformatted license key.
 * 
 * Constraints:
 * 1 <= s.length <= 10^5
 * s consists of English letters, digits, and dashes '-'.
 * 1 <= k <= 10^4
 */
public class Solution {

    public String licenseKeyFormatting(String s, int k) {
        char[] arr = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for (int i = arr.length - 1; 0 <= i; i--) {
            if (arr[i] == '-') {
                if (count == k) {
                    ans.insert(0, '-');
                    count = 0;
                }
            } else if (count == k) {
                ans.insert(0, '-').insert(0, Character.toUpperCase(arr[i]));
                count = 1;
            } else {
                ans.insert(0, Character.toUpperCase(arr[i]));
                count++;
            }
        }
        while (ans.length() > 0 && ans.charAt(0) == '-') {
            ans.deleteCharAt(0);
        }
        return ans.toString();
    }

}
