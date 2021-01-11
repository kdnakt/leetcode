package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertEquals(2, sol.addDigits(38));
    }

    @Test
    public void testSingleDigits() {
        assertEquals(9, sol.addDigits(9));
    }

    @Test
    public void testTwoDigitsWithoutMoveUp() {
        assertEquals(7, sol.addDigits(34));
    }
}
