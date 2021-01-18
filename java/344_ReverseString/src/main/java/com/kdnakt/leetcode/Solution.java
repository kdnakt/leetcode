package com.kdnakt.leetcode;

/**
 * Write a function that reverses a string.
 * The input string is given as an array of characters char[].
 * 
 * Do not allocate extra space for another array,
 * you must do this by modifying the input array in-place
 * with O(1) extra memory.
 * 
 * You may assume all the characters consist of
 * printable ascii characters.
 */
public class Solution {

    public void reverseString(char[] s) {
        if (s == null) return;
        for (int i = 0; i < (s.length - (s.length % 2))/ 2; i++) {
            char temp = s[i];
            int target = s.length - 1 - i;
            s[i] = s[target];
            s[target] = temp;
        }
    }

}
