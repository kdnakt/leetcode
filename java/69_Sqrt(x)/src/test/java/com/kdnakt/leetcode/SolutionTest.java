package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        assertEquals(2, sol.mySqrt(4));
    }

    @Test
    public void testExample2() {
        assertEquals(2, sol.mySqrt(8));
    }

    @Test
    public void testMaxValue() {
        assertEquals(46340, sol.mySqrt(2147483647));
    }

}
