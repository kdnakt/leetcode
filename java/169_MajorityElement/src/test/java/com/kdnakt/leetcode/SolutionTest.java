package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int[] nums = {3,2,3};
        assertEquals(3, sol.majorityElement(nums));
    }

    @Test
    public void testExample2() {
        int[] nums = {2,2,1,1,1,2,2};
        assertEquals(2, sol.majorityElement(nums));
    }

    @Test
    public void testFailed1() {
        int[] nums = {-1,1,1,1,2,1};
        assertEquals(1, sol.majorityElement(nums));
    }

}
