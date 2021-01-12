package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int[] nums = {3,0,1};
        assertEquals(2, sol.missingNumber(nums));
    }

    @Test
    public void testExample2() {
        int[] nums = {0,1};
        assertEquals(2, sol.missingNumber(nums));
    }

    @Test
    public void testExample3() {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        assertEquals(8, sol.missingNumber(nums));
    }

    @Test
    public void testExample4() {
        int[] nums = {0};
        assertEquals(1, sol.missingNumber(nums));
    }

    @Test
    public void testExample5() {
        int[] nums = {1};
        assertEquals(0, sol.missingNumber(nums));
    }
}
