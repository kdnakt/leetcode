package com.kdnakt.leetcode;

/**
 * Given a string, determine if it is a palindrome,
 * considering only alphanumeric characters and ignoring cases.
 * 
 * Note: For the purpose of this problem,
 * we define empty string as valid palindrome.
 */
public class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        if (s.isEmpty()) return true;
        char[] carr = s.toCharArray();
        char[] arr = new char[carr.length];
        int count = 0;
        for (char c : carr) {
            if (('a' <= c && c <= 'z')
                || ('0' <= c && c <= '9')) {
                arr[count++] = c;
            } else if ('A' <= c && c <= 'Z') {
                arr[count++] = (char)(((int)c) + 32);
            }
        }
        for (int i = 0; i < count; i++) {
            if (arr[i] != arr[count - 1 - i]) return false;
        }        
        return true;
    }

}
