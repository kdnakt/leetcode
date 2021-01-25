package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        String ransomNote = "a", magazine = "b";
        assertFalse(sol.canConstruct(ransomNote, magazine));
    }

    @Test
    public void testExample2() {
        String ransomNote = "aa", magazine = "ab";
        assertFalse(sol.canConstruct(ransomNote, magazine));
    }

    @Test
    public void testExample3() {
        String ransomNote = "aa", magazine = "aab";
        assertTrue(sol.canConstruct(ransomNote, magazine));
    }
}
