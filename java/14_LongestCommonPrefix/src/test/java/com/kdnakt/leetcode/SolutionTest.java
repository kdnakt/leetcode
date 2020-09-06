package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExapmle1() {
        String[] strs = {"flower","flow","flight"};
        assertEquals("fl", sol.longestCommonPrefix(strs));
    }

    @Test
    public void testExapmle2() {
        String[] strs = {"dog","racecar","car"};
        assertEquals("", sol.longestCommonPrefix(strs));
    }

    @Test
    public void testEmpty() {
        String[] strs = {};
        assertEquals("", sol.longestCommonPrefix(strs));
    }
}
