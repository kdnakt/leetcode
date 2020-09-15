package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int[] digits = {1,2,3};
        int[] expected = {1,2,4};
        assertArrayEquals(expected, sol.plusOne(digits));
    }

    @Test
    public void testExample2() {
        int[] digits = {4,3,2,1};
        int[] expected = {4,3,2,2};
        assertArrayEquals(expected, sol.plusOne(digits));
    }

    @Test
    public void testExample3() {
        int[] digits = {0};
        int[] expected = {1};
        assertArrayEquals(expected, sol.plusOne(digits));
    }

    @Test
    public void testMoveUpOnce() {
        int[] digits = {9};
        int[] expected = {1,0};
        assertArrayEquals(expected, sol.plusOne(digits));
    }

    @Test
    public void testMoveUp() {
        int[] digits = {1,9};
        int[] expected = {2,0};
        assertArrayEquals(expected, sol.plusOne(digits));
    }

    @Test
    public void testMoveUpTwice() {
        int[] digits = {1,9,9};
        int[] expected = {2,0,0};
        assertArrayEquals(expected, sol.plusOne(digits));
    }

}
