package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, sol.maxSubArray(nums));
    }

    @Test
    public void testExample2() {
        int[] nums = {1};
        assertEquals(1, sol.maxSubArray(nums));
    }

    @Test
    public void testExample3() {
        int[] nums = {0};
        assertEquals(0, sol.maxSubArray(nums));
    }

    @Test
    public void testExample4() {
        int[] nums = {-1};
        assertEquals(-1, sol.maxSubArray(nums));
    }

    @Test
    public void testExample5() {
        int[] nums = {-2147483647};
        assertEquals(-2147483647, sol.maxSubArray(nums));
    }

    @Test
    public void testZeroAndMinus() {
        int[] nums = {-1,0};
        assertEquals(0, sol.maxSubArray(nums));
    }

    @Test
    public void testMinuses() {
        int[] nums = {-1,-2};
        assertEquals(-1, sol.maxSubArray(nums));
    }

    @Test
    public void testFailed() {
        int[] nums = {8,-19,5,-4,20};
        assertEquals(21, sol.maxSubArray(nums));
    }

}
