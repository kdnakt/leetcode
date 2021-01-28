package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testIExample1() {
        String s = "abc", t = "ahbgdc";
        assertTrue(sol.isSubsequence(s, t));
    }

    @Test
    public void testIExample2() {
        String s = "axc", t = "ahbgdc";
        assertFalse(sol.isSubsequence(s, t));
    }

}
