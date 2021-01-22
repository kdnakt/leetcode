package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertTrue(sol.isPerfectSquare(16));
    }

    @Test
    public void testExample2() {
        assertFalse(sol.isPerfectSquare(14));
    }

}
