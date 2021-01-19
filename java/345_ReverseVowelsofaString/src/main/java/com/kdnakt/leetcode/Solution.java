package com.kdnakt.leetcode;

/**
 * Write a function that takes a string as input
 * and reverse only the vowels of a string.
 */
public class Solution {

    public String reverseVowels(String s) {
        if (s == null || s.length() <= 1) return s;
        StringBuilder res = new StringBuilder(s);
        int lastVowelIndex = s.length() - 1;
        for (int i = 0; i < lastVowelIndex; i++) {
            if (isVowel(s.charAt(i))) {
                for (int j = lastVowelIndex; j > i; j--) {
                    if (isVowel(s.charAt(j))) {
                        lastVowelIndex = j - 1;
                        res.setCharAt(i, s.charAt(j));
                        res.setCharAt(j, s.charAt(i));
                        break;
                    }
                }
            }
        }
        return res.toString();
    }

    boolean isVowel(char c) {
        return c == 65 // A
            || c == 69 // E
            || c == 73 // I
            || c == 79 // O
            || c == 85 // U
            || c == 97 // a
            || c == 101 // e
            || c == 105 // i
            || c == 111 // o
            || c == 117; // u
    }

}
