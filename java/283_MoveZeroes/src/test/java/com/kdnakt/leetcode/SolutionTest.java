package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        int[] nums = {0,1,0,3,12};
        int[] expected = {1,3,12,0,0};
        sol.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testExample2() {
        int[] nums = {1,2};
        int[] expected = {1,2};
        sol.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }
}
