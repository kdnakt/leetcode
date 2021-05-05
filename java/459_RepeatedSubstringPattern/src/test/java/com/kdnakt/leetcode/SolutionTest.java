package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        String s = "abab";
        assertTrue(sol.repeatedSubstringPattern(s));
    }

    @Test
    public void testExample2() {
        String s = "aba";
        assertFalse(sol.repeatedSubstringPattern(s));
    }

    @Test
    public void testExample3() {
        String s = "abcabcabcabc";
        assertTrue(sol.repeatedSubstringPattern(s));
    }

    @Test
    public void testExample4() {
        String s = "a";
        assertFalse(sol.repeatedSubstringPattern(s));
    }

    @Test
    public void testExample5() {
        String s = "aabaaba";
        assertFalse(sol.repeatedSubstringPattern(s));
    }

}
