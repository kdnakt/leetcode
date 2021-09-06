package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        String s = "PPALLP";
        assertTrue(sol.checkRecord(s));
    }

    @Test
    public void testExample2() {
        String s = "PPALLL";
        assertFalse(sol.checkRecord(s));
    }

    @Test
    public void testExample3() {
        String s = "PPALALP";
        assertFalse(sol.checkRecord(s));
    }
}
