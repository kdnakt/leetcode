package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertEquals(2, sol.climbStairs(2));
    }

    @Test
    public void testExample2() {
        assertEquals(3, sol.climbStairs(3));
    }

    @Test
    public void testMax() {
        assertEquals(1836311903, sol.climbStairs(45));
    }
}
