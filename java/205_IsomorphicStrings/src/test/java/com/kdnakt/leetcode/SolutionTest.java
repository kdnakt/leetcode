package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        String s = "egg", t = "add";
        assertTrue(sol.isIsomorphic(s, t));
    }

    @Test
    public void testExample2() {
        String s = "foo", t = "bar";
        assertFalse(sol.isIsomorphic(s, t));
    }

    @Test
    public void testExample3() {
        String s = "paper", t = "title";
        assertTrue(sol.isIsomorphic(s, t));
    }

    @Test
    public void testExample4() {
        String s = "e!g", t = "add";
        assertFalse(sol.isIsomorphic(s, t));
    }
}
