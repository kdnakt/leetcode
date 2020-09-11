package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertEquals(2, sol.strStr("hello", "ll"));
    }

    @Test
    public void testExample2() {
        assertEquals(-1, sol.strStr("aaaaa", "bba"));
    }

    @Test
    public void testEmtyNeedleReturnsZero() {
        assertEquals(0, sol.strStr("hello", ""));
    }

}
