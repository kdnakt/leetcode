package com.kdnakt.leetcode;

import java.util.Arrays;

/**
 * Given two strings s and t ,
 * write a function to determine if t is an anagram of s.
 * 
 * Note:
 * You may assume the string contains only lowercase alphabets.
 */
public class Solution {

    public boolean isAnagram(String s, String t) {
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        return Arrays.equals(sa, ta);
    }

}
