package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertTrue(sol.isHappy(19));
    }

    @Test
    public void testExample2() {
        assertFalse(sol.isHappy(9));
    }

    @Test
    public void testExample3() {
        assertTrue(sol.isHappy(1));
    }

    @Test
    public void testExample4() {
        assertTrue(sol.isHappy(7));
    }

    @Test
    public void testExample5() {
        assertFalse(sol.isHappy(11));
    }

}
