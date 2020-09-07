package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertTrue(sol.isValid("()"));
    }

    @Test
    public void testExample2() {
        assertTrue(sol.isValid("()[]{}"));
    }

    @Test
    public void testExample3() {
        assertFalse(sol.isValid("(]"));
    }

    @Test
    public void testExample4() {
        assertFalse(sol.isValid("([)]"));
    }

    @Test
    public void testExample5() {
        assertTrue(sol.isValid("{[]}"));
    }

    @Test
    public void testNotClosed() {
        assertFalse(sol.isValid("(("));
    }

    @Test
    public void testCloseFirst() {
        assertFalse(sol.isValid("){"));
    }
}
