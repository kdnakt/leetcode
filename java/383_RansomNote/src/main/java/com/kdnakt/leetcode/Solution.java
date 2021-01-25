package com.kdnakt.leetcode;

/**
 * Given an arbitrary ransom note string
 * and another string containing letters
 * from all the magazines,
 * write a function that will return true
 * if the ransom note can be constructed from the magazines;
 * otherwise, it will return false.
 * 
 * Each letter in the magazine string can only be used once
 * in your ransom note.
 * 
 * Constraints:
 * You may assume that both strings contain
 * only lowercase letters.
 */
public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || ransomNote.isEmpty()) return true;
        if (magazine == null || magazine.isEmpty()) return false;
        int[] lastIndexes = new int[26];
        for (int i = 0; i < 26; i++) lastIndexes[i] = -1;
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            int letterIndex = c - 97;
            int index = magazine.indexOf(c, lastIndexes[letterIndex] + 1);
            if (index == -1) return false;
            lastIndexes[letterIndex] = index;
        }
        return true;
    }

}
