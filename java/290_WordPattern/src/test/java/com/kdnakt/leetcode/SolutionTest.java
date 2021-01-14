package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        String pattern = "abba", s = "dog cat cat dog";
        assertTrue(sol.wordPattern(pattern, s));
    }

    @Test
    public void testExample2() {
        String pattern = "abba", s = "dog cat cat fish";
        assertFalse(sol.wordPattern(pattern, s));
    }

    @Test
    public void testExample3() {
        String pattern = "aaaa", s = "dog cat cat dog";
        assertFalse(sol.wordPattern(pattern, s));
    }

    @Test
    public void testExample4() {
        String pattern = "abba", s = "dog dog dog dog";
        assertFalse(sol.wordPattern(pattern, s));
    }

    @Test
    public void testDifferentCount() {
        String pattern = "aaa", s = "dog dog dog dog";
        assertFalse(sol.wordPattern(pattern, s));
    }
}
