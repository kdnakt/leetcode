package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int[] score = {5,4,3,2,1};
        String[] expected = {"Gold Medal","Silver Medal","Bronze Medal","4","5"};
        assertArrayEquals(expected, sol.findRelativeRanks(score));
    }

    @Test
    public void testExample2() {
        int[] score = {10,3,8,9,4};
        String[] expected = {"Gold Medal","5","Bronze Medal","Silver Medal","4"};
        assertArrayEquals(expected, sol.findRelativeRanks(score));
    }

}
