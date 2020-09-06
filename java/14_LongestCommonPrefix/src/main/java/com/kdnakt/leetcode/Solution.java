package com.kdnakt.leetcode;

/**
 * All given inputs are in lowercase letters a-z.
 */
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String candidate = strs[0];
        String res = "";
        int i = 0;
        for (; i < candidate.length(); i++) {
            if (!isSameChar(strs, i)) {
                break;
            }
        }
        return candidate.substring(0, i);
    }

    boolean isSameChar(String[] strs, int index) {
        for (int i = 0; i < strs.length - 1; i++) {
            String str = strs[i];
            String next = strs[i+1];
            if (str == null || str.length() == index
                    || next == null || next.length() == index) {
                return false;
            }
            if (str.charAt(index) != next.charAt(index)) {
                return false;
            }
        }
        return true;
    }

}
