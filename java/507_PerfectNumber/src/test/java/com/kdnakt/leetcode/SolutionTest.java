package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int num = 28;
        assertTrue(sol.checkPerfectNumber(num));
    }

    @Test
    public void testExample2() {
        int num = 6;
        assertTrue(sol.checkPerfectNumber(num));
    }

    @Test
    public void testExample3() {
        int num = 496;
        assertTrue(sol.checkPerfectNumber(num));
    }

    @Test
    public void testExample4() {
        int num = 8128;
        assertTrue(sol.checkPerfectNumber(num));
    }

    @Test
    public void testExample5() {
        int num = 2;
        assertFalse(sol.checkPerfectNumber(num));
    }

    @Test
    public void testExample6() {
        int num = 1;
        assertFalse(sol.checkPerfectNumber(num));
    }

}
