package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertTrue(sol.isUgly(6));
    }

    @Test
    public void testExample2() {
        assertTrue(sol.isUgly(8));
    }

    @Test
    public void testInclude5() {
        assertTrue(sol.isUgly(10));
    }

    @Test
    public void test1() {
        assertTrue(sol.isUgly(1));
    }

    @Test
    public void testExample3() {
        assertFalse(sol.isUgly(14));
    }

    @Test
    public void test0() {
        assertFalse(sol.isUgly(0));
    }
}
