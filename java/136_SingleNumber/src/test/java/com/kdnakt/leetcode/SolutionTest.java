package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int[] nums = {2,2,1};
        assertEquals(1, sol.singleNumber(nums));
    }

    @Test
    public void testExample2() {
        int[] nums = {4,1,2,1,2};
        assertEquals(4, sol.singleNumber(nums));
    }
}
