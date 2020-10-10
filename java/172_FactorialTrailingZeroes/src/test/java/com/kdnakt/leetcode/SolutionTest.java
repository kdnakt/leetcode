package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertEquals(0, sol.trailingZeroes(3));
    }

    @Test
    public void testExample2() {
        assertEquals(1, sol.trailingZeroes(5));
    }

    @Test
    public void testExample3() {
        assertEquals(0, sol.trailingZeroes(0));
    }

    @Test
    public void testExample4() {
        assertEquals(21, sol.trailingZeroes(90));
    }
}
