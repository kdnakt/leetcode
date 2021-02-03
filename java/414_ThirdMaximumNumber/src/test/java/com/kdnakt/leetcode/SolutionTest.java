package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int[] nums = {3,2,1};
        assertEquals(1, sol.thirdMax(nums));
    }

    @Test
    public void testExample2() {
        int[] nums = {1,2};
        assertEquals(2, sol.thirdMax(nums));
    }

    @Test
    public void testExample3() {
        int[] nums = {2,2,3,1};
        assertEquals(1, sol.thirdMax(nums));
    }

    @Test
    public void testExample4() {
        int[] nums = {2,2,1};
        assertEquals(2, sol.thirdMax(nums));
    }

    @Test
    public void testExample5() {
        int[] nums = {1,1,2};
        assertEquals(2, sol.thirdMax(nums));
    }
}
