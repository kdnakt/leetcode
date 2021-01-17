package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertTrue(sol.isPowerOfThree(27));
    }

    @Test
    public void testExample2() {
        assertFalse(sol.isPowerOfThree(0));
    }

    @Test
    public void testExample3() {
        assertTrue(sol.isPowerOfThree(9));
    }

    @Test
    public void testExample4() {
        assertFalse(sol.isPowerOfThree(45));
    }

}
