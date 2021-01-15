package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertFalse(sol.canWinNim(4));
    }

    @Test
    public void testExample2() {
        assertTrue(sol.canWinNim(1));
    }

    @Test
    public void testExample3() {
        assertTrue(sol.canWinNim(2));
    }

}
