package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertEquals(321, sol.reverse(123));
    }

    @Test
    public void testExample2() {
        assertEquals(-321, sol.reverse(-123));
    }

    @Test
    public void testExample3() {
        assertEquals(21, sol.reverse(120));
    }

    @Test
    public void testOverInteger() {
        assertEquals(0, sol.reverse(1534236469));
    }
}
