package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int[] nums = {1,2,3};
        int expected = 6;
        assertEquals(expected, sol.maximumProduct(nums));
    }

    @Test
    public void testExample2() {
        int[] nums = {1,2,3,4};
        int expected = 24;
        assertEquals(expected, sol.maximumProduct(nums));
    }

    @Test
    public void testExample3() {
        int[] nums = {-1,-2,-3};
        int expected = -6;
        assertEquals(expected, sol.maximumProduct(nums));
    }

    @Test
    public void testExample4() {
        int[] nums = {-100,-98,-1,2,3,4};
        int expected = 39200;
        assertEquals(expected, sol.maximumProduct(nums));
    }

}
